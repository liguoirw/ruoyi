package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 绑机通知对象 bdtz
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
public class Bdtz extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 终端号 */
    @Excel(name = "终端号")
    private String termId;

    /** 终端SN */
    @Excel(name = "终端SN")
    private String termSn;

    /** 商户直属机构号 */
    @Excel(name = "商户直属机构号")
    private String agentId;

    /** 商户号 */
    @Excel(name = "商户号")
    private String merchantId;

    /** 终端型号 */
    @Excel(name = "终端型号")
    private String termModel;

    /** 助贷通版本号 */
    @Excel(name = "助贷通版本号")
    private String version;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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
    public void setAgentId(String agentId) 
    {
        this.agentId = agentId;
    }

    public String getAgentId() 
    {
        return agentId;
    }
    public void setMerchantId(String merchantId) 
    {
        this.merchantId = merchantId;
    }

    public String getMerchantId() 
    {
        return merchantId;
    }
    public void setTermModel(String termModel) 
    {
        this.termModel = termModel;
    }

    public String getTermModel() 
    {
        return termModel;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("termId", getTermId())
            .append("termSn", getTermSn())
            .append("agentId", getAgentId())
            .append("merchantId", getMerchantId())
            .append("termModel", getTermModel())
            .append("version", getVersion())
            .toString();
    }
}
