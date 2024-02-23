package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 交易对象 yky_transation
 * 
 * @author ruoyi
 * @date 2024-02-18
 */
public class YkyTransation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 交易编号 */
    private Long transId;

    /** 品牌 */
    @Excel(name = "品牌")
    private String machineBrand;

    /** 商户名称 */
    @Excel(name = "商户名称")
    private String merchantName;

    /** 商户号 */
    @Excel(name = "商户号")
    private String merchantId;

    /** 直属代理商名称 */
    @Excel(name = "直属代理商名称")
    private String underAgentName;

    /** 代理商电话 */
    @Excel(name = "代理商电话")
    private String merchantTel;

    /** 终端sn */
    @Excel(name = "终端sn")
    private String machineSN;

    /** 一代编号 */
    @Excel(name = "一代编号")
    private String firLevAgentId;

    /** 交易金额 */
    @Excel(name = "交易金额")
    private String transAmount;

    /** 交易费率 */
    @Excel(name = "交易费率")
    private String transFee;

    /** 交易类型 */
    @Excel(name = "交易类型")
    private String transType;

    /** 交易完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交易完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date transTime;

    /** 交易号 */
    @Excel(name = "交易号")
    private String transNo;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    public void setTransId(Long transId) 
    {
        this.transId = transId;
    }

    public Long getTransId() 
    {
        return transId;
    }
    public void setMachineBrand(String machineBrand) 
    {
        this.machineBrand = machineBrand;
    }

    public String getMachineBrand() 
    {
        return machineBrand;
    }
    public void setMerchantName(String merchantName) 
    {
        this.merchantName = merchantName;
    }

    public String getMerchantName() 
    {
        return merchantName;
    }
    public void setMerchantId(String merchantId) 
    {
        this.merchantId = merchantId;
    }

    public String getMerchantId() 
    {
        return merchantId;
    }
    public void setUnderAgentName(String underAgentName) 
    {
        this.underAgentName = underAgentName;
    }

    public String getUnderAgentName() 
    {
        return underAgentName;
    }
    public void setMerchantTel(String merchantTel) 
    {
        this.merchantTel = merchantTel;
    }

    public String getMerchantTel() 
    {
        return merchantTel;
    }
    public void setMachineSN(String machineSN) 
    {
        this.machineSN = machineSN;
    }

    public String getMachineSN() 
    {
        return machineSN;
    }
    public void setFirLevAgentId(String firLevAgentId) 
    {
        this.firLevAgentId = firLevAgentId;
    }

    public String getFirLevAgentId() 
    {
        return firLevAgentId;
    }
    public void setTransAmount(String transAmount) 
    {
        this.transAmount = transAmount;
    }

    public String getTransAmount() 
    {
        return transAmount;
    }
    public void setTransFee(String transFee) 
    {
        this.transFee = transFee;
    }

    public String getTransFee() 
    {
        return transFee;
    }
    public void setTransType(String transType) 
    {
        this.transType = transType;
    }

    public String getTransType() 
    {
        return transType;
    }
    public void setTransTime(Date transTime) 
    {
        this.transTime = transTime;
    }

    public Date getTransTime() 
    {
        return transTime;
    }
    public void setTransNo(String transNo) 
    {
        this.transNo = transNo;
    }

    public String getTransNo() 
    {
        return transNo;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("transId", getTransId())
            .append("machineBrand", getMachineBrand())
            .append("merchantName", getMerchantName())
            .append("merchantId", getMerchantId())
            .append("underAgentName", getUnderAgentName())
            .append("merchantTel", getMerchantTel())
            .append("machineSN", getMachineSN())
            .append("firLevAgentId", getFirLevAgentId())
            .append("transAmount", getTransAmount())
            .append("transFee", getTransFee())
            .append("transType", getTransType())
            .append("transTime", getTransTime())
            .append("transNo", getTransNo())
            .append("creatTime", getCreatTime())
            .toString();
    }
}
