<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="身份证" prop="shenfenzheng">
        <el-input
          v-model="queryParams.shenfenzheng"
          placeholder="请输入身份证"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="年龄" prop="age">
        <el-input
          v-model="queryParams.age"
          placeholder="请输入年龄"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="职业" prop="nianshouru">
        <el-input
          v-model="queryParams.nianshouru"
          placeholder="请输入职业"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="年收入" prop="cheliangxinxi">
        <el-select v-model="queryParams.cheliangxinxi" placeholder="请选择年收入" clearable>
          <el-option
            v-for="dict in dict.type.string"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="职龄" prop="zhiling">
        <el-select v-model="queryParams.zhiling" placeholder="请选择职龄" clearable>
          <el-option
            v-for="dict in dict.type.zhiling"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="网贷数量" prop="wangdaishu">
        <el-select v-model="queryParams.wangdaishu" placeholder="请选择网贷数量" clearable>
          <el-option
            v-for="dict in dict.type.wangdaishuliang"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="社会保险" prop="shehuibaoxian">
        <el-select v-model="queryParams.shehuibaoxian" placeholder="请选择社会保险" clearable>
          <el-option
            v-for="dict in dict.type.shbx"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="商业保险" prop="shangyebaoxian">
        <el-select v-model="queryParams.shangyebaoxian" placeholder="请选择商业保险" clearable>
          <el-option
            v-for="dict in dict.type.sybx"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="婚姻" prop="hunyin">
        <el-select v-model="queryParams.hunyin" placeholder="请选择婚姻" clearable>
          <el-option
            v-for="dict in dict.type.hy"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="住房信息" prop="zhufangxinxi">
        <el-select v-model="queryParams.zhufangxinxi" placeholder="请选择住房信息" clearable>
          <el-option
            v-for="dict in dict.type.zfxx"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="办卡用途" prop="bankayongtu">
        <el-select v-model="queryParams.bankayongtu" placeholder="请选择办卡用途" clearable>
          <el-option
            v-for="dict in dict.type.bkyt"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="最大额度" prop="zuidaedu">
        <el-input
          v-model="queryParams.zuidaedu"
          placeholder="请输入最大额度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="最小额度" prop="zuixiaoedu">
        <el-input
          v-model="queryParams.zuixiaoedu"
          placeholder="请输入最小额度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卡片数量" prop="kapianshuliang">
        <el-input
          v-model="queryParams.kapianshuliang"
          placeholder="请输入卡片数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否有过逾期" prop="youguoyuqi">
        <el-select v-model="queryParams.youguoyuqi" placeholder="请选择是否有过逾期" clearable>
          <el-option
            v-for="dict in dict.type.fqdh"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="是否近期办理过分期" prop="banlifenqi">
        <el-select v-model="queryParams.banlifenqi" placeholder="请选择是否近期办理过分期" clearable>
          <el-option
            v-for="dict in dict.type.fqdh"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="是否3月内提额" prop="yueneitie">
        <el-select v-model="queryParams.yueneitie" placeholder="请选择是否3月内提额" clearable>
          <el-option
            v-for="dict in dict.type.fqdh"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="单卡月交易笔数" prop="jiaoyibishu">
        <el-select v-model="queryParams.jiaoyibishu" placeholder="请选择单卡月交易笔数" clearable>
          <el-option
            v-for="dict in dict.type.jybs"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="目前卡片总剩余额度" prop="kapianzongshengyuedu">
        <el-input
          v-model="queryParams.kapianzongshengyuedu"
          placeholder="请输入目前卡片总剩余额度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="近期是否街道银行办卡分期电话" prop="yinhangbanlifenqi">
        <el-select v-model="queryParams.yinhangbanlifenqi" placeholder="请选择近期是否街道银行办卡分期电话" clearable>
          <el-option
            v-for="dict in dict.type.fqdh"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="查询" prop="selectid">
        <el-input
          v-model="queryParams.selectid"
          placeholder="请输入查询"
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
          v-hasPermi="['system:wenjuandiaocha:add']"
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
          v-hasPermi="['system:wenjuandiaocha:edit']"
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
          v-hasPermi="['system:wenjuandiaocha:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:wenjuandiaocha:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="wenjuandiaochaList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="id" />
      <el-table-column label="身份证" align="center" prop="shenfenzheng" />
      <el-table-column label="年龄" align="center" prop="age" />
      <el-table-column label="职业" align="center" prop="nianshouru" />
      <el-table-column label="年收入" align="center" prop="cheliangxinxi">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.string" :value="scope.row.cheliangxinxi"/>
        </template>
      </el-table-column>
      <el-table-column label="职龄" align="center" prop="zhiling">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.zhiling" :value="scope.row.zhiling"/>
        </template>
      </el-table-column>
      <el-table-column label="网贷数量" align="center" prop="wangdaishu">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.wangdaishuliang" :value="scope.row.wangdaishu"/>
        </template>
      </el-table-column>
      <el-table-column label="社会保险" align="center" prop="shehuibaoxian">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.shbx" :value="scope.row.shehuibaoxian"/>
        </template>
      </el-table-column>
      <el-table-column label="商业保险" align="center" prop="shangyebaoxian">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sybx" :value="scope.row.shangyebaoxian"/>
        </template>
      </el-table-column>
      <el-table-column label="婚姻" align="center" prop="hunyin">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.hy" :value="scope.row.hunyin"/>
        </template>
      </el-table-column>
      <el-table-column label="住房信息" align="center" prop="zhufangxinxi">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.zfxx" :value="scope.row.zhufangxinxi"/>
        </template>
      </el-table-column>
      <el-table-column label="办卡用途" align="center" prop="bankayongtu">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.bkyt" :value="scope.row.bankayongtu"/>
        </template>
      </el-table-column>
      <el-table-column label="最大额度" align="center" prop="zuidaedu" />
      <el-table-column label="最小额度" align="center" prop="zuixiaoedu" />
      <el-table-column label="卡片数量" align="center" prop="kapianshuliang" />
      <el-table-column label="是否有过逾期" align="center" prop="youguoyuqi">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fqdh" :value="scope.row.youguoyuqi"/>
        </template>
      </el-table-column>
      <el-table-column label="是否近期办理过分期" align="center" prop="banlifenqi">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fqdh" :value="scope.row.banlifenqi"/>
        </template>
      </el-table-column>
      <el-table-column label="是否3月内提额" align="center" prop="yueneitie">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fqdh" :value="scope.row.yueneitie"/>
        </template>
      </el-table-column>
      <el-table-column label="单卡月交易笔数" align="center" prop="jiaoyibishu">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.jybs" :value="scope.row.jiaoyibishu"/>
        </template>
      </el-table-column>
      <el-table-column label="目前卡片总剩余额度" align="center" prop="kapianzongshengyuedu" />
      <el-table-column label="近期是否街道银行办卡分期电话" align="center" prop="yinhangbanlifenqi">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fqdh" :value="scope.row.yinhangbanlifenqi"/>
        </template>
      </el-table-column>
      <el-table-column label="查询" align="center" prop="selectid" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:wenjuandiaocha:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:wenjuandiaocha:remove']"
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

    <!-- 添加或修改信用卡申请大数据评估系统对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="身份证" prop="shenfenzheng">
          <el-input v-model="form.shenfenzheng" placeholder="请输入身份证" />
        </el-form-item>
        <el-form-item label="年龄" prop="age">
          <el-input v-model="form.age" placeholder="请输入年龄" />
        </el-form-item>
        <el-form-item label="职业" prop="nianshouru">
          <el-input v-model="form.nianshouru" placeholder="请输入职业" />
        </el-form-item>
        <el-form-item label="年收入" prop="cheliangxinxi">
          <el-select v-model="form.cheliangxinxi" placeholder="请选择年收入">
            <el-option
              v-for="dict in dict.type.string"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="职龄" prop="zhiling">
          <el-select v-model="form.zhiling" placeholder="请选择职龄">
            <el-option
              v-for="dict in dict.type.zhiling"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="网贷数量" prop="wangdaishu">
          <el-select v-model="form.wangdaishu" placeholder="请选择网贷数量">
            <el-option
              v-for="dict in dict.type.wangdaishuliang"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="社会保险" prop="shehuibaoxian">
          <el-select v-model="form.shehuibaoxian" placeholder="请选择社会保险">
            <el-option
              v-for="dict in dict.type.shbx"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="商业保险" prop="shangyebaoxian">
          <el-select v-model="form.shangyebaoxian" placeholder="请选择商业保险">
            <el-option
              v-for="dict in dict.type.sybx"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="婚姻" prop="hunyin">
          <el-select v-model="form.hunyin" placeholder="请选择婚姻">
            <el-option
              v-for="dict in dict.type.hy"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="住房信息" prop="zhufangxinxi">
          <el-select v-model="form.zhufangxinxi" placeholder="请选择住房信息">
            <el-option
              v-for="dict in dict.type.zfxx"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="办卡用途" prop="bankayongtu">
          <el-select v-model="form.bankayongtu" placeholder="请选择办卡用途">
            <el-option
              v-for="dict in dict.type.bkyt"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="最大额度" prop="zuidaedu">
          <el-input v-model="form.zuidaedu" placeholder="请输入最大额度" />
        </el-form-item>
        <el-form-item label="最小额度" prop="zuixiaoedu">
          <el-input v-model="form.zuixiaoedu" placeholder="请输入最小额度" />
        </el-form-item>
        <el-form-item label="卡片数量" prop="kapianshuliang">
          <el-input v-model="form.kapianshuliang" placeholder="请输入卡片数量" />
        </el-form-item>
        <el-form-item label="是否有过逾期" prop="youguoyuqi">
          <el-select v-model="form.youguoyuqi" placeholder="请选择是否有过逾期">
            <el-option
              v-for="dict in dict.type.fqdh"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="是否近期办理过分期" prop="banlifenqi">
          <el-select v-model="form.banlifenqi" placeholder="请选择是否近期办理过分期">
            <el-option
              v-for="dict in dict.type.fqdh"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="是否3月内提额" prop="yueneitie">
          <el-select v-model="form.yueneitie" placeholder="请选择是否3月内提额">
            <el-option
              v-for="dict in dict.type.fqdh"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="单卡月交易笔数" prop="jiaoyibishu">
          <el-select v-model="form.jiaoyibishu" placeholder="请选择单卡月交易笔数">
            <el-option
              v-for="dict in dict.type.jybs"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="目前卡片总剩余额度" prop="kapianzongshengyuedu">
          <el-input v-model="form.kapianzongshengyuedu" placeholder="请输入目前卡片总剩余额度" />
        </el-form-item>
        <el-form-item label="近期是否街道银行办卡分期电话" prop="yinhangbanlifenqi">
          <el-select v-model="form.yinhangbanlifenqi" placeholder="请选择近期是否街道银行办卡分期电话">
            <el-option
              v-for="dict in dict.type.fqdh"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="查询" prop="selectid">
          <el-input v-model="form.selectid" placeholder="请输入查询" />
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
import { listWenjuandiaocha, getWenjuandiaocha, delWenjuandiaocha, addWenjuandiaocha, updateWenjuandiaocha } from "@/api/system/wenjuandiaocha";

export default {
  name: "Wenjuandiaocha",
  dicts: ['zfxx', 'shbx', 'bkyt', 'zhiling', 'string', 'jybs', 'wangdaishuliang', 'hy', 'sybx', 'fqdh'],
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
      // 信用卡申请大数据评估系统表格数据
      wenjuandiaochaList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        shenfenzheng: null,
        age: null,
        nianshouru: null,
        cheliangxinxi: null,
        zhiling: null,
        wangdaishu: null,
        shehuibaoxian: null,
        shangyebaoxian: null,
        hunyin: null,
        zhufangxinxi: null,
        bankayongtu: null,
        zuidaedu: null,
        zuixiaoedu: null,
        kapianshuliang: null,
        youguoyuqi: null,
        banlifenqi: null,
        yueneitie: null,
        jiaoyibishu: null,
        kapianzongshengyuedu: null,
        yinhangbanlifenqi: null,
        selectid: null
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
    /** 查询信用卡申请大数据评估系统列表 */
    getList() {
      this.loading = true;
      listWenjuandiaocha(this.queryParams).then(response => {
        this.wenjuandiaochaList = response.rows;
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
        shenfenzheng: null,
        age: null,
        nianshouru: null,
        cheliangxinxi: null,
        zhiling: null,
        wangdaishu: null,
        shehuibaoxian: null,
        shangyebaoxian: null,
        hunyin: null,
        zhufangxinxi: null,
        bankayongtu: null,
        zuidaedu: null,
        zuixiaoedu: null,
        kapianshuliang: null,
        youguoyuqi: null,
        banlifenqi: null,
        yueneitie: null,
        jiaoyibishu: null,
        kapianzongshengyuedu: null,
        yinhangbanlifenqi: null,
        selectid: null
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
      this.title = "添加信用卡申请大数据评估系统";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getWenjuandiaocha(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改信用卡申请大数据评估系统";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateWenjuandiaocha(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addWenjuandiaocha(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除信用卡申请大数据评估系统编号为"' + ids + '"的数据项？').then(function() {
        return delWenjuandiaocha(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/wenjuandiaocha/export', {
        ...this.queryParams
      }, `wenjuandiaocha_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
