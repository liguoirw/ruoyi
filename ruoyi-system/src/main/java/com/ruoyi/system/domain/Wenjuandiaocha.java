package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 信用卡申请大数据评估系统对象 wenjuandiaocha
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
public class Wenjuandiaocha extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 身份证 */
    @Excel(name = "身份证")
    private String shenfenzheng;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 职业 */
    @Excel(name = "职业")
    private String nianshouru;

    /** 年收入 */
    @Excel(name = "年收入")
    private String cheliangxinxi;

    /** 职龄 */
    @Excel(name = "职龄")
    private String zhiling;

    /** 网贷数量 */
    @Excel(name = "网贷数量")
    private String wangdaishu;

    /** 社会保险 */
    @Excel(name = "社会保险")
    private String shehuibaoxian;

    /** 商业保险 */
    @Excel(name = "商业保险")
    private String shangyebaoxian;

    /** 婚姻 */
    @Excel(name = "婚姻")
    private String hunyin;

    /** 住房信息 */
    @Excel(name = "住房信息")
    private String zhufangxinxi;

    /** 办卡用途 */
    @Excel(name = "办卡用途")
    private String bankayongtu;

    /** 最大额度 */
    @Excel(name = "最大额度")
    private String zuidaedu;

    /** 最小额度 */
    @Excel(name = "最小额度")
    private String zuixiaoedu;

    /** 卡片数量 */
    @Excel(name = "卡片数量")
    private String kapianshuliang;

    /** 是否有过逾期 */
    @Excel(name = "是否有过逾期")
    private String youguoyuqi;

    /** 是否近期办理过分期 */
    @Excel(name = "是否近期办理过分期")
    private String banlifenqi;

    /** 是否3月内提额 */
    @Excel(name = "是否3月内提额")
    private String yueneitie;

    /** 单卡月交易笔数 */
    @Excel(name = "单卡月交易笔数")
    private String jiaoyibishu;

    /** 目前卡片总剩余额度 */
    @Excel(name = "目前卡片总剩余额度")
    private String kapianzongshengyuedu;

    /** 近期是否街道银行办卡分期电话 */
    @Excel(name = "近期是否街道银行办卡分期电话")
    private String yinhangbanlifenqi;

    /** 查询 */
    @Excel(name = "查询")
    private String selectid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setShenfenzheng(String shenfenzheng) 
    {
        this.shenfenzheng = shenfenzheng;
    }

    public String getShenfenzheng() 
    {
        return shenfenzheng;
    }
    public void setAge(String age) 
    {
        this.age = age;
    }

    public String getAge() 
    {
        return age;
    }
    public void setNianshouru(String nianshouru) 
    {
        this.nianshouru = nianshouru;
    }

    public String getNianshouru() 
    {
        return nianshouru;
    }
    public void setCheliangxinxi(String cheliangxinxi) 
    {
        this.cheliangxinxi = cheliangxinxi;
    }

    public String getCheliangxinxi() 
    {
        return cheliangxinxi;
    }
    public void setZhiling(String zhiling) 
    {
        this.zhiling = zhiling;
    }

    public String getZhiling() 
    {
        return zhiling;
    }
    public void setWangdaishu(String wangdaishu) 
    {
        this.wangdaishu = wangdaishu;
    }

    public String getWangdaishu() 
    {
        return wangdaishu;
    }
    public void setShehuibaoxian(String shehuibaoxian) 
    {
        this.shehuibaoxian = shehuibaoxian;
    }

    public String getShehuibaoxian() 
    {
        return shehuibaoxian;
    }
    public void setShangyebaoxian(String shangyebaoxian) 
    {
        this.shangyebaoxian = shangyebaoxian;
    }

    public String getShangyebaoxian() 
    {
        return shangyebaoxian;
    }
    public void setHunyin(String hunyin) 
    {
        this.hunyin = hunyin;
    }

    public String getHunyin() 
    {
        return hunyin;
    }
    public void setZhufangxinxi(String zhufangxinxi) 
    {
        this.zhufangxinxi = zhufangxinxi;
    }

    public String getZhufangxinxi() 
    {
        return zhufangxinxi;
    }
    public void setBankayongtu(String bankayongtu) 
    {
        this.bankayongtu = bankayongtu;
    }

    public String getBankayongtu() 
    {
        return bankayongtu;
    }
    public void setZuidaedu(String zuidaedu) 
    {
        this.zuidaedu = zuidaedu;
    }

    public String getZuidaedu() 
    {
        return zuidaedu;
    }
    public void setZuixiaoedu(String zuixiaoedu) 
    {
        this.zuixiaoedu = zuixiaoedu;
    }

    public String getZuixiaoedu() 
    {
        return zuixiaoedu;
    }
    public void setKapianshuliang(String kapianshuliang) 
    {
        this.kapianshuliang = kapianshuliang;
    }

    public String getKapianshuliang() 
    {
        return kapianshuliang;
    }
    public void setYouguoyuqi(String youguoyuqi) 
    {
        this.youguoyuqi = youguoyuqi;
    }

    public String getYouguoyuqi() 
    {
        return youguoyuqi;
    }
    public void setBanlifenqi(String banlifenqi) 
    {
        this.banlifenqi = banlifenqi;
    }

    public String getBanlifenqi() 
    {
        return banlifenqi;
    }
    public void setYueneitie(String yueneitie) 
    {
        this.yueneitie = yueneitie;
    }

    public String getYueneitie() 
    {
        return yueneitie;
    }
    public void setJiaoyibishu(String jiaoyibishu) 
    {
        this.jiaoyibishu = jiaoyibishu;
    }

    public String getJiaoyibishu() 
    {
        return jiaoyibishu;
    }
    public void setKapianzongshengyuedu(String kapianzongshengyuedu) 
    {
        this.kapianzongshengyuedu = kapianzongshengyuedu;
    }

    public String getKapianzongshengyuedu() 
    {
        return kapianzongshengyuedu;
    }
    public void setYinhangbanlifenqi(String yinhangbanlifenqi) 
    {
        this.yinhangbanlifenqi = yinhangbanlifenqi;
    }

    public String getYinhangbanlifenqi() 
    {
        return yinhangbanlifenqi;
    }
    public void setSelectid(String selectid) 
    {
        this.selectid = selectid;
    }

    public String getSelectid() 
    {
        return selectid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shenfenzheng", getShenfenzheng())
            .append("age", getAge())
            .append("nianshouru", getNianshouru())
            .append("cheliangxinxi", getCheliangxinxi())
            .append("zhiling", getZhiling())
            .append("wangdaishu", getWangdaishu())
            .append("shehuibaoxian", getShehuibaoxian())
            .append("shangyebaoxian", getShangyebaoxian())
            .append("hunyin", getHunyin())
            .append("zhufangxinxi", getZhufangxinxi())
            .append("bankayongtu", getBankayongtu())
            .append("zuidaedu", getZuidaedu())
            .append("zuixiaoedu", getZuixiaoedu())
            .append("kapianshuliang", getKapianshuliang())
            .append("youguoyuqi", getYouguoyuqi())
            .append("banlifenqi", getBanlifenqi())
            .append("yueneitie", getYueneitie())
            .append("jiaoyibishu", getJiaoyibishu())
            .append("kapianzongshengyuedu", getKapianzongshengyuedu())
            .append("yinhangbanlifenqi", getYinhangbanlifenqi())
            .append("selectid", getSelectid())
            .toString();
    }
}
