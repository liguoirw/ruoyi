<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="118px">
      <el-form-item label="品牌" prop="machineBrand">
        <el-input
          v-model="queryParams.machineBrand"
          placeholder="请输入品牌"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户名称" prop="merchantName">
        <el-input
          v-model="queryParams.merchantName"
          placeholder="请输入商户名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户号" prop="merchantId">
        <el-input
          v-model="queryParams.merchantId"
          placeholder="请输入商户号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="直属代理商名称" prop="underAgentName">
        <el-input
          v-model="queryParams.underAgentName"
          placeholder="请输入直属代理商名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="代理商电话" prop="merchantTel">
        <el-input
          v-model="queryParams.merchantTel"
          placeholder="请输入代理商电话"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="终端sn" prop="machineSN">
        <el-input
          v-model="queryParams.machineSN"
          placeholder="请输入终端sn"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="一代编号" prop="firLevAgentId">
        <el-input
          v-model="queryParams.firLevAgentId"
          placeholder="请输入一代编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交易金额" prop="transAmount">
        <el-input
          v-model="queryParams.transAmount"
          placeholder="请输入交易金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交易费率" prop="transFee">
        <el-input
          v-model="queryParams.transFee"
          placeholder="请输入交易费率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交易完成时间" prop="transTime">
        <el-date-picker clearable
          v-model="queryParams.transTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择交易完成时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="交易号" prop="transNo">
        <el-input
          v-model="queryParams.transNo"
          placeholder="请输入交易号"
          clearable
          @keyup.enter.native="handleQuery"
        />
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
          v-hasPermi="['system:transation:add']"
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
          v-hasPermi="['system:transation:edit']"
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
          v-hasPermi="['system:transation:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:transation:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="transationList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="交易编号" align="center" prop="transId" />
      <el-table-column label="品牌" align="center" prop="machineBrand" />
      <el-table-column label="商户名称" align="center" prop="merchantName" />
      <el-table-column label="商户号" align="center" prop="merchantId" />
      <el-table-column label="直属代理商名称" align="center" prop="underAgentName" />
      <el-table-column label="代理商电话" align="center" prop="merchantTel" />
      <el-table-column label="终端sn" align="center" prop="machineSN" />
      <el-table-column label="一代编号" align="center" prop="firLevAgentId" />
      <el-table-column label="交易金额" align="center" prop="transAmount" />
      <el-table-column label="交易费率" align="center" prop="transFee" />
      <el-table-column label="交易类型" align="center" prop="transType" />
      <el-table-column label="交易完成时间" align="center" prop="transTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.transTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="交易号" align="center" prop="transNo" />
      <el-table-column label="创建时间" align="center" prop="creatTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.creatTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:transation:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:transation:remove']"
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

    <!-- 添加或修改交易对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="品牌" prop="machineBrand">
          <el-input v-model="form.machineBrand" placeholder="请输入品牌" />
        </el-form-item>
        <el-form-item label="商户名称" prop="merchantName">
          <el-input v-model="form.merchantName" placeholder="请输入商户名称" />
        </el-form-item>
        <el-form-item label="商户号" prop="merchantId">
          <el-input v-model="form.merchantId" placeholder="请输入商户号" />
        </el-form-item>
        <el-form-item label="直属代理商名称" prop="underAgentName">
          <el-input v-model="form.underAgentName" placeholder="请输入直属代理商名称" />
        </el-form-item>
        <el-form-item label="代理商电话" prop="merchantTel">
          <el-input v-model="form.merchantTel" placeholder="请输入代理商电话" />
        </el-form-item>
        <el-form-item label="终端sn" prop="machineSN">
          <el-input v-model="form.machineSN" placeholder="请输入终端sn" />
        </el-form-item>
        <el-form-item label="一代编号" prop="firLevAgentId">
          <el-input v-model="form.firLevAgentId" placeholder="请输入一代编号" />
        </el-form-item>
        <el-form-item label="交易金额" prop="transAmount">
          <el-input v-model="form.transAmount" placeholder="请输入交易金额" />
        </el-form-item>
        <el-form-item label="交易费率" prop="transFee">
          <el-input v-model="form.transFee" placeholder="请输入交易费率" />
        </el-form-item>
        <el-form-item label="交易完成时间" prop="transTime">
          <el-date-picker clearable
            v-model="form.transTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择交易完成时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="交易号" prop="transNo">
          <el-input v-model="form.transNo" placeholder="请输入交易号" />
        </el-form-item>
        <el-form-item label="创建时间" prop="creatTime">
          <el-date-picker clearable
            v-model="form.creatTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择创建时间">
          </el-date-picker>
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
import { listTransation, getTransation, delTransation, addTransation, updateTransation } from "@/api/system/transation";

export default {
  name: "Transation",
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
      // 交易表格数据
      transationList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        machineBrand: null,
        merchantName: null,
        merchantId: null,
        underAgentName: null,
        merchantTel: null,
        machineSN: null,
        firLevAgentId: null,
        transAmount: null,
        transFee: null,
        transType: null,
        transTime: null,
        transNo: null,
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
    /** 查询交易列表 */
    getList() {
      this.loading = true;
      listTransation(this.queryParams).then(response => {
        this.transationList = response.rows;
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
        transId: null,
        machineBrand: null,
        merchantName: null,
        merchantId: null,
        underAgentName: null,
        merchantTel: null,
        machineSN: null,
        firLevAgentId: null,
        transAmount: null,
        transFee: null,
        transType: null,
        transTime: null,
        transNo: null,
        creatTime: null
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
      this.ids = selection.map(item => item.transId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加交易";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const transId = row.transId || this.ids
      getTransation(transId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改交易";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.transId != null) {
            updateTransation(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addTransation(this.form).then(response => {
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
      const transIds = row.transId || this.ids;
      this.$modal.confirm('是否确认删除交易编号为"' + transIds + '"的数据项？').then(function() {
        return delTransation(transIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/transation/export', {
        ...this.queryParams
      }, `transation_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
