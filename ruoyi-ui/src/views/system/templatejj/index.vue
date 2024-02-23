<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="创建人" prop="founder">
        <el-input
          v-model="queryParams.founder"
          placeholder="请输入创建人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="模版名称" prop="templateName">
        <el-input
          v-model="queryParams.templateName"
          placeholder="请输入模版名称"
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
          v-hasPermi="['system:templatejj:add']"
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
          v-hasPermi="['system:templatejj:edit']"
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
          v-hasPermi="['system:templatejj:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:templatejj:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="templatejjList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="id" align="center" prop="id" />
      <el-table-column label="创建人" align="center" prop="founder" />
      <el-table-column label="模版名称" align="center" prop="templateName" />
      <el-table-column label="激活金额" align="center" prop="jhAmount" />
      <el-table-column label="激活返现" align="center" prop="jhCashback" />
      <el-table-column label="激活截止(天)" align="center" prop="jhJzDays" />
      <el-table-column label="未激活扣款金额" align="center" prop="wjhKkAmount" />
      <el-table-column label="伪激活季度(三个月每个月金额)" align="center" prop="wjhQuarter" />
      <el-table-column label="自定义伪激活(天)" align="center" prop="zdyWjhDays" />
      <el-table-column label="自定义伪激活金额(x天达到金额)" align="center" prop="zdyWjhAmount" />
      <el-table-column label="未激活扣款" align="center" prop="wjhKk" />
      <el-table-column label="达标条件" align="center" prop="dbConditions" />
      <el-table-column label="达标返现" align="center" prop="dbCashback" />
      <el-table-column label="达标截止时间" align="center" prop="dbJzTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.dbJzTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="阶段返现条件" align="center" prop="jdCashbackCondition" />
      <el-table-column label="阶段返现周期(月)" align="center" prop="jdCashbackPeriodMonths" />
      <el-table-column label="阶段返现金额" align="center" prop="jdCashbackAmount" />
      <el-table-column label="vip返现金额" align="center" prop="vipCashbackAmount" />
      <el-table-column label="sim返现" align="center" prop="simCashback" />
      <el-table-column label="sim循环返现" align="center" prop="simLoopCashback" />
      <el-table-column label="创建时间" align="center" prop="creationTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.creationTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="备注1" align="center" prop="notes1" />
      <el-table-column label="备注2" align="center" prop="notes2" />
      <el-table-column label="备注3" align="center" prop="notes3" />
      <el-table-column label="备注4" align="center" prop="notes4" />
      <el-table-column label="备注5" align="center" prop="notes5" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:templatejj:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:templatejj:remove']"
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

    <!-- 添加或修改机具模版对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="模版名称" prop="templateName">
          <el-input v-model="form.templateName" placeholder="请输入模版名称" />
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
import { listTemplatejj, getTemplatejj, delTemplatejj, addTemplatejj, updateTemplatejj } from "@/api/system/templatejj";

export default {
  name: "Templatejj",
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
      // 机具模版表格数据
      templatejjList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        founder: null,
        templateName: null,
        simLoopCashback: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        id: [
          { required: true, message: "id不能为空", trigger: "blur" }
        ],
        templateName: [
          { required: true, message: "模版名称不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询机具模版列表 */
    getList() {
      this.loading = true;
      listTemplatejj(this.queryParams).then(response => {
        this.templatejjList = response.rows;
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
        founder: null,
        templateName: null,
        jhAmount: null,
        jhCashback: null,
        jhJzDays: null,
        wjhKkAmount: null,
        wjhQuarter: null,
        zdyWjhDays: null,
        zdyWjhAmount: null,
        wjhKk: null,
        dbConditions: null,
        dbCashback: null,
        dbJzTime: null,
        jdCashbackCondition: null,
        jdCashbackPeriodMonths: null,
        jdCashbackAmount: null,
        vipCashbackAmount: null,
        simCashback: null,
        simLoopCashback: null,
        creationTime: null,
        updateTime: null,
        notes1: null,
        notes2: null,
        notes3: null,
        notes4: null,
        notes5: null
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
      this.title = "添加机具模版";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getTemplatejj(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改机具模版";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateTemplatejj(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addTemplatejj(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除机具模版编号为"' + ids + '"的数据项？').then(function() {
        return delTemplatejj(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/templatejj/export', {
        ...this.queryParams
      }, `templatejj_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
