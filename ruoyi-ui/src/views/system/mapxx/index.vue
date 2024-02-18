<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryRef" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="经" prop="jing">
        <el-input
          v-model="queryParams.jing"
          placeholder="请输入经"
          clearable
          @keyup.enter="handleQuery"
        />
      </el-form-item>
      <el-form-item label="纬" prop="wei">
        <el-input
          v-model="queryParams.wei"
          placeholder="请输入纬"
          clearable
          @keyup.enter="handleQuery"
        />
      </el-form-item>
      <el-form-item label="图片" prop="tupian">
        <el-input
          v-model="queryParams.tupian"
          placeholder="请输入图片"
          clearable
          @keyup.enter="handleQuery"
        />
      </el-form-item>
      <el-form-item label="地址" prop="dizhi">
        <el-input
          v-model="queryParams.dizhi"
          placeholder="请输入地址"
          clearable
          @keyup.enter="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="Search" @click="handleQuery">搜索</el-button>
        <el-button icon="Refresh" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="Plus"
          @click="handleAdd"
          v-hasPermi="['system:mapxx:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="Edit"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:mapxx:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="Delete"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:mapxx:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="Download"
          @click="handleExport"
          v-hasPermi="['system:mapxx:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar v-model:showSearch="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="mapxxList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="" align="center" prop="id" />
      <el-table-column label="经" align="center" prop="jing" />
      <el-table-column label="纬" align="center" prop="wei" />
      <el-table-column label="图片" align="center" prop="tupian" />
      <el-table-column label="地址" align="center" prop="dizhi" />
      <el-table-column label="备注" align="center" prop="bak" />
      <el-table-column label="状态" align="center" prop="status" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template #default="scope">
          <el-button link type="primary" icon="Edit" @click="handleUpdate(scope.row)" v-hasPermi="['system:mapxx:edit']">修改</el-button>
          <el-button link type="primary" icon="Delete" @click="handleDelete(scope.row)" v-hasPermi="['system:mapxx:remove']">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      v-model:page="queryParams.pageNum"
      v-model:limit="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改地图信息对话框 -->
    <el-dialog :title="title" v-model="open" width="500px" append-to-body>
      <el-form ref="mapxxRef" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="经" prop="jing">
          <el-input v-model="form.jing" placeholder="请输入经" />
        </el-form-item>
        <el-form-item label="纬" prop="wei">
          <el-input v-model="form.wei" placeholder="请输入纬" />
        </el-form-item>
        <el-form-item label="图片" prop="tupian">
          <el-input v-model="form.tupian" placeholder="请输入图片" />
        </el-form-item>
        <el-form-item label="地址" prop="dizhi">
          <el-input v-model="form.dizhi" placeholder="请输入地址" />
        </el-form-item>
        <el-form-item label="备注" prop="bak">
          <el-input v-model="form.bak" type="textarea" placeholder="请输入内容" />
        </el-form-item>
      </el-form>
      <template #footer>
        <div class="dialog-footer">
          <el-button type="primary" @click="submitForm">确 定</el-button>
          <el-button @click="cancel">取 消</el-button>
        </div>
      </template>
    </el-dialog>
  </div>
</template>

<script setup name="Mapxx">
import { listMapxx, getMapxx, delMapxx, addMapxx, updateMapxx } from "@/api/system/mapxx";

const { proxy } = getCurrentInstance();

const mapxxList = ref([]);
const open = ref(false);
const loading = ref(true);
const showSearch = ref(true);
const ids = ref([]);
const single = ref(true);
const multiple = ref(true);
const total = ref(0);
const title = ref("");

const data = reactive({
  form: {},
  queryParams: {
    pageNum: 1,
    pageSize: 10,
    jing: null,
    wei: null,
    tupian: null,
    dizhi: null,
    bak: null,
    status: null
  },
  rules: {
  }
});

const { queryParams, form, rules } = toRefs(data);

/** 查询地图信息列表 */
function getList() {
  loading.value = true;
  listMapxx(queryParams.value).then(response => {
    mapxxList.value = response.rows;
    total.value = response.total;
    loading.value = false;
  });
}

// 取消按钮
function cancel() {
  open.value = false;
  reset();
}

// 表单重置
function reset() {
  form.value = {
    id: null,
    jing: null,
    wei: null,
    tupian: null,
    dizhi: null,
    bak: null,
    status: null
  };
  proxy.resetForm("mapxxRef");
}

/** 搜索按钮操作 */
function handleQuery() {
  queryParams.value.pageNum = 1;
  getList();
}

/** 重置按钮操作 */
function resetQuery() {
  proxy.resetForm("queryRef");
  handleQuery();
}

// 多选框选中数据
function handleSelectionChange(selection) {
  ids.value = selection.map(item => item.id);
  single.value = selection.length != 1;
  multiple.value = !selection.length;
}

/** 新增按钮操作 */
function handleAdd() {
  reset();
  open.value = true;
  title.value = "添加地图信息";
}

/** 修改按钮操作 */
function handleUpdate(row) {
  reset();
  const _id = row.id || ids.value
  getMapxx(_id).then(response => {
    form.value = response.data;
    open.value = true;
    title.value = "修改地图信息";
  });
}

/** 提交按钮 */
function submitForm() {
  proxy.$refs["mapxxRef"].validate(valid => {
    if (valid) {
      if (form.value.id != null) {
        updateMapxx(form.value).then(response => {
          proxy.$modal.msgSuccess("修改成功");
          open.value = false;
          getList();
        });
      } else {
        addMapxx(form.value).then(response => {
          proxy.$modal.msgSuccess("新增成功");
          open.value = false;
          getList();
        });
      }
    }
  });
}

/** 删除按钮操作 */
function handleDelete(row) {
  const _ids = row.id || ids.value;
  proxy.$modal.confirm('是否确认删除地图信息编号为"' + _ids + '"的数据项？').then(function() {
    return delMapxx(_ids);
  }).then(() => {
    getList();
    proxy.$modal.msgSuccess("删除成功");
  }).catch(() => {});
}

/** 导出按钮操作 */
function handleExport() {
  proxy.download('system/mapxx/export', {
    ...queryParams.value
  }, `mapxx_${new Date().getTime()}.xlsx`)
}

getList();
</script>
