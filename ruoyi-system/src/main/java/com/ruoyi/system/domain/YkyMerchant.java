package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商户对象 yky_merchant
 * 
 * @author ruoyi
 * @date 2024-02-02
 */
public class YkyMerchant extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商户编号 */
    private Long merchantId;

    /** 机具品牌 */
    @Excel(name = "机具品牌")
    private String machineBrand;

    /** 机具sn */
    @Excel(name = "机具sn")
    private String machineSN;

    /** 直属代理商 */
    @Excel(name = "直属代理商")
    private String underAgentNo;

    /** 代理商电话 */
    @Excel(name = "代理商电话")
    private String agentTel;

    /** 商户名称 */
    @Excel(name = "商户名称")
    private String merchantName;

    /** 法人名称 */
    @Excel(name = "法人名称")
    private String legalName;

    /** 商户编号 */
    @Excel(name = "商户编号")
    private String merchantNo;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String telePhone;

    /** 累计交易 */
    @Excel(name = "累计交易")
    private String accumTrans;

    /** 一代机构号 */
    @Excel(name = "一代机构号")
    private String firLevAgentNo;

    /** 信用卡手续费费率(%) */
    @Excel(name = "信用卡手续费费率(%)")
    private String creCardProcFee;

    /** 借记卡手续费费率(%) */
    @Excel(name = "借记卡手续费费率(%)")
    private String debCardProcFee;

    /** 借记卡手续费最大值(元) */
    @Excel(name = "借记卡手续费最大值(元)")
    private String debCardProcMax;

    /** 微信手续费费率(%) */
    @Excel(name = "微信手续费费率(%)")
    private String wxProcFee;

    /** 支付宝手续费费率(%) */
    @Excel(name = "支付宝手续费费率(%)")
    private String aliPayProcFee;

    /** 云闪付信用卡手续费费率(%) */
    @Excel(name = "云闪付信用卡手续费费率(%)")
    private String yunCreCardFee;

    /** 云闪付借记卡手续费费率(%) */
    @Excel(name = "云闪付借记卡手续费费率(%)")
    private String yunDebCardFee;

    /** 单笔 */
    @Excel(name = "单笔")
    private String singleStroke;

    /** pos机服务费金额(元) */
    @Excel(name = "pos机服务费金额(元)")
    private String posCharge;

    /** vip服务费金额(元) */
    @Excel(name = "vip服务费金额(元)")
    private String vipCharge;

    /** sim服务费金额(元) */
    @Excel(name = "sim服务费金额(元)")
    private String simCharge;

    /** 首次交易时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "首次交易时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstTransTime;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    public void setMerchantId(Long merchantId) 
    {
        this.merchantId = merchantId;
    }

    public Long getMerchantId() 
    {
        return merchantId;
    }
    public void setMachineBrand(String machineBrand) 
    {
        this.machineBrand = machineBrand;
    }

    public String getMachineBrand() 
    {
        return machineBrand;
    }
    public void setMachineSN(String machineSN) 
    {
        this.machineSN = machineSN;
    }

    public String getMachineSN() 
    {
        return machineSN;
    }
    public void setUnderAgentNo(String underAgentNo) 
    {
        this.underAgentNo = underAgentNo;
    }

    public String getUnderAgentNo() 
    {
        return underAgentNo;
    }
    public void setAgentTel(String agentTel) 
    {
        this.agentTel = agentTel;
    }

    public String getAgentTel() 
    {
        return agentTel;
    }
    public void setMerchantName(String merchantName) 
    {
        this.merchantName = merchantName;
    }

    public String getMerchantName() 
    {
        return merchantName;
    }
    public void setLegalName(String legalName) 
    {
        this.legalName = legalName;
    }

    public String getLegalName() 
    {
        return legalName;
    }
    public void setMerchantNo(String merchantNo) 
    {
        this.merchantNo = merchantNo;
    }

    public String getMerchantNo() 
    {
        return merchantNo;
    }
    public void setTelePhone(String telePhone) 
    {
        this.telePhone = telePhone;
    }

    public String getTelePhone() 
    {
        return telePhone;
    }
    public void setAccumTrans(String accumTrans) 
    {
        this.accumTrans = accumTrans;
    }

    public String getAccumTrans() 
    {
        return accumTrans;
    }
    public void setFirLevAgentNo(String firLevAgentNo) 
    {
        this.firLevAgentNo = firLevAgentNo;
    }

    public String getFirLevAgentNo() 
    {
        return firLevAgentNo;
    }
    public void setCreCardProcFee(String creCardProcFee) 
    {
        this.creCardProcFee = creCardProcFee;
    }

    public String getCreCardProcFee() 
    {
        return creCardProcFee;
    }
    public void setDebCardProcFee(String debCardProcFee) 
    {
        this.debCardProcFee = debCardProcFee;
    }

    public String getDebCardProcFee() 
    {
        return debCardProcFee;
    }
    public void setDebCardProcMax(String debCardProcMax) 
    {
        this.debCardProcMax = debCardProcMax;
    }

    public String getDebCardProcMax() 
    {
        return debCardProcMax;
    }
    public void setWxProcFee(String wxProcFee) 
    {
        this.wxProcFee = wxProcFee;
    }

    public String getWxProcFee() 
    {
        return wxProcFee;
    }
    public void setAliPayProcFee(String aliPayProcFee) 
    {
        this.aliPayProcFee = aliPayProcFee;
    }

    public String getAliPayProcFee() 
    {
        return aliPayProcFee;
    }
    public void setYunCreCardFee(String yunCreCardFee) 
    {
        this.yunCreCardFee = yunCreCardFee;
    }

    public String getYunCreCardFee() 
    {
        return yunCreCardFee;
    }
    public void setYunDebCardFee(String yunDebCardFee) 
    {
        this.yunDebCardFee = yunDebCardFee;
    }

    public String getYunDebCardFee() 
    {
        return yunDebCardFee;
    }
    public void setSingleStroke(String singleStroke) 
    {
        this.singleStroke = singleStroke;
    }

    public String getSingleStroke() 
    {
        return singleStroke;
    }
    public void setPosCharge(String posCharge) 
    {
        this.posCharge = posCharge;
    }

    public String getPosCharge() 
    {
        return posCharge;
    }
    public void setVipCharge(String vipCharge) 
    {
        this.vipCharge = vipCharge;
    }

    public String getVipCharge() 
    {
        return vipCharge;
    }
    public void setSimCharge(String simCharge) 
    {
        this.simCharge = simCharge;
    }

    public String getSimCharge() 
    {
        return simCharge;
    }
    public void setFirstTransTime(Date firstTransTime) 
    {
        this.firstTransTime = firstTransTime;
    }

    public Date getFirstTransTime() 
    {
        return firstTransTime;
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
            .append("merchantId", getMerchantId())
            .append("machineBrand", getMachineBrand())
            .append("machineSN", getMachineSN())
            .append("underAgentNo", getUnderAgentNo())
            .append("agentTel", getAgentTel())
            .append("merchantName", getMerchantName())
            .append("legalName", getLegalName())
            .append("merchantNo", getMerchantNo())
            .append("telePhone", getTelePhone())
            .append("accumTrans", getAccumTrans())
            .append("firLevAgentNo", getFirLevAgentNo())
            .append("creCardProcFee", getCreCardProcFee())
            .append("debCardProcFee", getDebCardProcFee())
            .append("debCardProcMax", getDebCardProcMax())
            .append("wxProcFee", getWxProcFee())
            .append("aliPayProcFee", getAliPayProcFee())
            .append("yunCreCardFee", getYunCreCardFee())
            .append("yunDebCardFee", getYunDebCardFee())
            .append("singleStroke", getSingleStroke())
            .append("posCharge", getPosCharge())
            .append("vipCharge", getVipCharge())
            .append("simCharge", getSimCharge())
            .append("firstTransTime", getFirstTransTime())
            .append("creatTime", getCreatTime())
            .toString();
    }
}
