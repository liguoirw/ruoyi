package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * shoujiceshi对象 shoujiceshi
 * 
 * @author ruoyi
 * @date 2024-01-05
 */
public class Shoujiceshi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 手机 */
    @Excel(name = "手机")
    private String shouji;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 学历 */
    @Excel(name = "学历")
    private String xueli;

    /** 地址 */
    @Excel(name = "地址")
    private String dizhi;

    /** 备注 */
    @Excel(name = "备注")
    private String bak;

    /** 能力 */
    @Excel(name = "能力")
    private String nengli;

    /** 吃饭 */
    @Excel(name = "吃饭")
    private String chifan;

    /** 备注1 */
    @Excel(name = "备注1")
    private String bak1;

    /**  */
    @Excel(name = "")
    private String bak2;

    /**  */
    @Excel(name = "")
    private String bak3;

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
    public void setShouji(String shouji) 
    {
        this.shouji = shouji;
    }

    public String getShouji() 
    {
        return shouji;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setXueli(String xueli) 
    {
        this.xueli = xueli;
    }

    public String getXueli() 
    {
        return xueli;
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
    public void setNengli(String nengli) 
    {
        this.nengli = nengli;
    }

    public String getNengli() 
    {
        return nengli;
    }
    public void setChifan(String chifan) 
    {
        this.chifan = chifan;
    }

    public String getChifan() 
    {
        return chifan;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("shouji", getShouji())
            .append("sex", getSex())
            .append("xueli", getXueli())
            .append("dizhi", getDizhi())
            .append("bak", getBak())
            .append("nengli", getNengli())
            .append("chifan", getChifan())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .toString();
    }
}
