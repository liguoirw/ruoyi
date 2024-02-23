<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="SN" prop="sn">
        <el-input
          v-model="queryParams.sn"
          placeholder="请输入SN"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="品牌" prop="brandId">
        <el-input
          v-model="queryParams.brandId"
          placeholder="请输入品牌"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户号" prop="merchantNum">
        <el-input
          v-model="queryParams.merchantNum"
          placeholder="请输入商户号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品名称" prop="merchantName">
        <el-input
          v-model="queryParams.merchantName"
          placeholder="请输入商品名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="冻结结果" prop="state">
        <el-select v-model="queryParams.state" placeholder="请选择冻结结果" clearable>
          <el-option
            v-for="dict in dict.type.jieguo"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="回执号" prop="receiptNum">
        <el-input
          v-model="queryParams.receiptNum"
          placeholder="请输入回执号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="流水号" prop="serialNum">
        <el-input
          v-model="queryParams.serialNum"
          placeholder="请输入流水号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金额" prop="money">
        <el-input
          v-model="queryParams.money"
          placeholder="请输入金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建时间" prop="createTime">
        <el-date-picker clearable
          v-model="queryParams.createTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择创建时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
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
          v-hasPermi="['system:charge:add']"
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
          v-hasPermi="['system:charge:edit']"
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
          v-hasPermi="['system:charge:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:charge:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="chargeList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="ID" align="center" prop="id" />
      <el-table-column label="SN" align="center" prop="sn" />
      <el-table-column label="品牌" align="center" prop="brandId" />
      <el-table-column label="商户号" align="center" prop="merchantNum" />
      <el-table-column label="商品名称" align="center" prop="merchantName" />
      <el-table-column label="冻结结果" align="center" prop="state">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.jieguo" :value="scope.row.state"/>
        </template>
      </el-table-column>
      <el-table-column label="回执号" align="center" prop="receiptNum" />
      <el-table-column label="流水号" align="center" prop="serialNum" />
      <el-table-column label="冻结项目" align="center" prop="freezeItems" />
      <el-table-column label="金额" align="center" prop="money" />
      <el-table-column label="创建时间" align="center" prop="createTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:charge:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:charge:remove']"
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

    <!-- 添加或修改服务费冻结记录对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="SN" prop="sn">
          <el-input v-model="form.sn" placeholder="请输入SN" />
        </el-form-item>
        <el-form-item label="品牌" prop="brandId">
          <el-input v-model="form.brandId" placeholder="请输入品牌" />
        </el-form-item>
        <el-form-item label="商户号" prop="merchantNum">
          <el-input v-model="form.merchantNum" placeholder="请输入商户号" />
        </el-form-item>
        <el-form-item label="商品名称" prop="merchantName">
          <el-input v-model="form.merchantName" placeholder="请输入商品名称" />
        </el-form-item>
        <el-form-item label="冻结结果" prop="state">
          <el-select v-model="form.state" placeholder="请选择冻结结果">
            <el-option
              v-for="dict in dict.type.jieguo"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="回执号" prop="receiptNum">
          <el-input v-model="form.receiptNum" placeholder="请输入回执号" />
        </el-form-item>
        <el-form-item label="流水号" prop="serialNum">
          <el-input v-model="form.serialNum" placeholder="请输入流水号" />
        </el-form-item>
        <el-form-item label="冻结项目" prop="freezeItems">
          <el-input v-model="form.freezeItems" placeholder="请输入冻结项目" />
        </el-form-item>
        <el-form-item label="金额" prop="money">
          <el-input v-model="form.money" placeholder="请输入金额" />
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
import { listCharge, getCharge, delCharge, addCharge, updateCharge } from "@/api/system/charge";

export default {
  name: "Charge",
  dicts: ['jieguo'],
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
      // 服务费冻结记录表格数据
      chargeList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        id: null,
        sn: null,
        brandId: null,
        merchantNum: null,
        merchantName: null,
        state: null,
        receiptNum: null, 
        serialNum: null,
        freezeItems: null,
        money: null,
        createTime: null,
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
    /** 查询服务费冻结记录列表 */
    getList() {
      this.loading = true;
      listCharge(this.queryParams).then(response => {
        this.chargeList = response.rows;
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
        sn: null,
        brandId: null,
        merchantNum: null,
        merchantName: null,
        state: null,
        receiptNum: null,
        serialNum: null,
        freezeItems: null,
        money: null,
        createTime: null,
        updateTime: null,
        id1: null,
        ceshi: null,
        ceshi1: null,
        ceshi2: null,
        ceshi3: null,
        ceshi4: null,
        ceshi5: null,
        ceshi6: null,
        ceshi7: null
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
      this.title = "添加服务费冻结记录";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getCharge(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改服务费冻结记录";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateCharge(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addCharge(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除服务费冻结记录编号为"' + ids + '"的数据项？').then(function() {
        return delCharge(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/charge/export', {
        ...this.queryParams
      }, `charge_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
