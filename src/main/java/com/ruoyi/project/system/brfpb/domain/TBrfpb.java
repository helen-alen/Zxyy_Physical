package com.ruoyi.project.system.brfpb.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 病人分配对象 t_brfpb
 * 
 * @author helen
 * @date 2023-04-21
 */
public class TBrfpb extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 病人体检号 */
    private String brtjh;

    /** 病人姓名 */
    @Excel(name = "病人姓名")
    private String brxm;

    /** 病人身份证 */
    @Excel(name = "病人身份证")
    private String brsfz;

    /** 病人电话 */
    @Excel(name = "病人电话")
    private String brdh;

    /** 操作工号 */
    @Excel(name = "操作工号")
    private String czgh;

    /** 操作人姓名 */
    @Excel(name = "操作人姓名")
    private String czrxm;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date czsj;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String ksmc;

    /** 科室代码 */
    @Excel(name = "科室代码")
    private Long ksdm;

    /** 医生工号 */
    @Excel(name = "医生工号")
    private String ysgh;

    /** 医生姓名 */
    @Excel(name = "医生姓名")
    private String ysxm;

    /** 医生点评时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "医生点评时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ysdpsj;

    /** 医生点评结果 */
    @Excel(name = "医生点评结果")
    private String ysdpjg;

    /** 医生点评结果修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "医生点评结果修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ysdpxgsj;

    /** 是否点评判别 */
    @Excel(name = "是否点评判别")
    private Long sfdppb;

    /** 是否提取结果判别 */
    @Excel(name = "是否提取结果判别")
    private Long sftqjgpb;

    public void setBrtjh(String brtjh)
    {
        this.brtjh = brtjh;
    }

    public String getBrtjh()
    {
        return brtjh;
    }
    public void setBrxm(String brxm)
    {
        this.brxm = brxm;
    }

    public String getBrxm()
    {
        return brxm;
    }
    public void setBrsfz(String brsfz)
    {
        this.brsfz = brsfz;
    }

    public String getBrsfz()
    {
        return brsfz;
    }
    public void setBrdh(String brdh)
    {
        this.brdh = brdh;
    }

    public String getBrdh()
    {
        return brdh;
    }
    public void setCzgh(String czgh)
    {
        this.czgh = czgh;
    }

    public String getCzgh()
    {
        return czgh;
    }
    public void setCzrxm(String czrxm)
    {
        this.czrxm = czrxm;
    }

    public String getCzrxm()
    {
        return czrxm;
    }
    public void setCzsj(Date czsj)
    {
        this.czsj = czsj;
    }

    public Date getCzsj()
    {
        return czsj;
    }
    public void setKsmc(String ksmc)
    {
        this.ksmc = ksmc;
    }

    public String getKsmc()
    {
        return ksmc;
    }
    public void setKsdm(Long ksdm)
    {
        this.ksdm = ksdm;
    }

    public Long getKsdm()
    {
        return ksdm;
    }
    public void setYsgh(String ysgh)
    {
        this.ysgh = ysgh;
    }

    public String getYsgh()
    {
        return ysgh;
    }
    public void setYsxm(String ysxm)
    {
        this.ysxm = ysxm;
    }

    public String getYsxm()
    {
        return ysxm;
    }
    public void setYsdpsj(Date ysdpsj)
    {
        this.ysdpsj = ysdpsj;
    }

    public Date getYsdpsj()
    {
        return ysdpsj;
    }
    public void setYsdpjg(String ysdpjg)
    {
        this.ysdpjg = ysdpjg;
    }

    public String getYsdpjg()
    {
        return ysdpjg;
    }
    public void setYsdpxgsj(Date ysdpxgsj)
    {
        this.ysdpxgsj = ysdpxgsj;
    }

    public Date getYsdpxgsj()
    {
        return ysdpxgsj;
    }
    public void setSfdppb(Long sfdppb)
    {
        this.sfdppb = sfdppb;
    }

    public Long getSfdppb()
    {
        return sfdppb;
    }
    public void setSftqjgpb(Long sftqjgpb)
    {
        this.sftqjgpb = sftqjgpb;
    }

    public Long getSftqjgpb()
    {
        return sftqjgpb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("brtjh", getBrtjh())
            .append("brxm", getBrxm())
            .append("brsfz", getBrsfz())
            .append("brdh", getBrdh())
            .append("czgh", getCzgh())
            .append("czrxm", getCzrxm())
            .append("czsj", getCzsj())
            .append("ksmc", getKsmc())
            .append("ksdm", getKsdm())
            .append("ysgh", getYsgh())
            .append("ysxm", getYsxm())
            .append("ysdpsj", getYsdpsj())
            .append("ysdpjg", getYsdpjg())
            .append("ysdpxgsj", getYsdpxgsj())
            .append("sfdppb", getSfdppb())
            .append("sftqjgpb", getSftqjgpb())
            .toString();
    }
}
