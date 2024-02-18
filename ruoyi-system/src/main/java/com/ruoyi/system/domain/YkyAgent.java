package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 代理商对象 yky_agent
 * 
 * @author ruoyi
 * @date 2024-02-01
 */
public class YkyAgent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 代理商编号 */
    @Excel(name = "代理商编号")
    private Long id;

    /** 排序 */
    @Excel(name = "排序")
    private String sort;

    /** 头像 */
    @Excel(name = "头像")
    private String headPic;

    /** app名称 */
    @Excel(name = "app名称")
    private String appName;

    /** 公司图标 */
    @Excel(name = "公司图标")
    private String companyLogo;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String telePhone;

    /** 代付账户余额 */
    @Excel(name = "代付账户余额")
    private String payAccountBalance;

    /** 物料余额 */
    @Excel(name = "物料余额")
    private String materialBalance;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String idNo;

    /** 银行 */
    @Excel(name = "银行")
    private String bankName;

    /** 姓名 */
    @Excel(name = "姓名")
    private String cusName;

    /** 银行卡号 */
    @Excel(name = "银行卡号")
    private String bankNo;

    /** 推广号码 */
    @Excel(name = "推广号码")
    private String promotionNo;

    /** app下载地址 */
    @Excel(name = "app下载地址")
    private String downloadAddress;

    /** 所属代理商编号 */
    @Excel(name = "所属代理商编号")
    private String belongAgentNo;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String companyName;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 代理商状态（级别） */
    @Excel(name = "代理商状态", readConverterExp = "级=别")
    private String agentStatus;

    /** 代理商 */
    @Excel(name = "代理商")
    private String agentName;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    /** 上级商户号 */
    @Excel(name = "上级商户号")
    private String superiorNo;

    /** 上级商户名 */
    @Excel(name = "上级商户名")
    private String superiorName;

    /** 商户号路径（树） */
    @Excel(name = "商户号路径", readConverterExp = "树=")
    private String routeNo;

    /** 商户名路径（树） */
    @Excel(name = "商户名路径", readConverterExp = "树=")
    private String routeName;

    /** 备用字段5 */
    @Excel(name = "备用字段5")
    private String bake5;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSort(String sort) 
    {
        this.sort = sort;
    }

    public String getSort() 
    {
        return sort;
    }
    public void setHeadPic(String headPic) 
    {
        this.headPic = headPic;
    }

    public String getHeadPic() 
    {
        return headPic;
    }
    public void setAppName(String appName) 
    {
        this.appName = appName;
    }

    public String getAppName() 
    {
        return appName;
    }
    public void setCompanyLogo(String companyLogo) 
    {
        this.companyLogo = companyLogo;
    }

    public String getCompanyLogo() 
    {
        return companyLogo;
    }
    public void setTelePhone(String telePhone) 
    {
        this.telePhone = telePhone;
    }

    public String getTelePhone() 
    {
        return telePhone;
    }
    public void setPayAccountBalance(String payAccountBalance) 
    {
        this.payAccountBalance = payAccountBalance;
    }

    public String getPayAccountBalance() 
    {
        return payAccountBalance;
    }
    public void setMaterialBalance(String materialBalance) 
    {
        this.materialBalance = materialBalance;
    }

    public String getMaterialBalance() 
    {
        return materialBalance;
    }
    public void setIdNo(String idNo) 
    {
        this.idNo = idNo;
    }

    public String getIdNo() 
    {
        return idNo;
    }
    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }
    public void setCusName(String cusName) 
    {
        this.cusName = cusName;
    }

    public String getCusName() 
    {
        return cusName;
    }
    public void setBankNo(String bankNo) 
    {
        this.bankNo = bankNo;
    }

    public String getBankNo() 
    {
        return bankNo;
    }
    public void setPromotionNo(String promotionNo) 
    {
        this.promotionNo = promotionNo;
    }

    public String getPromotionNo() 
    {
        return promotionNo;
    }
    public void setDownloadAddress(String downloadAddress) 
    {
        this.downloadAddress = downloadAddress;
    }

    public String getDownloadAddress() 
    {
        return downloadAddress;
    }
    public void setBelongAgentNo(String belongAgentNo) 
    {
        this.belongAgentNo = belongAgentNo;
    }

    public String getBelongAgentNo() 
    {
        return belongAgentNo;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setAgentStatus(String agentStatus) 
    {
        this.agentStatus = agentStatus;
    }

    public String getAgentStatus() 
    {
        return agentStatus;
    }
    public void setAgentName(String agentName) 
    {
        this.agentName = agentName;
    }

    public String getAgentName() 
    {
        return agentName;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }
    public void setSuperiorNo(String superiorNo) 
    {
        this.superiorNo = superiorNo;
    }

    public String getSuperiorNo() 
    {
        return superiorNo;
    }
    public void setSuperiorName(String superiorName) 
    {
        this.superiorName = superiorName;
    }

    public String getSuperiorName() 
    {
        return superiorName;
    }
    public void setRouteNo(String routeNo) 
    {
        this.routeNo = routeNo;
    }

    public String getRouteNo() 
    {
        return routeNo;
    }
    public void setRouteName(String routeName) 
    {
        this.routeName = routeName;
    }

    public String getRouteName() 
    {
        return routeName;
    }
    public void setBake5(String bake5) 
    {
        this.bake5 = bake5;
    }

    public String getBake5() 
    {
        return bake5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sort", getSort())
            .append("headPic", getHeadPic())
            .append("appName", getAppName())
            .append("companyLogo", getCompanyLogo())
            .append("telePhone", getTelePhone())
            .append("payAccountBalance", getPayAccountBalance())
            .append("materialBalance", getMaterialBalance())
            .append("idNo", getIdNo())
            .append("bankName", getBankName())
            .append("cusName", getCusName())
            .append("bankNo", getBankNo())
            .append("promotionNo", getPromotionNo())
            .append("downloadAddress", getDownloadAddress())
            .append("belongAgentNo", getBelongAgentNo())
            .append("companyName", getCompanyName())
            .append("status", getStatus())
            .append("agentStatus", getAgentStatus())
            .append("agentName", getAgentName())
            .append("creatTime", getCreatTime())
            .append("superiorNo", getSuperiorNo())
            .append("superiorName", getSuperiorName())
            .append("routeNo", getRouteNo())
            .append("routeName", getRouteName())
            .append("bake5", getBake5())
            .toString();
    }
}
