package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 机具模版对象 machine_template
 * 
 * @author ztc
 * @date 2024-02-22
 */
public class MachineTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 创建人 */
    @Excel(name = "创建人")
    private String founder;

    /** 模版名称 */
    @Excel(name = "模版名称")
    private String templateName;

    /** 激活金额 */
    @Excel(name = "激活金额")
    private String jhAmount;

    /** 激活返现 */
    @Excel(name = "激活返现")
    private String jhCashback;

    /** 激活截止(天) */
    @Excel(name = "激活截止(天)")
    private String jhJzDays;

    /** 未激活扣款金额 */
    @Excel(name = "未激活扣款金额")
    private String wjhKkAmount;

    /** 伪激活季度(三个月每个月金额) */
    @Excel(name = "伪激活季度(三个月每个月金额)")
    private String wjhQuarter;

    /** 自定义伪激活(天) */
    @Excel(name = "自定义伪激活(天)")
    private String zdyWjhDays;

    /** 自定义伪激活金额(x天达到金额) */
    @Excel(name = "自定义伪激活金额(x天达到金额)")
    private String zdyWjhAmount;

    /** 未激活扣款 */
    @Excel(name = "未激活扣款")
    private String wjhKk;

    /** 达标条件 */
    @Excel(name = "达标条件")
    private String dbConditions;

    /** 达标返现 */
    @Excel(name = "达标返现")
    private String dbCashback;

    /** 达标截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "达标截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dbJzTime;

    /** 阶段返现条件 */
    @Excel(name = "阶段返现条件")
    private String jdCashbackCondition;

    /** 阶段返现周期(月) */
    @Excel(name = "阶段返现周期(月)")
    private String jdCashbackPeriodMonths;

    /** 阶段返现金额 */
    @Excel(name = "阶段返现金额")
    private String jdCashbackAmount;

    /** vip返现金额 */
    @Excel(name = "vip返现金额")
    private String vipCashbackAmount;

    /** sim返现 */
    @Excel(name = "sim返现")
    private String simCashback;

    /** sim循环返现 */
    @Excel(name = "sim循环返现")
    private String simLoopCashback;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 备注1 */
    @Excel(name = "备注1")
    private String notes1;

    /** 备注2 */
    @Excel(name = "备注2")
    private String notes2;

    /** 备注3 */
    @Excel(name = "备注3")
    private String notes3;

    /** 备注4 */
    @Excel(name = "备注4")
    private String notes4;

    /** 备注5 */
    @Excel(name = "备注5")
    private String notes5;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFounder(String founder) 
    {
        this.founder = founder;
    }

    public String getFounder() 
    {
        return founder;
    }
    public void setTemplateName(String templateName) 
    {
        this.templateName = templateName;
    }

    public String getTemplateName() 
    {
        return templateName;
    }
    public void setJhAmount(String jhAmount) 
    {
        this.jhAmount = jhAmount;
    }

    public String getJhAmount() 
    {
        return jhAmount;
    }
    public void setJhCashback(String jhCashback) 
    {
        this.jhCashback = jhCashback;
    }

    public String getJhCashback() 
    {
        return jhCashback;
    }
    public void setJhJzDays(String jhJzDays) 
    {
        this.jhJzDays = jhJzDays;
    }

    public String getJhJzDays() 
    {
        return jhJzDays;
    }
    public void setWjhKkAmount(String wjhKkAmount) 
    {
        this.wjhKkAmount = wjhKkAmount;
    }

    public String getWjhKkAmount() 
    {
        return wjhKkAmount;
    }
    public void setWjhQuarter(String wjhQuarter) 
    {
        this.wjhQuarter = wjhQuarter;
    }

    public String getWjhQuarter() 
    {
        return wjhQuarter;
    }
    public void setZdyWjhDays(String zdyWjhDays) 
    {
        this.zdyWjhDays = zdyWjhDays;
    }

    public String getZdyWjhDays() 
    {
        return zdyWjhDays;
    }
    public void setZdyWjhAmount(String zdyWjhAmount) 
    {
        this.zdyWjhAmount = zdyWjhAmount;
    }

    public String getZdyWjhAmount() 
    {
        return zdyWjhAmount;
    }
    public void setWjhKk(String wjhKk) 
    {
        this.wjhKk = wjhKk;
    }

    public String getWjhKk() 
    {
        return wjhKk;
    }
    public void setDbConditions(String dbConditions) 
    {
        this.dbConditions = dbConditions;
    }

    public String getDbConditions() 
    {
        return dbConditions;
    }
    public void setDbCashback(String dbCashback) 
    {
        this.dbCashback = dbCashback;
    }

    public String getDbCashback() 
    {
        return dbCashback;
    }
    public void setDbJzTime(Date dbJzTime) 
    {
        this.dbJzTime = dbJzTime;
    }

    public Date getDbJzTime() 
    {
        return dbJzTime;
    }
    public void setJdCashbackCondition(String jdCashbackCondition) 
    {
        this.jdCashbackCondition = jdCashbackCondition;
    }

    public String getJdCashbackCondition() 
    {
        return jdCashbackCondition;
    }
    public void setJdCashbackPeriodMonths(String jdCashbackPeriodMonths) 
    {
        this.jdCashbackPeriodMonths = jdCashbackPeriodMonths;
    }

    public String getJdCashbackPeriodMonths() 
    {
        return jdCashbackPeriodMonths;
    }
    public void setJdCashbackAmount(String jdCashbackAmount) 
    {
        this.jdCashbackAmount = jdCashbackAmount;
    }

    public String getJdCashbackAmount() 
    {
        return jdCashbackAmount;
    }
    public void setVipCashbackAmount(String vipCashbackAmount) 
    {
        this.vipCashbackAmount = vipCashbackAmount;
    }

    public String getVipCashbackAmount() 
    {
        return vipCashbackAmount;
    }
    public void setSimCashback(String simCashback) 
    {
        this.simCashback = simCashback;
    }

    public String getSimCashback() 
    {
        return simCashback;
    }
    public void setSimLoopCashback(String simLoopCashback) 
    {
        this.simLoopCashback = simLoopCashback;
    }

    public String getSimLoopCashback() 
    {
        return simLoopCashback;
    }
    public void setCreationTime(Date creationTime) 
    {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() 
    {
        return creationTime;
    }
    public void setNotes1(String notes1) 
    {
        this.notes1 = notes1;
    }

    public String getNotes1() 
    {
        return notes1;
    }
    public void setNotes2(String notes2) 
    {
        this.notes2 = notes2;
    }

    public String getNotes2() 
    {
        return notes2;
    }
    public void setNotes3(String notes3) 
    {
        this.notes3 = notes3;
    }

    public String getNotes3() 
    {
        return notes3;
    }
    public void setNotes4(String notes4) 
    {
        this.notes4 = notes4;
    }

    public String getNotes4() 
    {
        return notes4;
    }
    public void setNotes5(String notes5) 
    {
        this.notes5 = notes5;
    }

    public String getNotes5() 
    {
        return notes5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("founder", getFounder())
            .append("templateName", getTemplateName())
            .append("jhAmount", getJhAmount())
            .append("jhCashback", getJhCashback())
            .append("jhJzDays", getJhJzDays())
            .append("wjhKkAmount", getWjhKkAmount())
            .append("wjhQuarter", getWjhQuarter())
            .append("zdyWjhDays", getZdyWjhDays())
            .append("zdyWjhAmount", getZdyWjhAmount())
            .append("wjhKk", getWjhKk())
            .append("dbConditions", getDbConditions())
            .append("dbCashback", getDbCashback())
            .append("dbJzTime", getDbJzTime())
            .append("jdCashbackCondition", getJdCashbackCondition())
            .append("jdCashbackPeriodMonths", getJdCashbackPeriodMonths())
            .append("jdCashbackAmount", getJdCashbackAmount())
            .append("vipCashbackAmount", getVipCashbackAmount())
            .append("simCashback", getSimCashback())
            .append("simLoopCashback", getSimLoopCashback())
            .append("creationTime", getCreationTime())
            .append("updateTime", getUpdateTime())
            .append("notes1", getNotes1())
            .append("notes2", getNotes2())
            .append("notes3", getNotes3())
            .append("notes4", getNotes4())
            .append("notes5", getNotes5())
            .toString();
    }
}
