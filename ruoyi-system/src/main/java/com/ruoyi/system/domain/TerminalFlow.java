package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 流量费冻结记录对象 terminal_flow
 * 
 * @author wutianxiang
 * @date 2024-02-22
 */
public class TerminalFlow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** sn码 */
    @Excel(name = "sn码")
    private Long sn;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brandId;

    /** 商户号 */
    @Excel(name = "商户号")
    private Long merchantNum;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String merchantName;

    /** 冻结状态 */
    @Excel(name = "冻结状态")
    private String state;

    /** 回执号 */
    @Excel(name = "回执号")
    private Long receiptNum;

    /** 流水号 */
    @Excel(name = "流水号")
    private Long serialNum;

    /** 金额 */
    @Excel(name = "金额")
    private Long money;

    /** 代理商 */
    @Excel(name = "代理商")
    private Long agent;

    /** 代理商电话 */
    @Excel(name = "代理商电话")
    private Long agentPhone;

    /** 请求回执 */
    @Excel(name = "请求回执")
    private String requestReceipt;

    /** 完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date completeTime;

    /** $column.columnComment */
    private String ceshi3;

    /** $column.columnComment */
    private String ceshi2;

    /** $column.columnComment */
    private String ceshi4;

    /** $column.columnComment */
    private String ceshi5;

    /** $column.columnComment */
    private String ceshi6;

    /** $column.columnComment */
    private String ceshi7;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSn(Long sn) 
    {
        this.sn = sn;
    }

    public Long getSn() 
    {
        return sn;
    }
    public void setBrandId(String brandId) 
    {
        this.brandId = brandId;
    }

    public String getBrandId() 
    {
        return brandId;
    }
    public void setMerchantNum(Long merchantNum) 
    {
        this.merchantNum = merchantNum;
    }

    public Long getMerchantNum() 
    {
        return merchantNum;
    }
    public void setMerchantName(String merchantName) 
    {
        this.merchantName = merchantName;
    }

    public String getMerchantName() 
    {
        return merchantName;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setReceiptNum(Long receiptNum) 
    {
        this.receiptNum = receiptNum;
    }

    public Long getReceiptNum() 
    {
        return receiptNum;
    }
    public void setSerialNum(Long serialNum) 
    {
        this.serialNum = serialNum;
    }

    public Long getSerialNum() 
    {
        return serialNum;
    }
    public void setMoney(Long money) 
    {
        this.money = money;
    }

    public Long getMoney() 
    {
        return money;
    }
    public void setAgent(Long agent) 
    {
        this.agent = agent;
    }

    public Long getAgent() 
    {
        return agent;
    }
    public void setAgentPhone(Long agentPhone) 
    {
        this.agentPhone = agentPhone;
    }

    public Long getAgentPhone() 
    {
        return agentPhone;
    }
    public void setRequestReceipt(String requestReceipt) 
    {
        this.requestReceipt = requestReceipt;
    }

    public String getRequestReceipt() 
    {
        return requestReceipt;
    }
    public void setCompleteTime(Date completeTime) 
    {
        this.completeTime = completeTime;
    }

    public Date getCompleteTime() 
    {
        return completeTime;
    }
    public void setCeshi3(String ceshi3) 
    {
        this.ceshi3 = ceshi3;
    }

    public String getCeshi3() 
    {
        return ceshi3;
    }
    public void setCeshi2(String ceshi2) 
    {
        this.ceshi2 = ceshi2;
    }

    public String getCeshi2() 
    {
        return ceshi2;
    }
    public void setCeshi4(String ceshi4) 
    {
        this.ceshi4 = ceshi4;
    }

    public String getCeshi4() 
    {
        return ceshi4;
    }
    public void setCeshi5(String ceshi5) 
    {
        this.ceshi5 = ceshi5;
    }

    public String getCeshi5() 
    {
        return ceshi5;
    }
    public void setCeshi6(String ceshi6) 
    {
        this.ceshi6 = ceshi6;
    }

    public String getCeshi6() 
    {
        return ceshi6;
    }
    public void setCeshi7(String ceshi7) 
    {
        this.ceshi7 = ceshi7;
    }

    public String getCeshi7() 
    {
        return ceshi7;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sn", getSn())
            .append("brandId", getBrandId())
            .append("merchantNum", getMerchantNum())
            .append("merchantName", getMerchantName())
            .append("state", getState())
            .append("receiptNum", getReceiptNum())
            .append("serialNum", getSerialNum())
            .append("money", getMoney())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("agent", getAgent())
            .append("agentPhone", getAgentPhone())
            .append("requestReceipt", getRequestReceipt())
            .append("completeTime", getCompleteTime())
            .append("ceshi3", getCeshi3())
            .append("ceshi2", getCeshi2())
            .append("ceshi4", getCeshi4())
            .append("ceshi5", getCeshi5())
            .append("ceshi6", getCeshi6())
            .append("ceshi7", getCeshi7())
            .toString();
    }
}
