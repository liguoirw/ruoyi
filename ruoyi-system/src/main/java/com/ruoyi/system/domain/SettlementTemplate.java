package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 金控对象 settlement_template
 * 
 * @author ztc
 * @date 2024-02-23
 */
public class SettlementTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 当前代理/创建人 */
    @Excel(name = "当前代理/创建人")
    private String founder;

    /** 模板名称 */
    @Excel(name = "模板名称")
    private String templateName;

    /** 金控特惠费率 */
    @Excel(name = "金控特惠费率")
    private String jkthRate;

    /** 快捷支付费率 */
    @Excel(name = "快捷支付费率")
    private String kjzfRate;

    /** 金控刷卡费率 */
    @Excel(name = "金控刷卡费率")
    private String jkskRate;

    /** 金控单笔 */
    @Excel(name = "金控单笔")
    private String jkDb;

    /** 金控借记卡封顶 */
    @Excel(name = "金控借记卡封顶")
    private String jkDebitCardCap;

    /** 金控扫码费率 */
    @Excel(name = "金控扫码费率")
    private String jksmRate;

    /** 扫码T1费率(%)(废弃) */
    @Excel(name = "扫码T1费率(%)(废弃)")
    private String smT1Rate;

    /** 扫码D0费率(%)(废弃) */
    @Excel(name = "扫码D0费率(%)(废弃)")
    private String smD0Rate;

    /** 智慧服务手续费(%)(废弃) */
    @Excel(name = "智慧服务手续费(%)(废弃)")
    private String zhfwCommission;

    /** 智慧交易手续费封顶(废弃) */
    @Excel(name = "智慧交易手续费封顶(废弃)")
    private String zhjyCommissionCap;

    /** 智慧交易手续费单笔(废弃) */
    @Excel(name = "智慧交易手续费单笔(废弃)")
    private String zhjyCommissionSingle;

    /** 普通交易手续费率(废弃) */
    @Excel(name = "普通交易手续费率(废弃)")
    private String ptjyCommissionRate;

    /** 普通交易手续费单笔(废弃) */
    @Excel(name = "普通交易手续费单笔(废弃)")
    private String ptjyCommissionSingle;

    /** 普通交易手续费封顶(废弃) */
    @Excel(name = "普通交易手续费封顶(废弃)")
    private String ptjyCommissionCap;

    /** 小额手续费费率(%)(废弃) */
    @Excel(name = "小额手续费费率(%)(废弃)")
    private String smallCommissionRate;

    /** 小额单笔(废弃) */
    @Excel(name = "小额单笔(废弃)")
    private String smallSingle;

    /** 小额T1费率(%)(废弃) */
    @Excel(name = "小额T1费率(%)(废弃)")
    private String smallT1Rate;

    /** 智慧交易T1费率(%)(废弃) */
    @Excel(name = "智慧交易T1费率(%)(废弃)")
    private String zhjyT1Rate;

    /** 普通交易T1费率(废弃)(%) */
    @Excel(name = "普通交易T1费率(废弃)(%)")
    private String ptjyTiRate;

    /** 快捷支付单笔(废弃) */
    @Excel(name = "快捷支付单笔(废弃)")
    private String kjzfSingle;

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
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
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
    public void setJkthRate(String jkthRate) 
    {
        this.jkthRate = jkthRate;
    }

    public String getJkthRate() 
    {
        return jkthRate;
    }
    public void setKjzfRate(String kjzfRate) 
    {
        this.kjzfRate = kjzfRate;
    }

    public String getKjzfRate() 
    {
        return kjzfRate;
    }
    public void setJkskRate(String jkskRate) 
    {
        this.jkskRate = jkskRate;
    }

    public String getJkskRate() 
    {
        return jkskRate;
    }
    public void setJkDb(String jkDb) 
    {
        this.jkDb = jkDb;
    }

    public String getJkDb() 
    {
        return jkDb;
    }
    public void setJkDebitCardCap(String jkDebitCardCap) 
    {
        this.jkDebitCardCap = jkDebitCardCap;
    }

    public String getJkDebitCardCap() 
    {
        return jkDebitCardCap;
    }
    public void setJksmRate(String jksmRate) 
    {
        this.jksmRate = jksmRate;
    }

    public String getJksmRate() 
    {
        return jksmRate;
    }
    public void setSmT1Rate(String smT1Rate) 
    {
        this.smT1Rate = smT1Rate;
    }

    public String getSmT1Rate() 
    {
        return smT1Rate;
    }
    public void setSmD0Rate(String smD0Rate) 
    {
        this.smD0Rate = smD0Rate;
    }

    public String getSmD0Rate() 
    {
        return smD0Rate;
    }
    public void setZhfwCommission(String zhfwCommission) 
    {
        this.zhfwCommission = zhfwCommission;
    }

    public String getZhfwCommission() 
    {
        return zhfwCommission;
    }
    public void setZhjyCommissionCap(String zhjyCommissionCap) 
    {
        this.zhjyCommissionCap = zhjyCommissionCap;
    }

    public String getZhjyCommissionCap() 
    {
        return zhjyCommissionCap;
    }
    public void setZhjyCommissionSingle(String zhjyCommissionSingle) 
    {
        this.zhjyCommissionSingle = zhjyCommissionSingle;
    }

    public String getZhjyCommissionSingle() 
    {
        return zhjyCommissionSingle;
    }
    public void setPtjyCommissionRate(String ptjyCommissionRate) 
    {
        this.ptjyCommissionRate = ptjyCommissionRate;
    }

    public String getPtjyCommissionRate() 
    {
        return ptjyCommissionRate;
    }
    public void setPtjyCommissionSingle(String ptjyCommissionSingle) 
    {
        this.ptjyCommissionSingle = ptjyCommissionSingle;
    }

    public String getPtjyCommissionSingle() 
    {
        return ptjyCommissionSingle;
    }
    public void setPtjyCommissionCap(String ptjyCommissionCap) 
    {
        this.ptjyCommissionCap = ptjyCommissionCap;
    }

    public String getPtjyCommissionCap() 
    {
        return ptjyCommissionCap;
    }
    public void setSmallCommissionRate(String smallCommissionRate) 
    {
        this.smallCommissionRate = smallCommissionRate;
    }

    public String getSmallCommissionRate() 
    {
        return smallCommissionRate;
    }
    public void setSmallSingle(String smallSingle) 
    {
        this.smallSingle = smallSingle;
    }

    public String getSmallSingle() 
    {
        return smallSingle;
    }
    public void setSmallT1Rate(String smallT1Rate) 
    {
        this.smallT1Rate = smallT1Rate;
    }

    public String getSmallT1Rate() 
    {
        return smallT1Rate;
    }
    public void setZhjyT1Rate(String zhjyT1Rate) 
    {
        this.zhjyT1Rate = zhjyT1Rate;
    }

    public String getZhjyT1Rate() 
    {
        return zhjyT1Rate;
    }
    public void setPtjyTiRate(String ptjyTiRate) 
    {
        this.ptjyTiRate = ptjyTiRate;
    }

    public String getPtjyTiRate() 
    {
        return ptjyTiRate;
    }
    public void setKjzfSingle(String kjzfSingle) 
    {
        this.kjzfSingle = kjzfSingle;
    }

    public String getKjzfSingle() 
    {
        return kjzfSingle;
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
            .append("brand", getBrand())
            .append("founder", getFounder())
            .append("templateName", getTemplateName())
            .append("jkthRate", getJkthRate())
            .append("kjzfRate", getKjzfRate())
            .append("jkskRate", getJkskRate())
            .append("jkDb", getJkDb())
            .append("jkDebitCardCap", getJkDebitCardCap())
            .append("jksmRate", getJksmRate())
            .append("smT1Rate", getSmT1Rate())
            .append("smD0Rate", getSmD0Rate())
            .append("zhfwCommission", getZhfwCommission())
            .append("zhjyCommissionCap", getZhjyCommissionCap())
            .append("zhjyCommissionSingle", getZhjyCommissionSingle())
            .append("ptjyCommissionRate", getPtjyCommissionRate())
            .append("ptjyCommissionSingle", getPtjyCommissionSingle())
            .append("ptjyCommissionCap", getPtjyCommissionCap())
            .append("smallCommissionRate", getSmallCommissionRate())
            .append("smallSingle", getSmallSingle())
            .append("smallT1Rate", getSmallT1Rate())
            .append("zhjyT1Rate", getZhjyT1Rate())
            .append("ptjyTiRate", getPtjyTiRate())
            .append("kjzfSingle", getKjzfSingle())
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
