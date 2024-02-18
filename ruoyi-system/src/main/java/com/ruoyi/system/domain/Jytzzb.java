package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 交易通知子对象 jytzzb
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public class Jytzzb extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    @Excel(name = "")
    private Long id;

    /**  */
    @Excel(name = "")
    private Long fid;

    /** 收单平台应答描述 */
    @Excel(name = "收单平台应答描述")
    private String sysRespDesc;

    /** 商户直属机构号 */
    @Excel(name = "商户直属机构号")
    private String agentId;

    /** 交易金额 */
    @Excel(name = "交易金额")
    private String amount;

    /** 终端批次号② */
    @Excel(name = "终端批次号②")
    private String batchNo;

    /** 授权码 */
    @Excel(name = "授权码")
    private String authCode;

    /** 收单平台应答码 */
    @Excel(name = "收单平台应答码")
    private String sysRespCode;

    /** 凭证号① */
    @Excel(name = "凭证号①")
    private String traceNo;

    /** 结算金额 */
    @Excel(name = "结算金额")
    private String settleAmount;

    /** 卡类型 0:借记卡，1:信用卡 */
    @Excel(name = "卡类型 0:借记卡，1:信用卡")
    private String cardType;

    /** 清算日期 */
    @Excel(name = "清算日期")
    private String settleDate;

    /** 商户手机号 */
    @Excel(name = "商户手机号")
    private String mobileNo;

    /** 手续费计算类型 Y - 优惠,M - 减免,B - 标准,YN - 云闪付NFC, YM - 云闪付双免 
本字段代表本笔交易的 商户手续费 费率类型 */
    @Excel(name = "手续费计算类型 Y - 优惠,M - 减免,B - 标准,YN - 云闪付NFC, YM - 云闪付双免本字段代表本笔交易的 商户手续费 费率类型")
    private String feeType;

    /** 卡号(带*) */
    @Excel(name = "卡号(带*)")
    private String cardNo;

    /** 终端型号④ */
    @Excel(name = "终端型号④")
    private String termModel;

    /** 商户类别 1 - A类商户； 2 - B类商户； 3 - C类商户； 4 - Z 类商户 */
    @Excel(name = "商户类别 1 - A类商户； 2 - B类商户； 3 - C类商户； 4 - Z 类商户")
    private String merchLevel;

    /** 商户名称 */
    @Excel(name = "商户名称")
    private String merchantName;

    /** 参考号 */
    @Excel(name = "参考号")
    private String rrn;

    /** 系统流水号 */
    @Excel(name = "系统流水号")
    private String sysTraceNo;

    /** 终端号④ */
    @Excel(name = "终端号④")
    private String termId;

    /** 终端SN④ */
    @Excel(name = "终端SN④")
    private String termSn;

    /** 交易时间 */
    @Excel(name = "交易时间")
    private String tranTime;

    /** 商户号 */
    @Excel(name = "商户号")
    private String merchantId;

    /** 输入方式 */
    @Excel(name = "输入方式")
    private String inputMode;

    /** 交易码 */
    @Excel(name = "交易码")
    private String tranCode;

    /** 渠道凭证号 */
    @Excel(name = "渠道凭证号")
    private String channelTraceNo;

    /** 渠道流水号 */
    @Excel(name = "渠道流水号")
    private String channelSerialNo;

    /** 渠道参考号 */
    @Excel(name = "渠道参考号")
    private String channelRrn;

    /** 订单号③ */
    @Excel(name = "订单号③")
    private String orderId;

    /** 发卡行 */
    @Excel(name = "发卡行")
    private String bankName;

    /** 扩展字段 */
    @Excel(name = "扩展字段")
    private String extend;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFid(Long fid) 
    {
        this.fid = fid;
    }

    public Long getFid() 
    {
        return fid;
    }
    public void setSysRespDesc(String sysRespDesc) 
    {
        this.sysRespDesc = sysRespDesc;
    }

    public String getSysRespDesc() 
    {
        return sysRespDesc;
    }
    public void setAgentId(String agentId) 
    {
        this.agentId = agentId;
    }

    public String getAgentId() 
    {
        return agentId;
    }
    public void setAmount(String amount) 
    {
        this.amount = amount;
    }

    public String getAmount() 
    {
        return amount;
    }
    public void setBatchNo(String batchNo) 
    {
        this.batchNo = batchNo;
    }

    public String getBatchNo() 
    {
        return batchNo;
    }
    public void setAuthCode(String authCode) 
    {
        this.authCode = authCode;
    }

    public String getAuthCode() 
    {
        return authCode;
    }
    public void setSysRespCode(String sysRespCode) 
    {
        this.sysRespCode = sysRespCode;
    }

    public String getSysRespCode() 
    {
        return sysRespCode;
    }
    public void setTraceNo(String traceNo) 
    {
        this.traceNo = traceNo;
    }

    public String getTraceNo() 
    {
        return traceNo;
    }
    public void setSettleAmount(String settleAmount) 
    {
        this.settleAmount = settleAmount;
    }

    public String getSettleAmount() 
    {
        return settleAmount;
    }
    public void setCardType(String cardType) 
    {
        this.cardType = cardType;
    }

    public String getCardType() 
    {
        return cardType;
    }
    public void setSettleDate(String settleDate) 
    {
        this.settleDate = settleDate;
    }

    public String getSettleDate() 
    {
        return settleDate;
    }
    public void setMobileNo(String mobileNo) 
    {
        this.mobileNo = mobileNo;
    }

    public String getMobileNo() 
    {
        return mobileNo;
    }
    public void setFeeType(String feeType) 
    {
        this.feeType = feeType;
    }

    public String getFeeType() 
    {
        return feeType;
    }
    public void setCardNo(String cardNo) 
    {
        this.cardNo = cardNo;
    }

    public String getCardNo() 
    {
        return cardNo;
    }
    public void setTermModel(String termModel) 
    {
        this.termModel = termModel;
    }

    public String getTermModel() 
    {
        return termModel;
    }
    public void setMerchLevel(String merchLevel) 
    {
        this.merchLevel = merchLevel;
    }

    public String getMerchLevel() 
    {
        return merchLevel;
    }
    public void setMerchantName(String merchantName) 
    {
        this.merchantName = merchantName;
    }

    public String getMerchantName() 
    {
        return merchantName;
    }
    public void setRrn(String rrn) 
    {
        this.rrn = rrn;
    }

    public String getRrn() 
    {
        return rrn;
    }
    public void setSysTraceNo(String sysTraceNo) 
    {
        this.sysTraceNo = sysTraceNo;
    }

    public String getSysTraceNo() 
    {
        return sysTraceNo;
    }
    public void setTermId(String termId) 
    {
        this.termId = termId;
    }

    public String getTermId() 
    {
        return termId;
    }
    public void setTermSn(String termSn) 
    {
        this.termSn = termSn;
    }

    public String getTermSn() 
    {
        return termSn;
    }
    public void setTranTime(String tranTime) 
    {
        this.tranTime = tranTime;
    }

    public String getTranTime() 
    {
        return tranTime;
    }
    public void setMerchantId(String merchantId) 
    {
        this.merchantId = merchantId;
    }

    public String getMerchantId() 
    {
        return merchantId;
    }
    public void setInputMode(String inputMode) 
    {
        this.inputMode = inputMode;
    }

    public String getInputMode() 
    {
        return inputMode;
    }
    public void setTranCode(String tranCode) 
    {
        this.tranCode = tranCode;
    }

    public String getTranCode() 
    {
        return tranCode;
    }
    public void setChannelTraceNo(String channelTraceNo) 
    {
        this.channelTraceNo = channelTraceNo;
    }

    public String getChannelTraceNo() 
    {
        return channelTraceNo;
    }
    public void setChannelSerialNo(String channelSerialNo) 
    {
        this.channelSerialNo = channelSerialNo;
    }

    public String getChannelSerialNo() 
    {
        return channelSerialNo;
    }
    public void setChannelRrn(String channelRrn) 
    {
        this.channelRrn = channelRrn;
    }

    public String getChannelRrn() 
    {
        return channelRrn;
    }
    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }
    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }
    public void setExtend(String extend) 
    {
        this.extend = extend;
    }

    public String getExtend() 
    {
        return extend;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fid", getFid())
            .append("sysRespDesc", getSysRespDesc())
            .append("agentId", getAgentId())
            .append("amount", getAmount())
            .append("batchNo", getBatchNo())
            .append("authCode", getAuthCode())
            .append("sysRespCode", getSysRespCode())
            .append("traceNo", getTraceNo())
            .append("settleAmount", getSettleAmount())
            .append("cardType", getCardType())
            .append("settleDate", getSettleDate())
            .append("mobileNo", getMobileNo())
            .append("feeType", getFeeType())
            .append("cardNo", getCardNo())
            .append("termModel", getTermModel())
            .append("merchLevel", getMerchLevel())
            .append("merchantName", getMerchantName())
            .append("rrn", getRrn())
            .append("sysTraceNo", getSysTraceNo())
            .append("termId", getTermId())
            .append("termSn", getTermSn())
            .append("tranTime", getTranTime())
            .append("merchantId", getMerchantId())
            .append("inputMode", getInputMode())
            .append("tranCode", getTranCode())
            .append("channelTraceNo", getChannelTraceNo())
            .append("channelSerialNo", getChannelSerialNo())
            .append("channelRrn", getChannelRrn())
            .append("orderId", getOrderId())
            .append("bankName", getBankName())
            .append("extend", getExtend())
            .toString();
    }
}
