<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="品牌" prop="pinpai">
        <el-input
          v-model="queryParams.pinpai"
          placeholder="请输入品牌"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="终端型号" prop="zhongduanxinghao">
        <el-input
          v-model="queryParams.zhongduanxinghao"
          placeholder="请输入终端型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="终端sn" prop="zhongduansn">
        <el-input
          v-model="queryParams.zhongduansn"
          placeholder="请输入终端sn"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="代理商" prop="dls">
        <el-input
          v-model="queryParams.dls"
          placeholder="请输入代理商"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="代理商电话" prop="dlsdh">
        <el-input
          v-model="queryParams.dlsdh"
          placeholder="请输入代理商电话"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="一代编号" prop="ydbm">
        <el-input
          v-model="queryParams.ydbm"
          placeholder="请输入一代编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户编号" prop="shbm">
        <el-input
          v-model="queryParams.shbm"
          placeholder="请输入商户编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商户名称" prop="shmc">
        <el-input
          v-model="queryParams.shmc"
          placeholder="请输入商户名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="参与服务费活动" prop="yfwfhd">
        <el-select v-model="queryParams.yfwfhd" placeholder="请选择参与服务费活动" clearable>
          <el-option
            v-for="dict in dict.type.canyu"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="参与sim活动" prop="cysimhd">
        <el-select v-model="queryParams.cysimhd" placeholder="请选择参与sim活动" clearable>
          <el-option
            v-for="dict in dict.type.canyu"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="sim服务费" prop="simfwf">
        <el-input
          v-model="queryParams.simfwf"
          placeholder="请输入sim服务费"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="服务费扣款状态" prop="fwfkkzt">
        <el-select v-model="queryParams.fwfkkzt" placeholder="请选择服务费扣款状态" clearable>
          <el-option
            v-for="dict in dict.type.kk"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="已激活返现" prop="yjhfx">
        <el-select v-model="queryParams.yjhfx" placeholder="请选择已激活返现" clearable>
          <el-option
            v-for="dict in dict.type.fanxian"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="已达标返现" prop="ydbfx">
        <el-select v-model="queryParams.ydbfx" placeholder="请选择已达标返现" clearable>
          <el-option
            v-for="dict in dict.type.fanxian"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
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
          v-hasPermi="['system:activation:add']"
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
          v-hasPermi="['system:activation:edit']"
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
          v-hasPermi="['system:activation:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:activation:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="activationList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="ID" align="center" prop="id" />
      <el-table-column label="品牌" align="center" prop="pinpai" />
      <el-table-column label="终端型号" align="center" prop="zhongduanxinghao" />
      <el-table-column label="终端sn" align="center" prop="zhongduansn" />
      <el-table-column label="代理商" align="center" prop="dls" />
      <el-table-column label="代理商电话" align="center" prop="dlsdh" />
      <el-table-column label="一代编号" align="center" prop="ydbm" />
      <el-table-column label="商户编号" align="center" prop="shbm" />
      <el-table-column label="商户名称" align="center" prop="shmc" />
      <el-table-column label="参与服务费活动" align="center" prop="yfwfhd">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.canyu" :value="scope.row.yfwfhd"/>
        </template>
      </el-table-column>
      <el-table-column label="参与sim活动" align="center" prop="cysimhd">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.canyu" :value="scope.row.cysimhd"/>
        </template>
      </el-table-column>
      <el-table-column label="冻结服务费" align="center" prop="djfwf" />
      <el-table-column label="sim服务费" align="center" prop="simfwf" />
      <el-table-column label="sim扣费(单位:天数)" align="center" prop="simkft" />
      <el-table-column label="服务费冻结回复" align="center" prop="fwfdjhf" />
      <el-table-column label="服务费扣款状态" align="center" prop="fwfkkzt">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.kk" :value="scope.row.fwfkkzt"/>
        </template>
      </el-table-column>
      <el-table-column label="已激活返现" align="center" prop="yjhfx">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fanxian" :value="scope.row.yjhfx"/>
        </template>
      </el-table-column>
      <el-table-column label="已达标返现" align="center" prop="ydbfx">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fanxian" :value="scope.row.ydbfx"/>
        </template>
      </el-table-column>
      <el-table-column label="首笔交易" align="center" prop="sbjysj" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.sbjysj, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="机具分配时间" align="center" prop="jmfpsj" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.jmfpsj, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="最后交易时间" align="center" prop="zhjysj" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.zhjysj, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="创建时间" align="center" prop="createTime" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:activation:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:activation:remove']"
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

    <!-- 添加或修改伪激活机械对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listActivation, getActivation, delActivation, addActivation, updateActivation } from "@/api/system/activation";

export default {
  name: "Activation",
  dicts: ['kk', 'canyu', 'fanxian'],
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
      // 伪激活机械表格数据
      activationList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        pinpai: null,
        zhongduanxinghao: null,
        zhongduansn: null,
        dls: null,
        dlsdh: null,
        ydbm: null,
        shbm: null,
        shmc: null,
        yfwfhd: null,
        cysimhd: null,
        simfwf: null,
        fwfkkzt: null,
        yjhfx: null,
        ydbfx: null,
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
    /** 查询伪激活机械列表 */
    getList() {
      this.loading = true;
      listActivation(this.queryParams).then(response => {
        this.activationList = response.rows;
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
        pinpai: null,
        zhongduanxinghao: null,
        zhongduansn: null,
        dls: null,
        dlsdh: null,
        ydbm: null,
        shbm: null,
        shmc: null,
        yfwfhd: null,
        cysimhd: null,
        djfwf: null,
        simfwf: null,
        simkft: null,
        fwfdjhf: null,
        fwfkkzt: null,
        yjhfx: null,
        ydbfx: null,
        sbjysj: null,
        jmfpsj: null,
        zhjysj: null,
        createTime: null,
        status1: null,
        bak1: null,
        bak2: null,
        bak3: null,
        bak4: null,
        bak5: null,
        bak6: null,
        bak7: null
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
      this.title = "添加伪激活机械";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getActivation(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改伪激活机械";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateActivation(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addActivation(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除伪激活机械编号为"' + ids + '"的数据项？').then(function() {
        return delActivation(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/activation/export', {
        ...this.queryParams
      }, `activation_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
