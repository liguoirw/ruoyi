package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试对象 ceshi
 * 
 * @author ruoyi
 * @date 2024-01-15
 */
public class Ceshi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    @Excel(name = "")
    private Long id;

    /** 名 */
    @Excel(name = "名")
    private String name;

    /** 文件地址 */
    @Excel(name = "文件地址")
    private String wenjiandizhi;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String tupiandizhi;

    /** 备注 */
    @Excel(name = "备注")
    private String bak;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setWenjiandizhi(String wenjiandizhi) 
    {
        this.wenjiandizhi = wenjiandizhi;
    }

    public String getWenjiandizhi() 
    {
        return wenjiandizhi;
    }
    public void setTupiandizhi(String tupiandizhi) 
    {
        this.tupiandizhi = tupiandizhi;
    }

    public String getTupiandizhi() 
    {
        return tupiandizhi;
    }
    public void setBak(String bak) 
    {
        this.bak = bak;
    }

    public String getBak() 
    {
        return bak;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("wenjiandizhi", getWenjiandizhi())
            .append("tupiandizhi", getTupiandizhi())
            .append("bak", getBak())
            .toString();
    }
}
