<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="114px">
      <el-form-item label="ID" prop="id">
        <el-input
          v-model="queryParams.id"
          placeholder="请输入ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="手机" prop="telePhone">
        <el-input
          v-model="queryParams.telePhone"
          placeholder="请输入手机"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="代付账户余额" prop="payAccountBalance">
        <el-input
          v-model="queryParams.payAccountBalance"
          placeholder="请输入代付账户余额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="物料余额" prop="materialBalance">
        <el-input
          v-model="queryParams.materialBalance"
          placeholder="请输入物料余额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="身份证号码" prop="idNo">
        <el-input
          v-model="queryParams.idNo"
          placeholder="请输入身份证号码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="银行" prop="bankName">
        <el-input
          v-model="queryParams.bankName"
          placeholder="请输入银行"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="姓名" prop="cusName">
        <el-input
          v-model="queryParams.cusName"
          placeholder="请输入姓名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="银行卡号" prop="bankNo">
        <el-input
          v-model="queryParams.bankNo"
          placeholder="请输入银行卡号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="推广号码" prop="promotionNo">
        <el-input
          v-model="queryParams.promotionNo"
          placeholder="请输入推广号码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属代理商编号" prop="belongAgentNo">
        <el-input
          v-model="queryParams.belongAgentNo"
          placeholder="请输入所属代理商编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="公司名称" prop="companyName">
        <el-input
          v-model="queryParams.companyName"
          placeholder="请输入公司名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="状态" prop="status">
        <el-select v-model="queryParams.status" placeholder="请选择状态" clearable>
          <el-option
            v-for="dict in dict.type.sys_normal_disable"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="创建时间" prop="creatTime">
        <el-date-picker clearable
          v-model="queryParams.creatTime"
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
          v-hasPermi="['system:agent:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:agent:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="agentList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="ID" align="center" prop="id" />
      <el-table-column label="排序" align="center" prop="sort" />
      <el-table-column label="头像" align="center" prop="headPic" width="100">
        <template slot-scope="scope">
          <image-preview :src="scope.row.headPic" :width="50" :height="50"/>
        </template>
      </el-table-column>
      <el-table-column label="app名称" align="center" prop="appName" />
      <el-table-column label="公司图标" align="center" prop="companyLogo" width="100">
        <template slot-scope="scope">
          <image-preview :src="scope.row.companyLogo" :width="50" :height="50"/>
        </template>
      </el-table-column>
      <el-table-column label="手机号码" align="center" prop="telePhone" />
      <el-table-column label="代付账户余额" align="center" prop="payAccountBalance" />
      <el-table-column label="物料余额" align="center" prop="materialBalance" />
      <el-table-column label="身份证号码" align="center" prop="idNo" />
      <el-table-column label="银行" align="center" prop="bankName" />
      <el-table-column label="姓名" align="center" prop="cusName" />
      <el-table-column label="银行卡号" align="center" prop="bankNo" />
      <el-table-column label="推广号码" align="center" prop="promotionNo" />
      <el-table-column label="app下载地址" align="center" prop="downloadAddress" />
      <el-table-column label="所属代理商编号" align="center" prop="belongAgentNo" />
      <el-table-column label="公司名称" align="center" prop="companyName" />
      <el-table-column label="状态" align="center" prop="status">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_normal_disable" :value="scope.row.status"/>
        </template>
      </el-table-column>
      <el-table-column label="代理商状态" align="center" prop="agentStatus" />
      <el-table-column label="代理商" align="center" prop="agentName" />
      <el-table-column label="创建时间" align="center" prop="creatTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.creatTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="上级商户号" align="center" prop="superiorNo" />
      <el-table-column label="上级商户名" align="center" prop="superiorName" />
      <el-table-column label="商户号路径" align="center" prop="routeNo" />
      <el-table-column label="商户名路径" align="center" prop="routeName" />
      <el-table-column label="备用字段5" align="center" prop="bake5" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:agent:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:agent:remove']"
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

    <!-- 添加或修改代理商对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="排序" prop="sort">
          <el-input v-model="form.sort" placeholder="请输入排序" />
        </el-form-item>
        <el-form-item label="头像" prop="headPic">
          <image-upload v-model="form.headPic"/>
        </el-form-item>
        <el-form-item label="app名称" prop="appName">
          <el-input v-model="form.appName" placeholder="请输入app名称" />
        </el-form-item>
        <el-form-item label="公司图标" prop="companyLogo">
          <image-upload v-model="form.companyLogo"/>
        </el-form-item>
        <el-form-item label="手机号码" prop="telePhone">
          <el-input v-model="form.telePhone" placeholder="请输入手机号码" />
        </el-form-item>
        <el-form-item label="代付账户余额" prop="payAccountBalance">
          <el-input v-model="form.payAccountBalance" placeholder="请输入代付账户余额" />
        </el-form-item>
        <el-form-item label="物料余额" prop="materialBalance">
          <el-input v-model="form.materialBalance" placeholder="请输入物料余额" />
        </el-form-item>
        <el-form-item label="身份证号码" prop="idNo">
          <el-input v-model="form.idNo" placeholder="请输入身份证号码" />
        </el-form-item>
        <el-form-item label="银行" prop="bankName">
          <el-input v-model="form.bankName" placeholder="请输入银行" />
        </el-form-item>
        <el-form-item label="姓名" prop="cusName">
          <el-input v-model="form.cusName" placeholder="请输入姓名" />
        </el-form-item>
        <el-form-item label="银行卡号" prop="bankNo">
          <el-input v-model="form.bankNo" placeholder="请输入银行卡号" />
        </el-form-item>
        <el-form-item label="推广号码" prop="promotionNo">
          <el-input v-model="form.promotionNo" placeholder="请输入推广号码" />
        </el-form-item>
        <el-form-item label="app下载地址" prop="downloadAddress">
          <el-input v-model="form.downloadAddress" placeholder="请输入app下载地址" />
        </el-form-item>
        <el-form-item label="所属代理商编号" prop="belongAgentNo">
          <el-input v-model="form.belongAgentNo" placeholder="请输入所属代理商编号" />
        </el-form-item>
        <el-form-item label="公司名称" prop="companyName">
          <el-input v-model="form.companyName" placeholder="请输入公司名称" />
        </el-form-item>
        <el-form-item label="状态" prop="status">
          <el-radio-group v-model="form.status">
            <el-radio
              v-for="dict in dict.type.sys_normal_disable"
              :key="dict.value"
              :label="dict.value"
            >{{dict.label}}</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="代理商状态" prop="agentStatus">
          <el-input v-model="form.agentStatus" placeholder="请输入代理商状态" />
        </el-form-item>
        <el-form-item label="代理商" prop="agentName">
          <el-input v-model="form.agentName" placeholder="请输入代理商" />
        </el-form-item>
        <el-form-item label="创建时间" prop="creatTime">
          <el-date-picker clearable
            v-model="form.creatTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择创建时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="上级商户号" prop="superiorNo">
          <el-input v-model="form.superiorNo" placeholder="请输入上级商户号" />
        </el-form-item>
        <el-form-item label="上级商户名" prop="superiorName">
          <el-input v-model="form.superiorName" placeholder="请输入上级商户名" />
        </el-form-item>
        <el-form-item label="商户号路径" prop="routeNo">
          <el-input v-model="form.routeNo" placeholder="请输入商户号路径" />
        </el-form-item>
        <el-form-item label="商户名路径" prop="routeName">
          <el-input v-model="form.routeName" placeholder="请输入商户名路径" />
        </el-form-item>
        <el-form-item label="备用字段5" prop="bake5">
          <el-input v-model="form.bake5" placeholder="请输入备用字段5" />
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
import { listAgent, getAgent, delAgent, addAgent, updateAgent } from "@/api/system/agent";

export default {
  name: "Agent",
  dicts: ['sys_normal_disable'],
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
      // 代理商表格数据
      agentList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        id: null,
        telePhone: null,
        payAccountBalance: null,
        materialBalance: null,
        idNo: null,
        bankName: null,
        cusName: null,
        bankNo: null,
        promotionNo: null,
        belongAgentNo: null,
        companyName: null,
        status: null,
        creatTime: null,
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
    /** 查询代理商列表 */
    getList() {
      this.loading = true;
      listAgent(this.queryParams).then(response => {
        this.agentList = response.rows;
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
        sort: null,
        headPic: null,
        appName: null,
        companyLogo: null,
        telePhone: null,
        payAccountBalance: null,
        materialBalance: null,
        idNo: null,
        bankName: null,
        cusName: null,
        bankNo: null,
        promotionNo: null,
        downloadAddress: null,
        belongAgentNo: null,
        companyName: null,
        status: null,
        agentStatus: null,
        agentName: null,
        creatTime: null,
        superiorNo: null,
        superiorName: null,
        routeNo: null,
        routeName: null,
        bake5: null
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
      this.title = "添加代理商";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getAgent(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改代理商";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateAgent(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addAgent(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除代理商编号为"' + ids + '"的数据项？').then(function() {
        return delAgent(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/agent/export', {
        ...this.queryParams
      }, `agent_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
