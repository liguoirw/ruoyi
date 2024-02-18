package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 活动终端标记对象 hdzdbj
 * 
 * @author liguo
 * @date 2024-01-29
 */
public class Hdzdbj extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    @Excel(name = "")
    private Long id;

    /** 品牌 */
    @Excel(name = "品牌")
    private String pinpai;

    /** 终端型号 */
    @Excel(name = "终端型号")
    private String zhongduanxinghao;

    /** 终端sn */
    @Excel(name = "终端sn")
    private String zhongduansn;

    /** 直属代理商 */
    @Excel(name = "直属代理商")
    private String zsdls;

    /** 代理商 */
    @Excel(name = "代理商")
    private String dls;

    /** 代理商电话 */
    @Excel(name = "代理商电话")
    private String dlsdh;

    /** 一代编号 */
    @Excel(name = "一代编号")
    private String ydbm;

    /** 商户编号 */
    @Excel(name = "商户编号")
    private String shbm;

    /** 商户名称 */
    @Excel(name = "商户名称")
    private String shmc;

    /** 累计交易 */
    @Excel(name = "累计交易")
    private Double ljjy;

    /** 终端状态 */
    @Excel(name = "终端状态")
    private String zdzt;

    /** 结算模板 */
    @Excel(name = "结算模板")
    private String jsmb;

    /** 机具模板 */
    @Excel(name = "机具模板")
    private String jjmb;

    /** 参与服务费活动 */
    @Excel(name = "参与服务费活动")
    private String yfwfhd;

    /** 参与sim活动 */
    @Excel(name = "参与sim活动")
    private String cysimhd;

    /** 机器类型 */
    @Excel(name = "机器类型")
    private String jqlx;

    /** 商家返利 */
    @Excel(name = "商家返利")
    private String sjfl;

    /** sim服务费 */
    @Excel(name = "sim服务费")
    private Double simfwf;

    /** sim扣费（首次扣费） */
    @Excel(name = "sim扣费", readConverterExp = "首=次扣费")
    private String simkf;

    /** sim返现次数 */
    @Excel(name = "sim返现次数")
    private String simfxcs;

    /** 服务费冻结回复 */
    @Excel(name = "服务费冻结回复")
    private String fwfdjhf;

    /** 冻结返现 */
    @Excel(name = "冻结返现")
    private String djfx;

    /** 服务费扣款状态 */
    @Excel(name = "服务费扣款状态")
    private String fwfkkzt;

    /** 已激活返现 */
    @Excel(name = "已激活返现")
    private String yjhfx;

    /** 已达标返现 */
    @Excel(name = "已达标返现")
    private String ydbfx;

    /** sim返现 */
    @Excel(name = "sim返现")
    private String simfx;

    /** 首笔交易（激活）时间 */
    @Excel(name = "首笔交易", readConverterExp = "激=活")
    private Date sbjysj;

    /** 绑定时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "绑定时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bdsj;

    /** 下次流量费扣费时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下次流量费扣费时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date xcllfkfsj;

    /** 机具分配时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "机具分配时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jmfpsj;

    /** 最后交易时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后交易时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date zhjysj;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cjsj;

    /**  */
    @Excel(name = "")
    private String bak;

    /**  */
    @Excel(name = "")
    private String status;

    /**  */
    @Excel(name = "")
    private String status1;

    /**  */
    @Excel(name = "")
    private String bak1;

    /**  */
    @Excel(name = "")
    private String bak2;

    /**  */
    @Excel(name = "")
    private String bak3;

    /**  */
    @Excel(name = "")
    private String bak4;

    /** 服务费冻结返现 */
    @Excel(name = "服务费冻结返现")
    private String fwfdjfx;

    /** 冻结服务费 */
    @Excel(name = "冻结服务费")
    private String djfwf;

    /** 允许下级修改服务费 */
    @Excel(name = "允许下级修改服务费")
    private String rxxjxgfwf;

    /** sim扣费(单位:天数) */
    @Excel(name = "sim扣费(单位:天数)")
    private String simkft;

    /** sim扣费间隔 */
    @Excel(name = "sim扣费间隔")
    private String simkfjg;

    /** sim已返现次数 */
    @Excel(name = "sim已返现次数")
    private String simyfxcs;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPinpai(String pinpai) 
    {
        this.pinpai = pinpai;
    }

    public String getPinpai() 
    {
        return pinpai;
    }
    public void setZhongduanxinghao(String zhongduanxinghao) 
    {
        this.zhongduanxinghao = zhongduanxinghao;
    }

    public String getZhongduanxinghao() 
    {
        return zhongduanxinghao;
    }
    public void setZhongduansn(String zhongduansn) 
    {
        this.zhongduansn = zhongduansn;
    }

    public String getZhongduansn() 
    {
        return zhongduansn;
    }
    public void setZsdls(String zsdls) 
    {
        this.zsdls = zsdls;
    }

    public String getZsdls() 
    {
        return zsdls;
    }
    public void setDls(String dls) 
    {
        this.dls = dls;
    }

    public String getDls() 
    {
        return dls;
    }
    public void setDlsdh(String dlsdh) 
    {
        this.dlsdh = dlsdh;
    }

    public String getDlsdh() 
    {
        return dlsdh;
    }
    public void setYdbm(String ydbm) 
    {
        this.ydbm = ydbm;
    }

    public String getYdbm() 
    {
        return ydbm;
    }
    public void setShbm(String shbm) 
    {
        this.shbm = shbm;
    }

    public String getShbm() 
    {
        return shbm;
    }
    public void setShmc(String shmc) 
    {
        this.shmc = shmc;
    }

    public String getShmc() 
    {
        return shmc;
    }
    public void setLjjy(Double ljjy) 
    {
        this.ljjy = ljjy;
    }

    public Double getLjjy() 
    {
        return ljjy;
    }
    public void setZdzt(String zdzt) 
    {
        this.zdzt = zdzt;
    }

    public String getZdzt() 
    {
        return zdzt;
    }
    public void setJsmb(String jsmb) 
    {
        this.jsmb = jsmb;
    }

    public String getJsmb() 
    {
        return jsmb;
    }
    public void setJjmb(String jjmb) 
    {
        this.jjmb = jjmb;
    }

    public String getJjmb() 
    {
        return jjmb;
    }
    public void setYfwfhd(String yfwfhd) 
    {
        this.yfwfhd = yfwfhd;
    }

    public String getYfwfhd() 
    {
        return yfwfhd;
    }
    public void setCysimhd(String cysimhd) 
    {
        this.cysimhd = cysimhd;
    }

    public String getCysimhd() 
    {
        return cysimhd;
    }
    public void setJqlx(String jqlx) 
    {
        this.jqlx = jqlx;
    }

    public String getJqlx() 
    {
        return jqlx;
    }
    public void setSjfl(String sjfl) 
    {
        this.sjfl = sjfl;
    }

    public String getSjfl() 
    {
        return sjfl;
    }
    public void setSimfwf(Double simfwf) 
    {
        this.simfwf = simfwf;
    }

    public Double getSimfwf() 
    {
        return simfwf;
    }
    public void setSimkf(String simkf) 
    {
        this.simkf = simkf;
    }

    public String getSimkf() 
    {
        return simkf;
    }
    public void setSimfxcs(String simfxcs) 
    {
        this.simfxcs = simfxcs;
    }

    public String getSimfxcs() 
    {
        return simfxcs;
    }
    public void setFwfdjhf(String fwfdjhf) 
    {
        this.fwfdjhf = fwfdjhf;
    }

    public String getFwfdjhf() 
    {
        return fwfdjhf;
    }
    public void setDjfx(String djfx) 
    {
        this.djfx = djfx;
    }

    public String getDjfx() 
    {
        return djfx;
    }
    public void setFwfkkzt(String fwfkkzt) 
    {
        this.fwfkkzt = fwfkkzt;
    }

    public String getFwfkkzt() 
    {
        return fwfkkzt;
    }
    public void setYjhfx(String yjhfx) 
    {
        this.yjhfx = yjhfx;
    }

    public String getYjhfx() 
    {
        return yjhfx;
    }
    public void setYdbfx(String ydbfx) 
    {
        this.ydbfx = ydbfx;
    }

    public String getYdbfx() 
    {
        return ydbfx;
    }
    public void setSimfx(String simfx) 
    {
        this.simfx = simfx;
    }

    public String getSimfx() 
    {
        return simfx;
    }
    public void setSbjysj(Date sbjysj) 
    {
        this.sbjysj = sbjysj;
    }

    public Date getSbjysj() 
    {
        return sbjysj;
    }
    public void setBdsj(Date bdsj) 
    {
        this.bdsj = bdsj;
    }

    public Date getBdsj() 
    {
        return bdsj;
    }
    public void setXcllfkfsj(Date xcllfkfsj) 
    {
        this.xcllfkfsj = xcllfkfsj;
    }

    public Date getXcllfkfsj() 
    {
        return xcllfkfsj;
    }
    public void setJmfpsj(Date jmfpsj) 
    {
        this.jmfpsj = jmfpsj;
    }

    public Date getJmfpsj() 
    {
        return jmfpsj;
    }
    public void setZhjysj(Date zhjysj) 
    {
        this.zhjysj = zhjysj;
    }

    public Date getZhjysj() 
    {
        return zhjysj;
    }
    public void setCjsj(Date cjsj) 
    {
        this.cjsj = cjsj;
    }

    public Date getCjsj() 
    {
        return cjsj;
    }
    public void setBak(String bak) 
    {
        this.bak = bak;
    }

    public String getBak() 
    {
        return bak;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setStatus1(String status1) 
    {
        this.status1 = status1;
    }

    public String getStatus1() 
    {
        return status1;
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
    public void setFwfdjfx(String fwfdjfx) 
    {
        this.fwfdjfx = fwfdjfx;
    }

    public String getFwfdjfx() 
    {
        return fwfdjfx;
    }
    public void setDjfwf(String djfwf) 
    {
        this.djfwf = djfwf;
    }

    public String getDjfwf() 
    {
        return djfwf;
    }
    public void setRxxjxgfwf(String rxxjxgfwf) 
    {
        this.rxxjxgfwf = rxxjxgfwf;
    }

    public String getRxxjxgfwf() 
    {
        return rxxjxgfwf;
    }
    public void setSimkft(String simkft) 
    {
        this.simkft = simkft;
    }

    public String getSimkft() 
    {
        return simkft;
    }
    public void setSimkfjg(String simkfjg) 
    {
        this.simkfjg = simkfjg;
    }

    public String getSimkfjg() 
    {
        return simkfjg;
    }
    public void setSimyfxcs(String simyfxcs) 
    {
        this.simyfxcs = simyfxcs;
    }

    public String getSimyfxcs() 
    {
        return simyfxcs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pinpai", getPinpai())
            .append("zhongduanxinghao", getZhongduanxinghao())
            .append("zhongduansn", getZhongduansn())
            .append("zsdls", getZsdls())
            .append("dls", getDls())
            .append("dlsdh", getDlsdh())
            .append("ydbm", getYdbm())
            .append("shbm", getShbm())
            .append("shmc", getShmc())
            .append("ljjy", getLjjy())
            .append("zdzt", getZdzt())
            .append("jsmb", getJsmb())
            .append("jjmb", getJjmb())
            .append("yfwfhd", getYfwfhd())
            .append("cysimhd", getCysimhd())
            .append("jqlx", getJqlx())
            .append("sjfl", getSjfl())
            .append("simfwf", getSimfwf())
            .append("simkf", getSimkf())
            .append("simfxcs", getSimfxcs())
            .append("fwfdjhf", getFwfdjhf())
            .append("djfx", getDjfx())
            .append("fwfkkzt", getFwfkkzt())
            .append("yjhfx", getYjhfx())
            .append("ydbfx", getYdbfx())
            .append("simfx", getSimfx())
            .append("sbjysj", getSbjysj())
            .append("bdsj", getBdsj())
            .append("xcllfkfsj", getXcllfkfsj())
            .append("jmfpsj", getJmfpsj())
            .append("zhjysj", getZhjysj())
            .append("cjsj", getCjsj())
            .append("bak", getBak())
            .append("status", getStatus())
            .append("status1", getStatus1())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("bak4", getBak4())
            .append("fwfdjfx", getFwfdjfx())
            .append("djfwf", getDjfwf())
            .append("rxxjxgfwf", getRxxjxgfwf())
            .append("simkft", getSimkft())
            .append("simkfjg", getSimkfjg())
            .append("simyfxcs", getSimyfxcs())
            .toString();
    }
}
