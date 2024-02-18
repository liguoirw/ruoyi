<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="交易通知配置机构号" prop="configAgentId">
        <el-input
          v-model="queryParams.configAgentId"
          placeholder="请输入交易通知配置机构号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交易通知推送批次号" prop="sendBatchNo">
        <el-input
          v-model="queryParams.sendBatchNo"
          placeholder="请输入交易通知推送批次号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据的推送条数" prop="sendNum">
        <el-input
          v-model="queryParams.sendNum"
          placeholder="请输入数据的推送条数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据的推送时间" prop="sendTime">
        <el-input
          v-model="queryParams.sendTime"
          placeholder="请输入数据的推送时间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交易日期" prop="transDate">
        <el-input
          v-model="queryParams.transDate"
          placeholder="请输入交易日期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="签名" prop="sign">
        <el-input
          v-model="queryParams.sign"
          placeholder="请输入签名"
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
          v-hasPermi="['system:jytzz:add']"
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
          v-hasPermi="['system:jytzz:edit']"
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
          v-hasPermi="['system:jytzz:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:jytzz:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="jytzzList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="" align="center" prop="id" />
      <el-table-column label="交易通知配置机构号" align="center" prop="configAgentId" />
      <el-table-column label="交易通知推送批次号" align="center" prop="sendBatchNo" />
      <el-table-column label="数据的推送条数" align="center" prop="sendNum" />
      <el-table-column label="数据的推送时间" align="center" prop="sendTime" />
      <el-table-column label="交易日期" align="center" prop="transDate" />
      <el-table-column label="签名" align="center" prop="sign" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:jytzz:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:jytzz:remove']"
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

    <!-- 添加或修改交易通知主对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="交易通知配置机构号" prop="configAgentId">
          <el-input v-model="form.configAgentId" placeholder="请输入交易通知配置机构号" />
        </el-form-item>
        <el-form-item label="交易通知推送批次号" prop="sendBatchNo">
          <el-input v-model="form.sendBatchNo" placeholder="请输入交易通知推送批次号" />
        </el-form-item>
        <el-form-item label="数据的推送条数" prop="sendNum">
          <el-input v-model="form.sendNum" placeholder="请输入数据的推送条数" />
        </el-form-item>
        <el-form-item label="数据的推送时间" prop="sendTime">
          <el-input v-model="form.sendTime" placeholder="请输入数据的推送时间" />
        </el-form-item>
        <el-form-item label="交易日期" prop="transDate">
          <el-input v-model="form.transDate" placeholder="请输入交易日期" />
        </el-form-item>
        <el-form-item label="签名" prop="sign">
          <el-input v-model="form.sign" placeholder="请输入签名" />
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
import { listJytzz, getJytzz, delJytzz, addJytzz, updateJytzz } from "@/api/system/jytzz";

export default {
  name: "Jytzz",
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
      // 交易通知主表格数据
      jytzzList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        configAgentId: null,
        sendBatchNo: null,
        sendNum: null,
        sendTime: null,
        transDate: null,
        sign: null
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
    /** 查询交易通知主列表 */
    getList() {
      this.loading = true;
      listJytzz(this.queryParams).then(response => {
        this.jytzzList = response.rows;
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
        configAgentId: null,
        sendBatchNo: null,
        sendNum: null,
        sendTime: null,
        transDate: null,
        sign: null
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
      this.title = "添加交易通知主";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getJytzz(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改交易通知主";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateJytzz(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addJytzz(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除交易通知主编号为"' + ids + '"的数据项？').then(function() {
        return delJytzz(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/jytzz/export', {
        ...this.queryParams
      }, `jytzz_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
