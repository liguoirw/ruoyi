package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 划拨记录对象 terminal_transfer
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
public class TerminalTransfer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    @Excel(name = "序号")
    private Long id;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 出库人 */
    @Excel(name = "出库人")
    private String outboundPerson;

    /** SN号 */
    @Excel(name = "SN号")
    private String sn;

    /** 接收人 */
    @Excel(name = "接收人")
    private String recipient;

    /** 划拨方式 */
    @Excel(name = "划拨方式")
    private String transferMethod;

    /** 状态 */
    private String state;

    /** $column.columnComment */
    private String bak1;

    /** $column.columnComment */
    private String bak2;

    /** $column.columnComment */
    private String bak3;

    /** $column.columnComment */
    private String bak4;

    /** $column.columnComment */
    private String bak5;

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
    public void setOutboundPerson(String outboundPerson) 
    {
        this.outboundPerson = outboundPerson;
    }

    public String getOutboundPerson() 
    {
        return outboundPerson;
    }
    public void setSn(String sn) 
    {
        this.sn = sn;
    }

    public String getSn() 
    {
        return sn;
    }
    public void setRecipient(String recipient) 
    {
        this.recipient = recipient;
    }

    public String getRecipient() 
    {
        return recipient;
    }
    public void setTransferMethod(String transferMethod) 
    {
        this.transferMethod = transferMethod;
    }

    public String getTransferMethod() 
    {
        return transferMethod;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
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
    public void setBak4(String bak4) 
    {
        this.bak4 = bak4;
    }

    public String getBak4() 
    {
        return bak4;
    }
    public void setBak5(String bak5) 
    {
        this.bak5 = bak5;
    }

    public String getBak5() 
    {
        return bak5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("brand", getBrand())
            .append("outboundPerson", getOutboundPerson())
            .append("sn", getSn())
            .append("recipient", getRecipient())
            .append("transferMethod", getTransferMethod())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("state", getState())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("bak4", getBak4())
            .append("bak5", getBak5())
            .toString();
    }
}
