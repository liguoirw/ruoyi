package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 伪激活机械对象 terminal_activation
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
public class TerminalActivation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
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

    /** 参与服务费活动 */
    @Excel(name = "参与服务费活动")
    private String yfwfhd;

    /** 参与sim活动 */
    @Excel(name = "参与sim活动")
    private String cysimhd;

    /** 冻结服务费 */
    @Excel(name = "冻结服务费")
    private String djfwf;

    /** sim服务费 */
    @Excel(name = "sim服务费")
    private Long simfwf;

    /** sim扣费(单位:天数) */
    @Excel(name = "sim扣费(单位:天数)")
    private String simkft;

    /** 服务费冻结回复 */
    @Excel(name = "服务费冻结回复")
    private String fwfdjhf;

    /** 服务费扣款状态 */
    @Excel(name = "服务费扣款状态")
    private String fwfkkzt;

    /** 已激活返现 */
    @Excel(name = "已激活返现")
    private String yjhfx;

    /** 已达标返现 */
    @Excel(name = "已达标返现")
    private String ydbfx;

    /** 首笔交易（激活）时间 */
    @Excel(name = "首笔交易", readConverterExp = "激=活")
    private Date sbjysj;

    /** 机具分配时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "机具分配时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jmfpsj;

    /** 最后交易时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后交易时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date zhjysj;

    /** $column.columnComment */
    private String status1;

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

    /** $column.columnComment */
    private String bak6;

    /** $column.columnComment */
    private String bak7;

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
    public void setDjfwf(String djfwf) 
    {
        this.djfwf = djfwf;
    }

    public String getDjfwf() 
    {
        return djfwf;
    }
    public void setSimfwf(Long simfwf) 
    {
        this.simfwf = simfwf;
    }

    public Long getSimfwf() 
    {
        return simfwf;
    }
    public void setSimkft(String simkft) 
    {
        this.simkft = simkft;
    }

    public String getSimkft() 
    {
        return simkft;
    }
    public void setFwfdjhf(String fwfdjhf) 
    {
        this.fwfdjhf = fwfdjhf;
    }

    public String getFwfdjhf() 
    {
        return fwfdjhf;
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
    public void setSbjysj(Date sbjysj) 
    {
        this.sbjysj = sbjysj;
    }

    public Date getSbjysj() 
    {
        return sbjysj;
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
    public void setBak5(String bak5) 
    {
        this.bak5 = bak5;
    }

    public String getBak5() 
    {
        return bak5;
    }
    public void setBak6(String bak6) 
    {
        this.bak6 = bak6;
    }

    public String getBak6() 
    {
        return bak6;
    }
    public void setBak7(String bak7) 
    {
        this.bak7 = bak7;
    }

    public String getBak7() 
    {
        return bak7;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pinpai", getPinpai())
            .append("zhongduanxinghao", getZhongduanxinghao())
            .append("zhongduansn", getZhongduansn())
            .append("dls", getDls())
            .append("dlsdh", getDlsdh())
            .append("ydbm", getYdbm())
            .append("shbm", getShbm())
            .append("shmc", getShmc())
            .append("yfwfhd", getYfwfhd())
            .append("cysimhd", getCysimhd())
            .append("djfwf", getDjfwf())
            .append("simfwf", getSimfwf())
            .append("simkft", getSimkft())
            .append("fwfdjhf", getFwfdjhf())
            .append("fwfkkzt", getFwfkkzt())
            .append("yjhfx", getYjhfx())
            .append("ydbfx", getYdbfx())
            .append("sbjysj", getSbjysj())
            .append("jmfpsj", getJmfpsj())
            .append("zhjysj", getZhjysj())
            .append("createTime", getCreateTime())
            .append("status1", getStatus1())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("bak4", getBak4())
            .append("bak5", getBak5())
            .append("bak6", getBak6())
            .append("bak7", getBak7())
            .toString();
    }
}
