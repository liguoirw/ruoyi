package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 提现模板对象 withdrawal_template
 * 
 * @author ztc
 * @date 2024-02-22
 */
public class WithdrawalTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 代理名称 */
    @Excel(name = "代理名称")
    private String agentName;

    /** 模板名称 */
    @Excel(name = "模板名称")
    private String templateName;

    /** 分润余额税率 */
    @Excel(name = "分润余额税率")
    private String fryeTax;

    /** 分润余额单笔手续费 */
    @Excel(name = "分润余额单笔手续费")
    private String fryedbCommission;

    /** 机具返现余额税率 */
    @Excel(name = "机具返现余额税率")
    private String jjfxyeTax;

    /** 机具返现余额单笔手续费 */
    @Excel(name = "机具返现余额单笔手续费")
    private String jjfxyedbCommission;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 备注1 */
    @Excel(name = "备注1")
    private String note1;

    /** 备注2 */
    @Excel(name = "备注2")
    private String note2;

    /** 备注3 */
    @Excel(name = "备注3")
    private String note3;

    /** 备注4 */
    @Excel(name = "备注4")
    private String note4;

    /** 备注5 */
    @Excel(name = "备注5")
    private String note5;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAgentName(String agentName) 
    {
        this.agentName = agentName;
    }

    public String getAgentName() 
    {
        return agentName;
    }
    public void setTemplateName(String templateName) 
    {
        this.templateName = templateName;
    }

    public String getTemplateName() 
    {
        return templateName;
    }
    public void setFryeTax(String fryeTax) 
    {
        this.fryeTax = fryeTax;
    }

    public String getFryeTax() 
    {
        return fryeTax;
    }
    public void setFryedbCommission(String fryedbCommission) 
    {
        this.fryedbCommission = fryedbCommission;
    }

    public String getFryedbCommission() 
    {
        return fryedbCommission;
    }
    public void setJjfxyeTax(String jjfxyeTax) 
    {
        this.jjfxyeTax = jjfxyeTax;
    }

    public String getJjfxyeTax() 
    {
        return jjfxyeTax;
    }
    public void setJjfxyedbCommission(String jjfxyedbCommission) 
    {
        this.jjfxyedbCommission = jjfxyedbCommission;
    }

    public String getJjfxyedbCommission() 
    {
        return jjfxyedbCommission;
    }
    public void setCreationTime(Date creationTime) 
    {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() 
    {
        return creationTime;
    }
    public void setNote1(String note1) 
    {
        this.note1 = note1;
    }

    public String getNote1() 
    {
        return note1;
    }
    public void setNote2(String note2) 
    {
        this.note2 = note2;
    }

    public String getNote2() 
    {
        return note2;
    }
    public void setNote3(String note3) 
    {
        this.note3 = note3;
    }

    public String getNote3() 
    {
        return note3;
    }
    public void setNote4(String note4) 
    {
        this.note4 = note4;
    }

    public String getNote4() 
    {
        return note4;
    }
    public void setNote5(String note5) 
    {
        this.note5 = note5;
    }

    public String getNote5() 
    {
        return note5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("agentName", getAgentName())
            .append("templateName", getTemplateName())
            .append("fryeTax", getFryeTax())
            .append("fryedbCommission", getFryedbCommission())
            .append("jjfxyeTax", getJjfxyeTax())
            .append("jjfxyedbCommission", getJjfxyedbCommission())
            .append("creationTime", getCreationTime())
            .append("updateTime", getUpdateTime())
            .append("note1", getNote1())
            .append("note2", getNote2())
            .append("note3", getNote3())
            .append("note4", getNote4())
            .append("note5", getNote5())
            .toString();
    }
}
