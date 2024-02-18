package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 问卷结果对象 wenjuanjieguo
 * 
 * @author ruoyi
 * @date 2024-01-12
 */
public class Wenjuanjieguo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    @Excel(name = "")
    private Long id;

    /** 编码 */
    @Excel(name = "编码")
    private String bianma;

    /** 备注 */
    @Excel(name = "备注")
    private String bak;

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

    /** $column.columnComment */
    private String bak6;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBianma(String bianma) 
    {
        this.bianma = bianma;
    }

    public String getBianma() 
    {
        return bianma;
    }
    public void setBak(String bak) 
    {
        this.bak = bak;
    }

    public String getBak() 
    {
        return bak;
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
    public void setBak6(String bak6) 
    {
        this.bak6 = bak6;
    }

    public String getBak6() 
    {
        return bak6;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bianma", getBianma())
            .append("bak", getBak())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("bak4", getBak4())
            .append("bak5", getBak5())
            .append("bak6", getBak6())
            .toString();
    }
}
