<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="品牌" prop="brand">
        <el-input
          v-model="queryParams.brand"
          placeholder="请输入品牌"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="当前代理/创建人" prop="founder">
        <el-input
          v-model="queryParams.founder"
          placeholder="请输入当前代理/创建人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="模板名称" prop="templateName">
        <el-input
          v-model="queryParams.templateName"
          placeholder="请输入模板名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金控特惠费率" prop="jkthRate">
        <el-input
          v-model="queryParams.jkthRate"
          placeholder="请输入金控特惠费率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="快捷支付费率" prop="kjzfRate">
        <el-input
          v-model="queryParams.kjzfRate"
          placeholder="请输入快捷支付费率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金控刷卡费率" prop="jkskRate">
        <el-input
          v-model="queryParams.jkskRate"
          placeholder="请输入金控刷卡费率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金控单笔" prop="jkDb">
        <el-input
          v-model="queryParams.jkDb"
          placeholder="请输入金控单笔"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金控借记卡封顶" prop="jkDebitCardCap">
        <el-input
          v-model="queryParams.jkDebitCardCap"
          placeholder="请输入金控借记卡封顶"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金控扫码费率" prop="jksmRate">
        <el-input
          v-model="queryParams.jksmRate"
          placeholder="请输入金控扫码费率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="扫码T1费率(%)(废弃)" prop="smT1Rate">
        <el-input
          v-model="queryParams.smT1Rate"
          placeholder="请输入扫码T1费率(%)(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="扫码D0费率(%)(废弃)" prop="smD0Rate">
        <el-input
          v-model="queryParams.smD0Rate"
          placeholder="请输入扫码D0费率(%)(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="智慧服务手续费(%)(废弃)" prop="zhfwCommission">
        <el-input
          v-model="queryParams.zhfwCommission"
          placeholder="请输入智慧服务手续费(%)(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="智慧交易手续费封顶(废弃)" prop="zhjyCommissionCap">
        <el-input
          v-model="queryParams.zhjyCommissionCap"
          placeholder="请输入智慧交易手续费封顶(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="智慧交易手续费单笔(废弃)" prop="zhjyCommissionSingle">
        <el-input
          v-model="queryParams.zhjyCommissionSingle"
          placeholder="请输入智慧交易手续费单笔(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="普通交易手续费率(废弃)" prop="ptjyCommissionRate">
        <el-input
          v-model="queryParams.ptjyCommissionRate"
          placeholder="请输入普通交易手续费率(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="普通交易手续费单笔(废弃)" prop="ptjyCommissionSingle">
        <el-input
          v-model="queryParams.ptjyCommissionSingle"
          placeholder="请输入普通交易手续费单笔(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="普通交易手续费封顶(废弃)" prop="ptjyCommissionCap">
        <el-input
          v-model="queryParams.ptjyCommissionCap"
          placeholder="请输入普通交易手续费封顶(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="小额手续费费率(%)(废弃)" prop="smallCommissionRate">
        <el-input
          v-model="queryParams.smallCommissionRate"
          placeholder="请输入小额手续费费率(%)(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="小额单笔(废弃)" prop="smallSingle">
        <el-input
          v-model="queryParams.smallSingle"
          placeholder="请输入小额单笔(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="小额T1费率(%)(废弃)" prop="smallT1Rate">
        <el-input
          v-model="queryParams.smallT1Rate"
          placeholder="请输入小额T1费率(%)(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="智慧交易T1费率(%)(废弃)" prop="zhjyT1Rate">
        <el-input
          v-model="queryParams.zhjyT1Rate"
          placeholder="请输入智慧交易T1费率(%)(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="普通交易T1费率(废弃)(%)" prop="ptjyTiRate">
        <el-input
          v-model="queryParams.ptjyTiRate"
          placeholder="请输入普通交易T1费率(废弃)(%)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="快捷支付单笔(废弃)" prop="kjzfSingle">
        <el-input
          v-model="queryParams.kjzfSingle"
          placeholder="请输入快捷支付单笔(废弃)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建时间" prop="creationTime">
        <el-date-picker clearable
          v-model="queryParams.creationTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择创建时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="备注1" prop="note1">
        <el-input
          v-model="queryParams.note1"
          placeholder="请输入备注1"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注2" prop="note2">
        <el-input
          v-model="queryParams.note2"
          placeholder="请输入备注2"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注3" prop="note3">
        <el-input
          v-model="queryParams.note3"
          placeholder="请输入备注3"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注4" prop="note4">
        <el-input
          v-model="queryParams.note4"
          placeholder="请输入备注4"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注5" prop="note5">
        <el-input
          v-model="queryParams.note5"
          placeholder="请输入备注5"
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
          v-hasPermi="['system:templatejs_jk:add']"
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
          v-hasPermi="['system:templatejs_jk:edit']"
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
          v-hasPermi="['system:templatejs_jk:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:templatejs_jk:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="templatejs_jkList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="id" align="center" prop="id" />
      <el-table-column label="品牌" align="center" prop="brand" />
      <el-table-column label="当前代理/创建人" align="center" prop="founder" />
      <el-table-column label="模板名称" align="center" prop="templateName" />
      <el-table-column label="金控特惠费率" align="center" prop="jkthRate" />
      <el-table-column label="快捷支付费率" align="center" prop="kjzfRate" />
      <el-table-column label="金控刷卡费率" align="center" prop="jkskRate" />
      <el-table-column label="金控单笔" align="center" prop="jkDb" />
      <el-table-column label="金控借记卡封顶" align="center" prop="jkDebitCardCap" />
      <el-table-column label="金控扫码费率" align="center" prop="jksmRate" />
      <el-table-column label="扫码T1费率(%)(废弃)" align="center" prop="smT1Rate" />
      <el-table-column label="扫码D0费率(%)(废弃)" align="center" prop="smD0Rate" />
      <el-table-column label="智慧服务手续费(%)(废弃)" align="center" prop="zhfwCommission" />
      <el-table-column label="智慧交易手续费封顶(废弃)" align="center" prop="zhjyCommissionCap" />
      <el-table-column label="智慧交易手续费单笔(废弃)" align="center" prop="zhjyCommissionSingle" />
      <el-table-column label="普通交易手续费率(废弃)" align="center" prop="ptjyCommissionRate" />
      <el-table-column label="普通交易手续费单笔(废弃)" align="center" prop="ptjyCommissionSingle" />
      <el-table-column label="普通交易手续费封顶(废弃)" align="center" prop="ptjyCommissionCap" />
      <el-table-column label="小额手续费费率(%)(废弃)" align="center" prop="smallCommissionRate" />
      <el-table-column label="小额单笔(废弃)" align="center" prop="smallSingle" />
      <el-table-column label="小额T1费率(%)(废弃)" align="center" prop="smallT1Rate" />
      <el-table-column label="智慧交易T1费率(%)(废弃)" align="center" prop="zhjyT1Rate" />
      <el-table-column label="普通交易T1费率(废弃)(%)" align="center" prop="ptjyTiRate" />
      <el-table-column label="快捷支付单笔(废弃)" align="center" prop="kjzfSingle" />
      <el-table-column label="创建时间" align="center" prop="creationTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.creationTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="备注1" align="center" prop="note1" />
      <el-table-column label="备注2" align="center" prop="note2" />
      <el-table-column label="备注3" align="center" prop="note3" />
      <el-table-column label="备注4" align="center" prop="note4" />
      <el-table-column label="备注5" align="center" prop="note5" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:templatejs_jk:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:templatejs_jk:remove']"
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

    <!-- 添加或修改金控对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="品牌" prop="brand">
          <el-input v-model="form.brand" placeholder="请输入品牌" />
        </el-form-item>
        <el-form-item label="当前代理/创建人" prop="founder">
          <el-input v-model="form.founder" placeholder="请输入当前代理/创建人" />
        </el-form-item>
        <el-form-item label="模板名称" prop="templateName">
          <el-input v-model="form.templateName" placeholder="请输入模板名称" />
        </el-form-item>
        <el-form-item label="金控特惠费率" prop="jkthRate">
          <el-input v-model="form.jkthRate" placeholder="请输入金控特惠费率" />
        </el-form-item>
        <el-form-item label="快捷支付费率" prop="kjzfRate">
          <el-input v-model="form.kjzfRate" placeholder="请输入快捷支付费率" />
        </el-form-item>
        <el-form-item label="金控刷卡费率" prop="jkskRate">
          <el-input v-model="form.jkskRate" placeholder="请输入金控刷卡费率" />
        </el-form-item>
        <el-form-item label="金控单笔" prop="jkDb">
          <el-input v-model="form.jkDb" placeholder="请输入金控单笔" />
        </el-form-item>
        <el-form-item label="金控借记卡封顶" prop="jkDebitCardCap">
          <el-input v-model="form.jkDebitCardCap" placeholder="请输入金控借记卡封顶" />
        </el-form-item>
        <el-form-item label="金控扫码费率" prop="jksmRate">
          <el-input v-model="form.jksmRate" placeholder="请输入金控扫码费率" />
        </el-form-item>
        <el-form-item label="扫码T1费率(%)(废弃)" prop="smT1Rate">
          <el-input v-model="form.smT1Rate" placeholder="请输入扫码T1费率(%)(废弃)" />
        </el-form-item>
        <el-form-item label="扫码D0费率(%)(废弃)" prop="smD0Rate">
          <el-input v-model="form.smD0Rate" placeholder="请输入扫码D0费率(%)(废弃)" />
        </el-form-item>
        <el-form-item label="智慧服务手续费(%)(废弃)" prop="zhfwCommission">
          <el-input v-model="form.zhfwCommission" placeholder="请输入智慧服务手续费(%)(废弃)" />
        </el-form-item>
        <el-form-item label="智慧交易手续费封顶(废弃)" prop="zhjyCommissionCap">
          <el-input v-model="form.zhjyCommissionCap" placeholder="请输入智慧交易手续费封顶(废弃)" />
        </el-form-item>
        <el-form-item label="智慧交易手续费单笔(废弃)" prop="zhjyCommissionSingle">
          <el-input v-model="form.zhjyCommissionSingle" placeholder="请输入智慧交易手续费单笔(废弃)" />
        </el-form-item>
        <el-form-item label="普通交易手续费率(废弃)" prop="ptjyCommissionRate">
          <el-input v-model="form.ptjyCommissionRate" placeholder="请输入普通交易手续费率(废弃)" />
        </el-form-item>
        <el-form-item label="普通交易手续费单笔(废弃)" prop="ptjyCommissionSingle">
          <el-input v-model="form.ptjyCommissionSingle" placeholder="请输入普通交易手续费单笔(废弃)" />
        </el-form-item>
        <el-form-item label="普通交易手续费封顶(废弃)" prop="ptjyCommissionCap">
          <el-input v-model="form.ptjyCommissionCap" placeholder="请输入普通交易手续费封顶(废弃)" />
        </el-form-item>
        <el-form-item label="小额手续费费率(%)(废弃)" prop="smallCommissionRate">
          <el-input v-model="form.smallCommissionRate" placeholder="请输入小额手续费费率(%)(废弃)" />
        </el-form-item>
        <el-form-item label="小额单笔(废弃)" prop="smallSingle">
          <el-input v-model="form.smallSingle" placeholder="请输入小额单笔(废弃)" />
        </el-form-item>
        <el-form-item label="小额T1费率(%)(废弃)" prop="smallT1Rate">
          <el-input v-model="form.smallT1Rate" placeholder="请输入小额T1费率(%)(废弃)" />
        </el-form-item>
        <el-form-item label="智慧交易T1费率(%)(废弃)" prop="zhjyT1Rate">
          <el-input v-model="form.zhjyT1Rate" placeholder="请输入智慧交易T1费率(%)(废弃)" />
        </el-form-item>
        <el-form-item label="普通交易T1费率(废弃)(%)" prop="ptjyTiRate">
          <el-input v-model="form.ptjyTiRate" placeholder="请输入普通交易T1费率(废弃)(%)" />
        </el-form-item>
        <el-form-item label="快捷支付单笔(废弃)" prop="kjzfSingle">
          <el-input v-model="form.kjzfSingle" placeholder="请输入快捷支付单笔(废弃)" />
        </el-form-item>
        <el-form-item label="创建时间" prop="creationTime">
          <el-date-picker clearable
            v-model="form.creationTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择创建时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="备注1" prop="note1">
          <el-input v-model="form.note1" placeholder="请输入备注1" />
        </el-form-item>
        <el-form-item label="备注2" prop="note2">
          <el-input v-model="form.note2" placeholder="请输入备注2" />
        </el-form-item>
        <el-form-item label="备注3" prop="note3">
          <el-input v-model="form.note3" placeholder="请输入备注3" />
        </el-form-item>
        <el-form-item label="备注4" prop="note4">
          <el-input v-model="form.note4" placeholder="请输入备注4" />
        </el-form-item>
        <el-form-item label="备注5" prop="note5">
          <el-input v-model="form.note5" placeholder="请输入备注5" />
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
import { listTemplatejs_jk, getTemplatejs_jk, delTemplatejs_jk, addTemplatejs_jk, updateTemplatejs_jk } from "@/api/system/templatejs_jk";

export default {
  name: "Templatejs_jk",
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
      // 金控表格数据
      templatejs_jkList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        brand: null,
        founder: null,
        templateName: null,
        jkthRate: null,
        kjzfRate: null,
        jkskRate: null,
        jkDb: null,
        jkDebitCardCap: null,
        jksmRate: null,
        smT1Rate: null,
        smD0Rate: null,
        zhfwCommission: null,
        zhjyCommissionCap: null,
        zhjyCommissionSingle: null,
        ptjyCommissionRate: null,
        ptjyCommissionSingle: null,
        ptjyCommissionCap: null,
        smallCommissionRate: null,
        smallSingle: null,
        smallT1Rate: null,
        zhjyT1Rate: null,
        ptjyTiRate: null,
        kjzfSingle: null,
        creationTime: null,
        note1: null,
        note2: null,
        note3: null,
        note4: null,
        note5: null
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
    /** 查询金控列表 */
    getList() {
      this.loading = true;
      listTemplatejs_jk(this.queryParams).then(response => {
        this.templatejs_jkList = response.rows;
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
        brand: null,
        founder: null,
        templateName: null,
        jkthRate: null,
        kjzfRate: null,
        jkskRate: null,
        jkDb: null,
        jkDebitCardCap: null,
        jksmRate: null,
        smT1Rate: null,
        smD0Rate: null,
        zhfwCommission: null,
        zhjyCommissionCap: null,
        zhjyCommissionSingle: null,
        ptjyCommissionRate: null,
        ptjyCommissionSingle: null,
        ptjyCommissionCap: null,
        smallCommissionRate: null,
        smallSingle: null,
        smallT1Rate: null,
        zhjyT1Rate: null,
        ptjyTiRate: null,
        kjzfSingle: null,
        creationTime: null,
        updateTime: null,
        note1: null,
        note2: null,
        note3: null,
        note4: null,
        note5: null
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
      this.title = "添加金控";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getTemplatejs_jk(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改金控";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateTemplatejs_jk(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addTemplatejs_jk(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除金控编号为"' + ids + '"的数据项？').then(function() {
        return delTemplatejs_jk(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/templatejs_jk/export', {
        ...this.queryParams
      }, `templatejs_jk_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
