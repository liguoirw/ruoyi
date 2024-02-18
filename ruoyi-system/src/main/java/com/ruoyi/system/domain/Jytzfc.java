package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 交易通知返参对象 jytzfc
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public class Jytzfc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 交易通知配置机构号 */
    @Excel(name = "交易通知配置机构号")
    private String configAgentId;

    /** 交易通知推送批次号 */
    @Excel(name = "交易通知推送批次号")
    private String sendBatchNo;

    /** 交易日期 */
    @Excel(name = "交易日期")
    private String transDate;

    /** 接收到交易流水的时间 */
    @Excel(name = "接收到交易流水的时间")
    private String revTime;

    /** 应答码 */
    @Excel(name = "应答码")
    private String responseCode;

    /** 应答描述 */
    @Excel(name = "应答描述")
    private String responseDesc;

    /** 签名 */
    @Excel(name = "签名")
    private String sign;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setConfigAgentId(String configAgentId) 
    {
        this.configAgentId = configAgentId;
    }

    public String getConfigAgentId() 
    {
        return configAgentId;
    }
    public void setSendBatchNo(String sendBatchNo) 
    {
        this.sendBatchNo = sendBatchNo;
    }

    public String getSendBatchNo() 
    {
        return sendBatchNo;
    }
    public void setTransDate(String transDate) 
    {
        this.transDate = transDate;
    }

    public String getTransDate() 
    {
        return transDate;
    }
    public void setRevTime(String revTime) 
    {
        this.revTime = revTime;
    }

    public String getRevTime() 
    {
        return revTime;
    }
    public void setResponseCode(String responseCode) 
    {
        this.responseCode = responseCode;
    }

    public String getResponseCode() 
    {
        return responseCode;
    }
    public void setResponseDesc(String responseDesc) 
    {
        this.responseDesc = responseDesc;
    }

    public String getResponseDesc() 
    {
        return responseDesc;
    }
    public void setSign(String sign) 
    {
        this.sign = sign;
    }

    public String getSign() 
    {
        return sign;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("configAgentId", getConfigAgentId())
            .append("sendBatchNo", getSendBatchNo())
            .append("transDate", getTransDate())
            .append("revTime", getRevTime())
            .append("responseCode", getResponseCode())
            .append("responseDesc", getResponseDesc())
            .append("sign", getSign())
            .toString();
    }
}
