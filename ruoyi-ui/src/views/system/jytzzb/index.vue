<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="" prop="fid">
        <el-input
          v-model="queryParams.fid"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="收单平台应答描述" prop="sysRespDesc">
        <el-input
          v-model="queryParams.sysRespDesc"
          placeholder="请输入收单平台应答描述"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户直属机构号" prop="agentId">
        <el-input
          v-model="queryParams.agentId"
          placeholder="请输入商户直属机构号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交易金额" prop="amount">
        <el-input
          v-model="queryParams.amount"
          placeholder="请输入交易金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="终端批次号②" prop="batchNo">
        <el-input
          v-model="queryParams.batchNo"
          placeholder="请输入终端批次号②"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="授权码" prop="authCode">
        <el-input
          v-model="queryParams.authCode"
          placeholder="请输入授权码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="收单平台应答码" prop="sysRespCode">
        <el-input
          v-model="queryParams.sysRespCode"
          placeholder="请输入收单平台应答码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="凭证号①" prop="traceNo">
        <el-input
          v-model="queryParams.traceNo"
          placeholder="请输入凭证号①"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="结算金额" prop="settleAmount">
        <el-input
          v-model="queryParams.settleAmount"
          placeholder="请输入结算金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="清算日期" prop="settleDate">
        <el-input
          v-model="queryParams.settleDate"
          placeholder="请输入清算日期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户手机号" prop="mobileNo">
        <el-input
          v-model="queryParams.mobileNo"
          placeholder="请输入商户手机号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卡号(带*)" prop="cardNo">
        <el-input
          v-model="queryParams.cardNo"
          placeholder="请输入卡号(带*)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="终端型号④" prop="termModel">
        <el-input
          v-model="queryParams.termModel"
          placeholder="请输入终端型号④"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户类别 1 - A类商户； 2 - B类商户； 3 - C类商户； 4 - Z 类商户" prop="merchLevel">
        <el-input
          v-model="queryParams.merchLevel"
          placeholder="请输入商户类别 1 - A类商户； 2 - B类商户； 3 - C类商户； 4 - Z 类商户"
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
      <el-form-item label="参考号" prop="rrn">
        <el-input
          v-model="queryParams.rrn"
          placeholder="请输入参考号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="系统流水号" prop="sysTraceNo">
        <el-input
          v-model="queryParams.sysTraceNo"
          placeholder="请输入系统流水号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="终端号④" prop="termId">
        <el-input
          v-model="queryParams.termId"
          placeholder="请输入终端号④"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="终端SN④" prop="termSn">
        <el-input
          v-model="queryParams.termSn"
          placeholder="请输入终端SN④"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交易时间" prop="tranTime">
        <el-input
          v-model="queryParams.tranTime"
          placeholder="请输入交易时间"
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
      <el-form-item label="输入方式" prop="inputMode">
        <el-input
          v-model="queryParams.inputMode"
          placeholder="请输入输入方式"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交易码" prop="tranCode">
        <el-input
          v-model="queryParams.tranCode"
          placeholder="请输入交易码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="渠道凭证号" prop="channelTraceNo">
        <el-input
          v-model="queryParams.channelTraceNo"
          placeholder="请输入渠道凭证号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="渠道流水号" prop="channelSerialNo">
        <el-input
          v-model="queryParams.channelSerialNo"
          placeholder="请输入渠道流水号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="渠道参考号" prop="channelRrn">
        <el-input
          v-model="queryParams.channelRrn"
          placeholder="请输入渠道参考号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单号③" prop="orderId">
        <el-input
          v-model="queryParams.orderId"
          placeholder="请输入订单号③"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="发卡行" prop="bankName">
        <el-input
          v-model="queryParams.bankName"
          placeholder="请输入发卡行"
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
          v-hasPermi="['system:jytzzb:add']"
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
          v-hasPermi="['system:jytzzb:edit']"
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
          v-hasPermi="['system:jytzzb:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:jytzzb:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="jytzzbList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="" align="center" prop="id" />
      <el-table-column label="" align="center" prop="fid" />
      <el-table-column label="收单平台应答描述" align="center" prop="sysRespDesc" />
      <el-table-column label="商户直属机构号" align="center" prop="agentId" />
      <el-table-column label="交易金额" align="center" prop="amount" />
      <el-table-column label="终端批次号②" align="center" prop="batchNo" />
      <el-table-column label="授权码" align="center" prop="authCode" />
      <el-table-column label="收单平台应答码" align="center" prop="sysRespCode" />
      <el-table-column label="凭证号①" align="center" prop="traceNo" />
      <el-table-column label="结算金额" align="center" prop="settleAmount" />
      <el-table-column label="卡类型 0:借记卡，1:信用卡" align="center" prop="cardType" />
      <el-table-column label="清算日期" align="center" prop="settleDate" />
      <el-table-column label="商户手机号" align="center" prop="mobileNo" />
      <el-table-column label="手续费计算类型 Y - 优惠,M - 减免,B - 标准,YN - 云闪付NFC, YM - 云闪付双免
本字段代表本笔交易的 商户手续费 费率类型" align="center" prop="feeType" />
      <el-table-column label="卡号(带*)" align="center" prop="cardNo" />
      <el-table-column label="终端型号④" align="center" prop="termModel" />
      <el-table-column label="商户类别 1 - A类商户； 2 - B类商户； 3 - C类商户； 4 - Z 类商户" align="center" prop="merchLevel" />
      <el-table-column label="商户名称" align="center" prop="merchantName" />
      <el-table-column label="参考号" align="center" prop="rrn" />
      <el-table-column label="系统流水号" align="center" prop="sysTraceNo" />
      <el-table-column label="终端号④" align="center" prop="termId" />
      <el-table-column label="终端SN④" align="center" prop="termSn" />
      <el-table-column label="交易时间" align="center" prop="tranTime" />
      <el-table-column label="商户号" align="center" prop="merchantId" />
      <el-table-column label="输入方式" align="center" prop="inputMode" />
      <el-table-column label="交易码" align="center" prop="tranCode" />
      <el-table-column label="渠道凭证号" align="center" prop="channelTraceNo" />
      <el-table-column label="渠道流水号" align="center" prop="channelSerialNo" />
      <el-table-column label="渠道参考号" align="center" prop="channelRrn" />
      <el-table-column label="订单号③" align="center" prop="orderId" />
      <el-table-column label="发卡行" align="center" prop="bankName" />
      <el-table-column label="费率" align="center" prop="extend" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:jytzzb:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:jytzzb:remove']"
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

    <!-- 添加或修改交易通知子对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="" prop="fid">
          <el-input v-model="form.fid" placeholder="请输入" />
        </el-form-item>
        <el-form-item label="收单平台应答描述" prop="sysRespDesc">
          <el-input v-model="form.sysRespDesc" placeholder="请输入收单平台应答描述" />
        </el-form-item>
        <el-form-item label="商户直属机构号" prop="agentId">
          <el-input v-model="form.agentId" placeholder="请输入商户直属机构号" />
        </el-form-item>
        <el-form-item label="交易金额" prop="amount">
          <el-input v-model="form.amount" placeholder="请输入交易金额" />
        </el-form-item>
        <el-form-item label="终端批次号②" prop="batchNo">
          <el-input v-model="form.batchNo" placeholder="请输入终端批次号②" />
        </el-form-item>
        <el-form-item label="授权码" prop="authCode">
          <el-input v-model="form.authCode" placeholder="请输入授权码" />
        </el-form-item>
        <el-form-item label="收单平台应答码" prop="sysRespCode">
          <el-input v-model="form.sysRespCode" placeholder="请输入收单平台应答码" />
        </el-form-item>
        <el-form-item label="凭证号①" prop="traceNo">
          <el-input v-model="form.traceNo" placeholder="请输入凭证号①" />
        </el-form-item>
        <el-form-item label="结算金额" prop="settleAmount">
          <el-input v-model="form.settleAmount" placeholder="请输入结算金额" />
        </el-form-item>
        <el-form-item label="清算日期" prop="settleDate">
          <el-input v-model="form.settleDate" placeholder="请输入清算日期" />
        </el-form-item>
        <el-form-item label="商户手机号" prop="mobileNo">
          <el-input v-model="form.mobileNo" placeholder="请输入商户手机号" />
        </el-form-item>
        <el-form-item label="卡号(带*)" prop="cardNo">
          <el-input v-model="form.cardNo" placeholder="请输入卡号(带*)" />
        </el-form-item>
        <el-form-item label="终端型号④" prop="termModel">
          <el-input v-model="form.termModel" placeholder="请输入终端型号④" />
        </el-form-item>
        <el-form-item label="商户类别 1 - A类商户； 2 - B类商户； 3 - C类商户； 4 - Z 类商户" prop="merchLevel">
          <el-input v-model="form.merchLevel" placeholder="请输入商户类别 1 - A类商户； 2 - B类商户； 3 - C类商户； 4 - Z 类商户" />
        </el-form-item>
        <el-form-item label="商户名称" prop="merchantName">
          <el-input v-model="form.merchantName" placeholder="请输入商户名称" />
        </el-form-item>
        <el-form-item label="参考号" prop="rrn">
          <el-input v-model="form.rrn" placeholder="请输入参考号" />
        </el-form-item>
        <el-form-item label="系统流水号" prop="sysTraceNo">
          <el-input v-model="form.sysTraceNo" placeholder="请输入系统流水号" />
        </el-form-item>
        <el-form-item label="终端号④" prop="termId">
          <el-input v-model="form.termId" placeholder="请输入终端号④" />
        </el-form-item>
        <el-form-item label="终端SN④" prop="termSn">
          <el-input v-model="form.termSn" placeholder="请输入终端SN④" />
        </el-form-item>
        <el-form-item label="交易时间" prop="tranTime">
          <el-input v-model="form.tranTime" placeholder="请输入交易时间" />
        </el-form-item>
        <el-form-item label="商户号" prop="merchantId">
          <el-input v-model="form.merchantId" placeholder="请输入商户号" />
        </el-form-item>
        <el-form-item label="输入方式" prop="inputMode">
          <el-input v-model="form.inputMode" placeholder="请输入输入方式" />
        </el-form-item>
        <el-form-item label="交易码" prop="tranCode">
          <el-input v-model="form.tranCode" placeholder="请输入交易码" />
        </el-form-item>
        <el-form-item label="渠道凭证号" prop="channelTraceNo">
          <el-input v-model="form.channelTraceNo" placeholder="请输入渠道凭证号" />
        </el-form-item>
        <el-form-item label="渠道流水号" prop="channelSerialNo">
          <el-input v-model="form.channelSerialNo" placeholder="请输入渠道流水号" />
        </el-form-item>
        <el-form-item label="渠道参考号" prop="channelRrn">
          <el-input v-model="form.channelRrn" placeholder="请输入渠道参考号" />
        </el-form-item>
        <el-form-item label="订单号③" prop="orderId">
          <el-input v-model="form.orderId" placeholder="请输入订单号③" />
        </el-form-item>
        <el-form-item label="发卡行" prop="bankName">
          <el-input v-model="form.bankName" placeholder="请输入发卡行" />
        </el-form-item>
        <el-form-item label="费率" prop="extend">
          <el-input v-model="form.extend" type="textarea" placeholder="请输入内容" />
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
import { listJytzzb, getJytzzb, delJytzzb, addJytzzb, updateJytzzb } from "@/api/system/jytzzb";

export default {
  name: "Jytzzb",
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
      // 交易通知子表格数据
      jytzzbList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        fid: null,
        sysRespDesc: null,
        agentId: null,
        amount: null,
        batchNo: null,
        authCode: null,
        sysRespCode: null,
        traceNo: null,
        settleAmount: null,
        cardType: null,
        settleDate: null,
        mobileNo: null,
        feeType: null,
        cardNo: null,
        termModel: null,
        merchLevel: null,
        merchantName: null,
        rrn: null,
        sysTraceNo: null,
        termId: null,
        termSn: null,
        tranTime: null,
        merchantId: null,
        inputMode: null,
        tranCode: null,
        channelTraceNo: null,
        channelSerialNo: null,
        channelRrn: null,
        orderId: null,
        bankName: null,
        extend: null
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
    /** 查询交易通知子列表 */
    getList() {
      this.loading = true;
      listJytzzb(this.queryParams).then(response => {
        this.jytzzbList = response.rows;
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
        fid: null,
        sysRespDesc: null,
        agentId: null,
        amount: null,
        batchNo: null,
        authCode: null,
        sysRespCode: null,
        traceNo: null,
        settleAmount: null,
        cardType: null,
        settleDate: null,
        mobileNo: null,
        feeType: null,
        cardNo: null,
        termModel: null,
        merchLevel: null,
        merchantName: null,
        rrn: null,
        sysTraceNo: null,
        termId: null,
        termSn: null,
        tranTime: null,
        merchantId: null,
        inputMode: null,
        tranCode: null,
        channelTraceNo: null,
        channelSerialNo: null,
        channelRrn: null,
        orderId: null,
        bankName: null,
        extend: null
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
      this.title = "添加交易通知子";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getJytzzb(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改交易通知子";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateJytzzb(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addJytzzb(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除交易通知子编号为"' + ids + '"的数据项？').then(function() {
        return delJytzzb(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/jytzzb/export', {
        ...this.queryParams
      }, `jytzzb_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
