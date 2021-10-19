package com.alumni.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.alumni.common.annotation.Excel;
import com.alumni.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_alumni
 *
 * @author ruoyi
 * @date 2021-10-15
 */
public class SysAlumni extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String ID;

    /** 用户名 */
    @Excel(name = "用户名")
    private String USERNAME;

    /** 账号 */
    @Excel(name = "账号")
    private String ACCOUNT;

    /** 密码 */
    @Excel(name = "密码")
    private String PASSWORD;

    /** 密码 */
    @Excel(name = "密码")
    private String CARDTYPE;

    /** $column.columnComment */
    @Excel(name = "密码")
    private String SEX;

    /** $column.columnComment */
    @Excel(name = "密码")
    private String BIRTHDAY;

    /** 用户类型，99：超级管理员；90：绿色通道；80：合作交流；70：外聘教师；60：暑期生；30：博士后；20：学生；10：教职员工； */
    @Excel(name = "用户类型，99：超级管理员；90：绿色通道；80：合作交流；70：外聘教师；60：暑期生；30：博士后；20：学生；10：教职员工；")
    private String USERTYPE;

    /** 用户状态 */
    @Excel(name = "用户状态")
    private String STATUS;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String EMAIL;

    /** 手机号 */
    @Excel(name = "手机号")
    private String myPhone;

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getID()
    {
        return ID;
    }
    public void setUSERNAME(String USERNAME)
    {
        this.USERNAME = USERNAME;
    }

    public String getUSERNAME()
    {
        return USERNAME;
    }
    public void setACCOUNT(String ACCOUNT)
    {
        this.ACCOUNT = ACCOUNT;
    }

    public String getACCOUNT()
    {
        return ACCOUNT;
    }
    public void setPASSWORD(String PASSWORD)
    {
        this.PASSWORD = PASSWORD;
    }

    public String getPASSWORD()
    {
        return PASSWORD;
    }
    public void setCARDTYPE(String CARDTYPE)
    {
        this.CARDTYPE = CARDTYPE;
    }

    public String getCARDTYPE()
    {
        return CARDTYPE;
    }
    public void setSEX(String SEX)
    {
        this.SEX = SEX;
    }

    public String getSEX()
    {
        return SEX;
    }
    public void setBIRTHDAY(String BIRTHDAY)
    {
        this.BIRTHDAY = BIRTHDAY;
    }

    public String getBIRTHDAY()
    {
        return BIRTHDAY;
    }
    public void setUSERTYPE(String USERTYPE)
    {
        this.USERTYPE = USERTYPE;
    }

    public String getUSERTYPE()
    {
        return USERTYPE;
    }
    public void setSTATUS(String STATUS)
    {
        this.STATUS = STATUS;
    }

    public String getSTATUS()
    {
        return STATUS;
    }
    public void setIdCard(String idCard)
    {
        this.idCard = idCard;
    }

    public String getIdCard()
    {
        return idCard;
    }
    public void setEMAIL(String EMAIL)
    {
        this.EMAIL = EMAIL;
    }

    public String getEMAIL()
    {
        return EMAIL;
    }
    public void setMyPhone(String myPhone)
    {
        this.myPhone = myPhone;
    }

    public String getMyPhone()
    {
        return myPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("ID", getID())
                .append("USERNAME", getUSERNAME())
                .append("ACCOUNT", getACCOUNT())
                .append("PASSWORD", getPASSWORD())
                .append("CARDTYPE", getCARDTYPE())
                .append("SEX", getSEX())
                .append("BIRTHDAY", getBIRTHDAY())
                .append("USERTYPE", getUSERTYPE())
                .append("STATUS", getSTATUS())
                .append("idCard", getIdCard())
                .append("EMAIL", getEMAIL())
                .append("myPhone", getMyPhone())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
