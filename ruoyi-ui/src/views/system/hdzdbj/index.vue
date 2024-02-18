<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">


      <el-form-item label="品牌" prop="pinpai">
        <el-select v-model="queryParams.pinpai" placeholder="" clearable>
          <el-option
            v-for="dict in dict.type.canyu"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>

      <el-form-item label="终端型号" prop="zhongduanxinghao">
        <el-select v-model="queryParams.zhongduanxinghao" placeholder="" clearable>
          <el-option
            v-for="dict in dict.type.canyu"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="终端sn" prop="zhongduansn">
        <el-input
          v-model="queryParams.zhongduansn"
          placeholder="请输入终端sn"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="直属代理商" prop="zsdls">
        <el-input
          v-model="queryParams.zsdls"
          placeholder="请输入直属代理商"
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
      <el-form-item label="累计交易" prop="ljjy">
        <el-input
          v-model="queryParams.ljjy"
          placeholder="请输入累计交易"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="终端状态" prop="zdzt">
        <el-select v-model="queryParams.zdzt" placeholder="请选择终端状态" clearable>
          <el-option
            v-for="dict in dict.type.zdzt"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="结算模板" prop="jsmb">
        <el-input
          v-model="queryParams.jsmb"
          placeholder="请输入结算模板"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="机具模板" prop="jjmb">
        <el-input
          v-model="queryParams.jjmb"
          placeholder="请输入机具模板"
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
      <el-form-item label="机器类型" prop="jqlx">
        <el-input
          v-model="queryParams.jqlx"
          placeholder="请输入机器类型"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商家返利" prop="sjfl">
        <el-select v-model="queryParams.sjfl" placeholder="请选择商家返利" clearable>
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
      <el-form-item label="sim扣费" prop="simkf">
        <el-input
          v-model="queryParams.simkf"
          placeholder="请输入sim扣费"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="sim返现次数" prop="simfxcs">
        <el-input
          v-model="queryParams.simfxcs"
          placeholder="请输入sim返现次数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="服务费冻结回复" prop="fwfdjhf">
        <el-select v-model="queryParams.fwfdjhf" placeholder="请选择服务费冻结回复" clearable>
          <el-option
            v-for="dict in dict.type.fanxian"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
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
      <el-form-item label="sim返现" prop="simfx">
        <el-select v-model="queryParams.simfx" placeholder="请选择sim返现" clearable>
          <el-option
            v-for="dict in dict.type.sys_yes_no"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="首笔交易" prop="sbjysj">
        <el-date-picker clearable
          v-model="queryParams.sbjysj"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择首笔交易">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="绑定时间" prop="bdsj">
        <el-date-picker clearable
          v-model="queryParams.bdsj"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择绑定时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="下次流量费扣费时间" prop="xcllfkfsj">
        <el-date-picker clearable
          v-model="queryParams.xcllfkfsj"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择下次流量费扣费时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="机具分配时间" prop="jmfpsj">
        <el-date-picker clearable
          v-model="queryParams.jmfpsj"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择机具分配时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="最后交易时间" prop="zhjysj">
        <el-date-picker clearable
          v-model="queryParams.zhjysj"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择最后交易时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="创建时间" prop="cjsj">
        <el-date-picker clearable
          v-model="queryParams.cjsj"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择创建时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="" prop="bak">
        <el-input
          v-model="queryParams.bak"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="" prop="status1">
        <el-input
          v-model="queryParams.status1"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="" prop="bak1">
        <el-input
          v-model="queryParams.bak1"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="" prop="bak2">
        <el-input
          v-model="queryParams.bak2"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="" prop="bak3">
        <el-input
          v-model="queryParams.bak3"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="" prop="bak4">
        <el-input
          v-model="queryParams.bak4"
          placeholder="请输入"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="服务费冻结返现" prop="fwfdjfx">
        <el-select v-model="queryParams.fwfdjfx" placeholder="请选择服务费冻结返现" clearable>
          <el-option
            v-for="dict in dict.type.fanxian"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="冻结服务费" prop="djfwf">
        <el-input
          v-model="queryParams.djfwf"
          placeholder="请输入冻结服务费"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="允许下级修改服务费" prop="rxxjxgfwf">
        <el-select v-model="queryParams.rxxjxgfwf" placeholder="请选择允许下级修改服务费" clearable>
          <el-option
            v-for="dict in dict.type.yunxu"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="sim扣费(单位:天数)" prop="simkft">
        <el-input
          v-model="queryParams.simkft"
          placeholder="请输入sim扣费(单位:天数)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="sim扣费间隔" prop="simkfjg">
        <el-input
          v-model="queryParams.simkfjg"
          placeholder="请输入sim扣费间隔"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="sim已返现次数" prop="simyfxcs">
        <el-input
          v-model="queryParams.simyfxcs"
          placeholder="请输入sim已返现次数"
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
          v-hasPermi="['system:hdzdbj:add']"
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
          v-hasPermi="['system:hdzdbj:edit']"
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
          v-hasPermi="['system:hdzdbj:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:hdzdbj:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="hdzdbjList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="商户id" align="center" prop="id" />
      <el-table-column label="品牌" align="center" prop="pinpai" />
      <el-table-column label="终端型号" align="center" prop="zhongduanxinghao" />
      <el-table-column label="终端sn" align="center" prop="zhongduansn" />
      <el-table-column label="直属代理商" align="center" prop="zsdls" />
      <el-table-column label="代理商" align="center" prop="dls" />
      <el-table-column label="代理商电话" align="center" prop="dlsdh" />
      <el-table-column label="一代编号" align="center" prop="ydbm" />
      <el-table-column label="商户编号" align="center" prop="shbm" />
      <el-table-column label="商户名称" align="center" prop="shmc" />
      <el-table-column label="累计交易" align="center" prop="ljjy" />
      <el-table-column label="终端状态" align="center" prop="zdzt">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.zdzt" :value="scope.row.zdzt"/>
        </template>
      </el-table-column>
      <el-table-column label="结算模板" align="center" prop="jsmb" />
      <el-table-column label="机具模板" align="center" prop="jjmb" />
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
      <el-table-column label="机器类型" align="center" prop="jqlx" />
      <el-table-column label="商家返利" align="center" prop="sjfl">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.canyu" :value="scope.row.sjfl"/>
        </template>
      </el-table-column>
      <el-table-column label="sim服务费" align="center" prop="simfwf" />
      <el-table-column label="sim扣费" align="center" prop="simkf" />
      <el-table-column label="sim返现次数" align="center" prop="simfxcs" />
      <el-table-column label="服务费冻结回复" align="center" prop="fwfdjhf">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fanxian" :value="scope.row.fwfdjhf"/>
        </template>
      </el-table-column>
      <el-table-column label="冻结返现" align="center" prop="djfx">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fanxian" :value="scope.row.djfx"/>
        </template>
      </el-table-column>
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
      <el-table-column label="sim返现" align="center" prop="simfx">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_yes_no" :value="scope.row.simfx"/>
        </template>
      </el-table-column>
      <el-table-column label="首笔交易" align="center" prop="sbjysj" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.sbjysj, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="绑定时间" align="center" prop="bdsj" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.bdsj, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="下次流量费扣费时间" align="center" prop="xcllfkfsj" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.xcllfkfsj, '{y}-{m}-{d}') }}</span>
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
      <el-table-column label="创建时间" align="center" prop="cjsj" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.cjsj, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="代理商id" align="center" prop="bak" />
      <el-table-column label="代理商名" align="center" prop="bak1" />

      <el-table-column label="服务费冻结返现" align="center" prop="fwfdjfx">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.fanxian" :value="scope.row.fwfdjfx"/>
        </template>
      </el-table-column>
      <el-table-column label="冻结服务费" align="center" prop="djfwf" />
      <el-table-column label="允许下级修改服务费" align="center" prop="rxxjxgfwf">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.yunxu" :value="scope.row.rxxjxgfwf"/>
        </template>
      </el-table-column>
      <el-table-column label="sim扣费(单位:天数)" align="center" prop="simkft" />
      <el-table-column label="sim扣费间隔" align="center" prop="simkfjg" />
      <el-table-column label="sim已返现次数" align="center" prop="simyfxcs" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
<!--          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleChargeCollect(scope.row)"
            v-hasPermi="['system:hdzdbj:edit']"
          >服务费代收</el-button>-->
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:hdzdbj:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:hdzdbj:remove']"
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

    <!-- 添加或修改活动终端标记对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="品牌" prop="pinpai">
          <el-input v-model="form.pinpai" placeholder="请输入品牌" />
        </el-form-item>
        <el-form-item label="终端型号" prop="zhongduanxinghao">
          <el-input v-model="form.zhongduanxinghao" placeholder="请输入代理商" />
        </el-form-item>
        <el-form-item label="终端sn" prop="zhongduansn">
          <el-input v-model="form.zhongduansn" placeholder="请输入终端sn" />
        </el-form-item>
        <el-form-item label="代理商id" prop="bak">
          <el-select v-model="form.bak" placeholder="请选择" @change="chChange">
            <el-option
              v-for="dict in userList"
              :key="dict.id"
              :label="dict.agentName"
              :value="dict.id"
            ></el-option>
          </el-select>
        </el-form-item>

        <el-form-item label="直属代理商" prop="zsdls">
          <el-input v-model="form.zsdls" placeholder="请输入直属代理商" />
        </el-form-item>
        <el-form-item label="代理商" prop="dls">
          <el-input v-model="form.dls" placeholder="请输入代理商" />
        </el-form-item>
        <el-form-item label="代理商电话" prop="dlsdh">
          <el-input v-model="form.dlsdh" placeholder="请输入代理商电话" />
        </el-form-item>
        <el-form-item label="一代编号" prop="ydbm">
          <el-input v-model="form.ydbm" placeholder="请输入一代编号" />
        </el-form-item>

        <el-form-item label="累计交易" prop="ljjy">
          <el-input v-model="form.ljjy" placeholder="请输入累计交易" />

        </el-form-item>
        <el-form-item label="终端状态" prop="zdzt">
          <el-select v-model="form.zdzt" placeholder="请选择终端状态">
            <el-option
              v-for="dict in dict.type.zdzt"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="结算模板" prop="jsmb">
          <el-input v-model="form.jsmb" placeholder="请输入结算模板" />
        </el-form-item>
        <el-form-item label="机具模板" prop="jjmb">
          <el-input v-model="form.jjmb" placeholder="请输入机具模板" />
        </el-form-item>
        <el-form-item label="参与服务费活动" prop="yfwfhd">
          <el-select v-model="form.yfwfhd" placeholder="请选择参与服务费活动">
            <el-option
              v-for="dict in dict.type.canyu"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="参与sim活动" prop="cysimhd">
          <el-select v-model="form.cysimhd" placeholder="请选择参与sim活动">
            <el-option
              v-for="dict in dict.type.canyu"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="机器类型" prop="jqlx">
          <el-input v-model="form.jqlx" placeholder="请输入机器类型" />
        </el-form-item>
        <el-form-item label="商家返利" prop="sjfl">
          <el-select v-model="form.sjfl" placeholder="请选择商家返利">
            <el-option
              v-for="dict in dict.type.canyu"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="sim服务费" prop="simfwf">
          <el-input v-model="form.simfwf" placeholder="请输入sim服务费" />
        </el-form-item>
        <el-form-item label="sim扣费" prop="simkf">
          <el-input v-model="form.simkf" placeholder="请输入sim扣费" />
        </el-form-item>
        <el-form-item label="sim返现次数" prop="simfxcs">
          <el-input v-model="form.simfxcs" placeholder="请输入sim返现次数" />
        </el-form-item>
        <el-form-item label="服务费冻结回复" prop="fwfdjhf">
          <el-select v-model="form.fwfdjhf" placeholder="请选择服务费冻结回复">
            <el-option
              v-for="dict in dict.type.fanxian"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="冻结返现" prop="djfx">
          <el-input v-model="form.djfx" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="服务费扣款状态" prop="fwfkkzt">
          <el-select v-model="form.fwfkkzt" placeholder="请选择服务费扣款状态">
            <el-option
              v-for="dict in dict.type.kk"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="已激活返现" prop="yjhfx">
          <el-select v-model="form.yjhfx" placeholder="请选择已激活返现">
            <el-option
              v-for="dict in dict.type.fanxian"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="已达标返现" prop="ydbfx">
          <el-select v-model="form.ydbfx" placeholder="请选择已达标返现">
            <el-option
              v-for="dict in dict.type.fanxian"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="sim返现" prop="simfx">
          <el-select v-model="form.simfx" placeholder="请选择sim返现">
            <el-option
              v-for="dict in dict.type.sys_yes_no"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="首笔交易" prop="sbjysj">
          <el-date-picker clearable
            v-model="form.sbjysj"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择首笔交易">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="绑定时间" prop="bdsj">
          <el-date-picker clearable
            v-model="form.bdsj"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择绑定时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="下次流量费扣费时间" prop="xcllfkfsj">
          <el-date-picker clearable
            v-model="form.xcllfkfsj"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择下次流量费扣费时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="机具分配时间" prop="jmfpsj">
          <el-date-picker clearable
            v-model="form.jmfpsj"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择机具分配时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="最后交易时间" prop="zhjysj">
          <el-date-picker clearable
            v-model="form.zhjysj"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择最后交易时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="创建时间" prop="cjsj">
          <el-date-picker clearable
            v-model="form.cjsj"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择创建时间">
          </el-date-picker>
        </el-form-item>




        <el-form-item label="代理商名" prop="bak1">
          <el-input v-model="form.bak1" placeholder="请输入" />
        </el-form-item>

        <el-form-item label="服务费冻结返现" prop="fwfdjfx">
          <el-select v-model="form.fwfdjfx" placeholder="请选择服务费冻结返现">
            <el-option
              v-for="dict in dict.type.fanxian"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="冻结服务费" prop="djfwf">
          <el-input v-model="form.djfwf" placeholder="请输入冻结服务费" />
        </el-form-item>
        <el-form-item label="允许下级修改服务费" prop="rxxjxgfwf">
          <el-select v-model="form.rxxjxgfwf" placeholder="请选择允许下级修改服务费">
            <el-option
              v-for="dict in dict.type.yunxu"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="sim扣费(单位:天数)" prop="simkft">
          <el-input v-model="form.simkft" placeholder="请输入sim扣费(单位:天数)" />
        </el-form-item>
        <el-form-item label="sim扣费间隔" prop="simkfjg">
          <el-input v-model="form.simkfjg" placeholder="请输入sim扣费间隔" />
        </el-form-item>
        <el-form-item label="sim已返现次数" prop="simyfxcs">
          <el-input v-model="form.simyfxcs" placeholder="请输入sim已返现次数" />
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
import {listHdzdbj, getHdzdbj, delHdzdbj, addHdzdbj, updateHdzdbj, chargeCollect} from "@/api/system/hdzdbj";
import { listAgent } from "@/api/system/agent";
import { listUser, getUser, delUser, addUser, updateUser, resetUserPwd, changeUserStatus, deptTreeSelect } from "@/api/system/user";
export default {
  name: "Hdzdbj",
  dicts: ['kk', 'sys_yes_no', 'yunxu', 'zdzt', 'canyu', 'fanxian'],
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
      // 活动终端标记表格数据
      hdzdbjList: [],
      userList:[],
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
        zsdls: null,
        dls: null,
        dlsdh: null,
        ydbm: null,
        shbm: null,
        shmc: null,
        ljjy: null,
        zdzt: null,
        jsmb: null,
        jjmb: null,
        yfwfhd: null,
        cysimhd: null,
        jqlx: null,
        sjfl: null,
        simfwf: null,
        simkf: null,
        simfxcs: null,
        fwfdjhf: null,
        djfx: null,
        fwfkkzt: null,
        yjhfx: null,
        ydbfx: null,
        simfx: null,
        sbjysj: null,
        bdsj: null,
        xcllfkfsj: null,
        jmfpsj: null,
        zhjysj: null,
        cjsj: null,
        bak: null,
        status: null,
        status1: null,
        bak1: null,
        bak2: null,
        bak3: null,
        bak4: null,
        fwfdjfx: null,
        djfwf: null,
        rxxjxgfwf: null,
        simkft: null,
        simkfjg: null,
        simyfxcs: null
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
    this.usergetList();
  },
  methods: {
    /** 查询活动终端标记列表 */
    getList() {
      this.loading = true;
      listHdzdbj(this.queryParams).then(response => {
        this.hdzdbjList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    usergetList() {
      this.loading = true;
      listAgent(this.addDateRange(this.queryParams, this.dateRange)).then(response => {

          this.userList = response.rows;
          console.log(this.userList);
        }
      );
    },
    // An highlighted block
    chChange(val){
      var obj = {};
      obj = this.userList.find(item =>{
        return item.id === val
      });
       console.log(obj.agentName)
      this.form.dls=obj.agentName;
      this.form.zsdls=obj.superiorName;
      this.form.dlsdh=obj.telePhone;
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
        zsdls: null,
        dls: null,
        dlsdh: null,
        ydbm: null,
        shbm: null,
        shmc: null,
        ljjy: null,
        zdzt: null,
        jsmb: null,
        jjmb: null,
        yfwfhd: null,
        cysimhd: null,
        jqlx: null,
        sjfl: null,
        simfwf: null,
        simkf: null,
        simfxcs: null,
        fwfdjhf: null,
        djfx: null,
        fwfkkzt: null,
        yjhfx: null,
        ydbfx: null,
        simfx: null,
        sbjysj: null,
        bdsj: null,
        xcllfkfsj: null,
        jmfpsj: null,
        zhjysj: null,
        cjsj: null,
        bak: null,
        status: null,
        status1: null,
        bak1: null,
        bak2: null,
        bak3: null,
        bak4: null,
        fwfdjfx: null,
        djfwf: null,
        rxxjxgfwf: null,
        simkft: null,
        simkfjg: null,
        simyfxcs: null
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
      this.title = "添加活动终端标记";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getHdzdbj(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改活动终端标记";
      });
    },
    /** 服务费提交按钮操作 */
    handleChargeCollect(row) {
      this.reset();
      const id = row.id || this.ids
      chargeCollect(row).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "商户服务费代收";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateHdzdbj(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addHdzdbj(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除活动终端标记编号为"' + ids + '"的数据项？').then(function() {
        return delHdzdbj(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/hdzdbj/export', {
        ...this.queryParams
      }, `hdzdbj_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
