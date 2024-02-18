package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 交易通知主对象 jytzz
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public class Jytzz extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    @Excel(name = "")
    private Long id;

    /** 交易通知配置机构号 */
    @Excel(name = "交易通知配置机构号")
    private String configAgentId;

    /** 交易通知推送批次号 */
    @Excel(name = "交易通知推送批次号")
    private String sendBatchNo;

    /** 数据的推送条数 */
    @Excel(name = "数据的推送条数")
    private String sendNum;

    /** 数据的推送时间 */
    @Excel(name = "数据的推送时间")
    private String sendTime;

    /** 交易日期 */
    @Excel(name = "交易日期")
    private String transDate;

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
    public void setSendNum(String sendNum) 
    {
        this.sendNum = sendNum;
    }

    public String getSendNum() 
    {
        return sendNum;
    }
    public void setSendTime(String sendTime) 
    {
        this.sendTime = sendTime;
    }

    public String getSendTime() 
    {
        return sendTime;
    }
    public void setTransDate(String transDate) 
    {
        this.transDate = transDate;
    }

    public String getTransDate() 
    {
        return transDate;
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
            .append("sendNum", getSendNum())
            .append("sendTime", getSendTime())
            .append("transDate", getTransDate())
            .append("sign", getSign())
            .toString();
    }
}
