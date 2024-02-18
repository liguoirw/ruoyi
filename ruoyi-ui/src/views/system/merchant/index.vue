<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="108px">
      <el-form-item label="机具品牌" prop="machineBrand">
        <el-input
          v-model="queryParams.machineBrand"
          placeholder="请输入机具品牌"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="机具sn" prop="machineSN">
        <el-input
          v-model="queryParams.machineSN"
          placeholder="请输入机具sn"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="直属代理商" prop="underAgentNo">
        <el-input
          v-model="queryParams.underAgentNo"
          placeholder="请输入直属代理商"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="代理商电话" prop="agentTel">
        <el-input
          v-model="queryParams.agentTel"
          placeholder="请输入代理商电话"
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
      <el-form-item label="法人名称" prop="legalName">
        <el-input
          v-model="queryParams.legalName"
          placeholder="请输入法人名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户编号" prop="merchantNo">
        <el-input
          v-model="queryParams.merchantNo"
          placeholder="请输入商户编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="手机号码" prop="telePhone">
        <el-input
          v-model="queryParams.telePhone"
          placeholder="请输入手机号码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="累计交易" prop="accumTrans">
        <el-input
          v-model="queryParams.accumTrans"
          placeholder="请输入累计交易"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="首次交易时间" prop="firstTransTime">
        <el-date-picker clearable
                        v-model="queryParams.firstTransTime"
                        type="date"
                        value-format="yyyy-MM-dd"
                        placeholder="请选择首次交易时间">
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
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:merchant:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="merchantList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="商户编号" align="center" prop="merchantId" />
      <el-table-column label="机具品牌" align="center" prop="machineBrand" />
      <el-table-column label="机具sn" align="center" prop="machineSN" />
      <el-table-column label="直属代理商" align="center" prop="underAgentNo" />
      <el-table-column label="代理商电话" align="center" prop="agentTel" />
      <el-table-column label="商户名称" align="center" prop="merchantName" />
      <el-table-column label="法人名称" align="center" prop="legalName" />
      <el-table-column label="商户编号" align="center" prop="merchantNo" />
      <el-table-column label="手机号码" align="center" prop="telePhone" />
      <el-table-column label="累计交易" align="center" prop="accumTrans" />
      <el-table-column label="一代机构号" align="center" prop="firLevAgentNo" />
      <el-table-column label="信用卡手续费费率(%)" align="center" prop="creCardProcFee" />
      <el-table-column label="借记卡手续费费率(%)" align="center" prop="debCardProcFee" />
      <el-table-column label="借记卡手续费最大值(元)" align="center" prop="debCardProcMax" />
      <el-table-column label="微信手续费费率(%)" align="center" prop="wxProcFee" />
      <el-table-column label="支付宝手续费费率(%)" align="center" prop="aliPayProcFee" />
      <el-table-column label="云闪付信用卡手续费费率(%)" align="center" prop="yunCreCardFee" />
      <el-table-column label="云闪付借记卡手续费费率(%)" align="center" prop="yunDebCardFee" />
      <el-table-column label="单笔" align="center" prop="singleStroke" />
      <el-table-column label="pos机服务费金额(元)" align="center" prop="posCharge" />
      <el-table-column label="vip服务费金额(元)" align="center" prop="vipCharge" />
      <el-table-column label="sim服务费金额(元)" align="center" prop="simCharge" />
      <el-table-column label="首次交易时间" align="center" prop="firstTransTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.firstTransTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
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
            v-hasPermi="['system:merchant:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:merchant:remove']"
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

    <!-- 添加或修改商户对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="机具品牌" prop="machineBrand">
          <el-input v-model="form.machineBrand" placeholder="请输入机具品牌" />
        </el-form-item>
        <el-form-item label="机具sn" prop="machineSN">
          <el-input v-model="form.machineSN" placeholder="请输入机具sn" />
        </el-form-item>
        <el-form-item label="直属代理商" prop="underAgentNo">
          <el-input v-model="form.underAgentNo" placeholder="请输入直属代理商" />
        </el-form-item>
        <el-form-item label="代理商电话" prop="agentTel">
          <el-input v-model="form.agentTel" placeholder="请输入代理商电话" />
        </el-form-item>
        <el-form-item label="商户名称" prop="merchantName">
          <el-input v-model="form.merchantName" placeholder="请输入商户名称" />
        </el-form-item>
        <el-form-item label="法人名称" prop="legalName">
          <el-input v-model="form.legalName" placeholder="请输入法人名称" />
        </el-form-item>
        <el-form-item label="商户编号" prop="merchantNo">
          <el-input v-model="form.merchantNo" placeholder="请输入商户编号" />
        </el-form-item>
        <el-form-item label="手机号码" prop="telePhone">
          <el-input v-model="form.telePhone" placeholder="请输入手机号码" />
        </el-form-item>
        <el-form-item label="累计交易" prop="accumTrans">
          <el-input v-model="form.accumTrans" placeholder="请输入累计交易" />
        </el-form-item>
        <el-form-item label="一代机构号" prop="firLevAgentNo">
          <el-input v-model="form.firLevAgentNo" placeholder="请输入一代机构号" />
        </el-form-item>
        <el-form-item label="信用卡手续费费率(%)" prop="creCardProcFee">
          <el-input v-model="form.creCardProcFee" placeholder="请输入信用卡手续费费率(%)" />
        </el-form-item>
        <el-form-item label="借记卡手续费费率(%)" prop="debCardProcFee">
          <el-input v-model="form.debCardProcFee" placeholder="请输入借记卡手续费费率(%)" />
        </el-form-item>
        <el-form-item label="借记卡手续费最大值(元)" prop="debCardProcMax">
          <el-input v-model="form.debCardProcMax" placeholder="请输入借记卡手续费最大值(元)" />
        </el-form-item>
        <el-form-item label="微信手续费费率(%)" prop="wxProcFee">
          <el-input v-model="form.wxProcFee" placeholder="请输入微信手续费费率(%)" />
        </el-form-item>
        <el-form-item label="支付宝手续费费率(%)" prop="aliPayProcFee">
          <el-input v-model="form.aliPayProcFee" placeholder="请输入支付宝手续费费率(%)" />
        </el-form-item>
        <el-form-item label="云闪付信用卡手续费费率(%)" prop="yunCreCardFee">
          <el-input v-model="form.yunCreCardFee" placeholder="请输入云闪付信用卡手续费费率(%)" />
        </el-form-item>
        <el-form-item label="云闪付借记卡手续费费率(%)" prop="yunDebCardFee">
          <el-input v-model="form.yunDebCardFee" placeholder="请输入云闪付借记卡手续费费率(%)" />
        </el-form-item>
        <el-form-item label="单笔" prop="singleStroke">
          <el-input v-model="form.singleStroke" placeholder="请输入单笔" />
        </el-form-item>
        <el-form-item label="pos机服务费金额(元)" prop="posCharge">
          <el-input v-model="form.posCharge" placeholder="请输入pos机服务费金额(元)" />
        </el-form-item>
        <el-form-item label="vip服务费金额(元)" prop="vipCharge">
          <el-input v-model="form.vipCharge" placeholder="请输入vip服务费金额(元)" />
        </el-form-item>
        <el-form-item label="sim服务费金额(元)" prop="simCharge">
          <el-input v-model="form.simCharge" placeholder="请输入sim服务费金额(元)" />
        </el-form-item>
        <el-form-item label="首次交易时间" prop="firstTransTime">
          <el-date-picker clearable
                          v-model="form.firstTransTime"
                          type="date"
                          value-format="yyyy-MM-dd"
                          placeholder="请选择首次交易时间">
          </el-date-picker>
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
import { listMerchant, getMerchant, delMerchant, addMerchant, updateMerchant } from "@/api/system/merchant";

export default {
  name: "Merchant",
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
      // 商户表格数据
      merchantList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        machineBrand: null,
        machineSN: null,
        underAgentNo: null,
        agentTel: null,
        merchantName: null,
        legalName: null,
        merchantNo: null,
        telePhone: null,
        accumTrans: null,
        firLevAgentNo: null,
        creCardProcFee: null,
        debCardProcFee: null,
        debCardProcMax: null,
        wxProcFee: null,
        aliPayProcFee: null,
        yunCreCardFee: null,
        yunDebCardFee: null,
        singleStroke: null,
        posCharge: null,
        vipCharge: null,
        simCharge: null,
        firstTransTime: null,
        creatTime: null
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
    /** 查询商户列表 */
    getList() {
      this.loading = true;
      listMerchant(this.queryParams).then(response => {
        this.merchantList = response.rows;
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
        merchantId: null,
        machineBrand: null,
        machineSN: null,
        underAgentNo: null,
        agentTel: null,
        merchantName: null,
        legalName: null,
        merchantNo: null,
        telePhone: null,
        accumTrans: null,
        firLevAgentNo: null,
        creCardProcFee: null,
        debCardProcFee: null,
        debCardProcMax: null,
        wxProcFee: null,
        aliPayProcFee: null,
        yunCreCardFee: null,
        yunDebCardFee: null,
        singleStroke: null,
        posCharge: null,
        vipCharge: null,
        simCharge: null,
        firstTransTime: null,
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
      this.ids = selection.map(item => item.merchantId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加商户";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const merchantId = row.merchantId || this.ids
      getMerchant(merchantId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改商户";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.merchantId != null) {
            updateMerchant(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addMerchant(this.form).then(response => {
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
      const merchantIds = row.merchantId || this.ids;
      this.$modal.confirm('是否确认删除商户编号为"' + merchantIds + '"的数据项？').then(function() {
        return delMerchant(merchantIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/merchant/export', {
        ...this.queryParams
      }, `merchant_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
