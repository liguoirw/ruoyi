package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 机具调拨记录对象 terminal_implement
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
public class TerminalImplement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** SN码 */
    @Excel(name = "SN码")
    private String sn;

    /** 调拨前 */
    @Excel(name = "调拨前")
    private String beforeAllocation;

    /** 调拨后 */
    @Excel(name = "调拨后")
    private String afterAllocation;

    /** 状态 */
    private String state;

    /** $column.columnComment */
    private String bak1;

    /** $column.columnComment */
    private String bak2;

    /** $column.columnComment */
    private String bak3;

    /** $column.columnComment */
    private String bak4;

    /** $column.columnComment */
    private String bak5;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSn(String sn) 
    {
        this.sn = sn;
    }

    public String getSn() 
    {
        return sn;
    }
    public void setBeforeAllocation(String beforeAllocation) 
    {
        this.beforeAllocation = beforeAllocation;
    }

    public String getBeforeAllocation() 
    {
        return beforeAllocation;
    }
    public void setAfterAllocation(String afterAllocation) 
    {
        this.afterAllocation = afterAllocation;
    }

    public String getAfterAllocation() 
    {
        return afterAllocation;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setBak1(String bak1) 
    {
        this.bak1 = bak1;
    }

    public String getBak1() 
    {
        return bak1;
    }
    public void setBak2(String bak2) 
    {
        this.bak2 = bak2;
    }

    public String getBak2() 
    {
        return bak2;
    }
    public void setBak3(String bak3) 
    {
        this.bak3 = bak3;
    }

    public String getBak3() 
    {
        return bak3;
    }
    public void setBak4(String bak4) 
    {
        this.bak4 = bak4;
    }

    public String getBak4() 
    {
        return bak4;
    }
    public void setBak5(String bak5) 
    {
        this.bak5 = bak5;
    }

    public String getBak5() 
    {
        return bak5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sn", getSn())
            .append("beforeAllocation", getBeforeAllocation())
            .append("afterAllocation", getAfterAllocation())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("state", getState())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("bak4", getBak4())
            .append("bak5", getBak5())
            .toString();
    }
}
