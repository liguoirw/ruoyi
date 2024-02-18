<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="姓名" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入姓名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="手机" prop="shouji">
        <el-input
          v-model="queryParams.shouji"
          placeholder="请输入手机"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="性别" prop="sex">
        <el-select v-model="queryParams.sex" placeholder="请选择性别" clearable>
          <el-option
            v-for="dict in dict.type.sys_user_sex"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="学历" prop="xueli">
        <el-input
          v-model="queryParams.xueli"
          placeholder="请输入学历"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="地址" prop="dizhi">
        <el-input
          v-model="queryParams.dizhi"
          placeholder="请输入地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注" prop="bak">
        <el-input
          v-model="queryParams.bak"
          placeholder="请输入备注"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="能力" prop="nengli">
        <el-input
          v-model="queryParams.nengli"
          placeholder="请输入能力"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="吃饭" prop="chifan">
        <el-input
          v-model="queryParams.chifan"
          placeholder="请输入吃饭"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注1" prop="bak1">
        <el-input
          v-model="queryParams.bak1"
          placeholder="请输入备注1"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="" prop="bak2">
        <el-input
          v-model="queryParams.bak2"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="" prop="bak3">
        <el-input
          v-model="queryParams.bak3"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="tupian">图片</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="jiekou">接口</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="jiekou1">接口</el-button>

      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:shoujiceshi:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:shoujiceshi:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:shoujiceshi:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:shoujiceshi:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="shoujiceshiList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="" align="center" prop="id" />
      <el-table-column label="姓名" align="center" prop="name" />
      <el-table-column label="手机" align="center" prop="shouji" />
      <el-table-column label="性别" align="center" prop="sex">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_user_sex" :value="scope.row.sex"/>
        </template>
      </el-table-column>
      <el-table-column label="学历" align="center" prop="xueli" />
      <el-table-column label="地址" align="center" prop="dizhi" />
      <el-table-column label="备注" align="center" prop="bak" />
      <el-table-column label="能力" align="center" prop="nengli" />
      <el-table-column label="吃饭" align="center" prop="chifan" />
      <el-table-column label="备注1" align="center" prop="bak1" />
      <el-table-column label="" align="center" prop="bak2" />
      <el-table-column label="" align="center" prop="bak3" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:shoujiceshi:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:shoujiceshi:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改shoujiceshi对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="姓名" prop="name">
          <el-input v-model="form.name" placeholder="请输入姓名" />
        </el-form-item>
        <el-form-item label="手机" prop="shouji">
          <el-input v-model="form.shouji" placeholder="请输入手机" />
        </el-form-item>
        <el-form-item label="性别" prop="sex">
          <el-radio-group v-model="form.sex">
            <el-radio
              v-for="dict in dict.type.sys_user_sex"
              :key="dict.value"
              :label="dict.value"
            >{{dict.label}}</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="学历" prop="xueli">
          <el-input v-model="form.xueli" placeholder="请输入学历" />
        </el-form-item>
        <el-form-item label="地址" prop="dizhi">
          <el-input v-model="form.dizhi" placeholder="请输入地址" />
        </el-form-item>
        <el-form-item label="备注" prop="bak">
          <el-input v-model="form.bak" placeholder="请输入备注" />
        </el-form-item>
        <el-form-item label="能力" prop="nengli">
          <el-input v-model="form.nengli" placeholder="请输入能力" />
        </el-form-item>
        <el-form-item label="吃饭" prop="chifan">
          <el-input v-model="form.chifan" placeholder="请输入吃饭" />
        </el-form-item>
        <el-form-item label="备注1" prop="bak1">
          <el-input v-model="form.bak1" placeholder="请输入备注1" />
        </el-form-item>
        <el-form-item label="" prop="bak2">
          <el-input v-model="form.bak2" placeholder="请输入" />
        </el-form-item>
        <el-form-item label="" prop="bak3">
          <el-input v-model="form.bak3" placeholder="请输入" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import {
  listShoujiceshi,
  getShoujiceshi,
  delShoujiceshi,
  addShoujiceshi,
  updateShoujiceshi,
  list2, list3,list4
} from "@/api/system/shoujiceshi";

export default {
  name: "Shoujiceshi",
  dicts: ['sys_user_sex'],
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // shoujiceshi表格数据
      shoujiceshiList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        name: null,
        shouji: null,
        sex: null,
        xueli: null,
        dizhi: null,
        bak: null,
        nengli: null,
        chifan: null,
        bak1: null,
        bak2: null,
        bak3: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询shoujiceshi列表 */
    getList() {
      this.loading = true;
      listShoujiceshi(this.queryParams).then(response => {
        console.log(response);
        this.shoujiceshiList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        name: null,
        shouji: null,
        sex: null,
        xueli: null,
        dizhi: null,
        bak: null,
        nengli: null,
        chifan: null,
        bak1: null,
        bak2: null,
        bak3: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    /** 重置按钮操作 */
    tupian() {
      list2(this.form).then(response => {
        console.log(this.response);
        this.$modal.msgSuccess("图片测试");

      });
    },
    jiekou() {
      list3(this.form).then(response => {


      });
    },
    jiekou1() {
      list4(this.form).then(response => {


      });
    },

    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加shoujiceshi";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getShoujiceshi(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改shoujiceshi";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateShoujiceshi(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addShoujiceshi(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除shoujiceshi编号为"' + ids + '"的数据项？').then(function() {
        return delShoujiceshi(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/shoujiceshi/export', {
        ...this.queryParams
      }, `shoujiceshi_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
