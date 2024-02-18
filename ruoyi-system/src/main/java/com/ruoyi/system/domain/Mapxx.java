package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 地图信息对象 mapxx
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
public class Mapxx extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    @Excel(name = "")
    private Long id;

    /** 经 */
    @Excel(name = "经")
    private String jing;

    /** 纬 */
    @Excel(name = "纬")
    private String wei;

    /** 图片 */
    @Excel(name = "图片")
    private String tupian;

    /** 地址 */
    @Excel(name = "地址")
    private String dizhi;

    /** 备注 */
    @Excel(name = "备注")
    private String bak;

    /** 状态（1激活 2已使用） */
    @Excel(name = "状态", readConverterExp = "1=激活,2=已使用")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setJing(String jing) 
    {
        this.jing = jing;
    }

    public String getJing() 
    {
        return jing;
    }
    public void setWei(String wei) 
    {
        this.wei = wei;
    }

    public String getWei() 
    {
        return wei;
    }
    public void setTupian(String tupian) 
    {
        this.tupian = tupian;
    }

    public String getTupian() 
    {
        return tupian;
    }
    public void setDizhi(String dizhi) 
    {
        this.dizhi = dizhi;
    }

    public String getDizhi() 
    {
        return dizhi;
    }
    public void setBak(String bak) 
    {
        this.bak = bak;
    }

    public String getBak() 
    {
        return bak;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("jing", getJing())
            .append("wei", getWei())
            .append("tupian", getTupian())
            .append("dizhi", getDizhi())
            .append("bak", getBak())
            .append("status", getStatus())
            .toString();
    }
}
