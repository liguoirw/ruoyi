package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 品牌型号对象 yky_brand
 * 
 * @author ruoyi
 * @date 2024-02-19
 */
public class YkyBrand extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long brandId;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 厂家 */
    @Excel(name = "厂家")
    private String manufacName;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brandName;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 服务费收取最大值 */
    @Excel(name = "服务费收取最大值")
    private String servCharMax;

    /** 图片 */
    @Excel(name = "图片")
    private String machinePictue;

    /** 备份字段1 */
    @Excel(name = "备份字段1")
    private String bake1;

    /** 备份字段2 */
    @Excel(name = "备份字段2")
    private String bake2;

    public void setBrandId(Long brandId) 
    {
        this.brandId = brandId;
    }

    public Long getBrandId() 
    {
        return brandId;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setManufacName(String manufacName) 
    {
        this.manufacName = manufacName;
    }

    public String getManufacName() 
    {
        return manufacName;
    }
    public void setBrandName(String brandName) 
    {
        this.brandName = brandName;
    }

    public String getBrandName() 
    {
        return brandName;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setServCharMax(String servCharMax) 
    {
        this.servCharMax = servCharMax;
    }

    public String getServCharMax() 
    {
        return servCharMax;
    }
    public void setMachinePictue(String machinePictue) 
    {
        this.machinePictue = machinePictue;
    }

    public String getMachinePictue() 
    {
        return machinePictue;
    }
    public void setBake1(String bake1) 
    {
        this.bake1 = bake1;
    }

    public String getBake1() 
    {
        return bake1;
    }
    public void setBake2(String bake2) 
    {
        this.bake2 = bake2;
    }

    public String getBake2() 
    {
        return bake2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("brandId", getBrandId())
            .append("sort", getSort())
            .append("manufacName", getManufacName())
            .append("brandName", getBrandName())
            .append("model", getModel())
            .append("servCharMax", getServCharMax())
            .append("machinePictue", getMachinePictue())
            .append("bake1", getBake1())
            .append("bake2", getBake2())
            .toString();
    }
}
