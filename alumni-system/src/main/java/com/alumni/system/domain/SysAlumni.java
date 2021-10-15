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

    /** 用户ID */
    private String ID;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String USERNAME;

    /** 性别 */
    @Excel(name = "性别")
    private String SEX;

    /** 拼音 */
    @Excel(name = "拼音")
    private String PINYIN;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String BIRTHDAY;

    /** 身份类型 */
    @Excel(name = "身份类型")
    private String USERTYPE;

    /** 用户账户（学号或者工号） */
    @Excel(name = "用户账户", readConverterExp = "学=号或者工号")
    private String ACCOUNT;

    /** 用户状态 */
    @Excel(name = "用户状态")
    private String STATUS;

    /** 部门ID */
    @Excel(name = "部门ID")
    private String DEPARTMENTNUMBER;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String DEPARTMENTNAME;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String idCard;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String myPhone;

    /** 电子邮箱 */
    @Excel(name = "电子邮箱")
    private String EMAIL;

    /** 账号有效期 */
    @Excel(name = "账号有效期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date activeTime;

    /** 职位名称 */
    @Excel(name = "职位名称")
    private String positionName;

    /** 职位分类 */
    @Excel(name = "职位分类")
    private String positionType;

    /** 职务级别 */
    @Excel(name = "职务级别")
    private String positionLevel;

    /** 专业技职务资格 */
    @Excel(name = "专业技职务资格")
    private String positionQc;

    /** 工人技术等级 */
    @Excel(name = "工人技术等级")
    private String workerLevel;

    /** $column.columnComment */
    @Excel(name = "工人技术等级")
    private String positionEngage;

    /** 生源地 */
    @Excel(name = "生源地")
    private String studentSource;

    /** 年级 */
    @Excel(name = "年级")
    private String GRADE;

    /** 学制 */
    @Excel(name = "学制")
    private String schoolLength;

    /** 入学年月 */
    @Excel(name = "入学年月")
    private String schoolYear;

    /** 同步时间 */
    @Excel(name = "同步时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date SYSNTIME;

    /** 操作类型：I：插入，U:更新 */
    @Excel(name = "操作类型：I：插入，U:更新")
    private String CZLX;

    /** 分机号 */
    @Excel(name = "分机号")
    private String extensionNumber;

    /** 抓取状态：0：未抓取，1：已抓取 */
    @Excel(name = "抓取状态：0：未抓取，1：已抓取")
    private String grapStatus;

    /** 抓取时间 */
    @Excel(name = "抓取时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date grapTime;

    /** 党政职务名称 */
    @Excel(name = "党政职务名称")
    private String partyPost;

    /** 校园卡头像(byte[]转成String) */
    @Excel(name = "校园卡头像(byte[]转成String)")
    private String USERPHOTO;

    /** $column.columnComment */
    @Excel(name = "校园卡头像(byte[]转成String)")
    private String CARDTYPE;

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
    public void setSEX(String SEX) 
    {
        this.SEX = SEX;
    }

    public String getSEX() 
    {
        return SEX;
    }
    public void setPINYIN(String PINYIN) 
    {
        this.PINYIN = PINYIN;
    }

    public String getPINYIN() 
    {
        return PINYIN;
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
    public void setACCOUNT(String ACCOUNT) 
    {
        this.ACCOUNT = ACCOUNT;
    }

    public String getACCOUNT() 
    {
        return ACCOUNT;
    }
    public void setSTATUS(String STATUS) 
    {
        this.STATUS = STATUS;
    }

    public String getSTATUS() 
    {
        return STATUS;
    }
    public void setDEPARTMENTNUMBER(String DEPARTMENTNUMBER) 
    {
        this.DEPARTMENTNUMBER = DEPARTMENTNUMBER;
    }

    public String getDEPARTMENTNUMBER() 
    {
        return DEPARTMENTNUMBER;
    }
    public void setDEPARTMENTNAME(String DEPARTMENTNAME) 
    {
        this.DEPARTMENTNAME = DEPARTMENTNAME;
    }

    public String getDEPARTMENTNAME() 
    {
        return DEPARTMENTNAME;
    }
    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }
    public void setMyPhone(String myPhone) 
    {
        this.myPhone = myPhone;
    }

    public String getMyPhone() 
    {
        return myPhone;
    }
    public void setEMAIL(String EMAIL) 
    {
        this.EMAIL = EMAIL;
    }

    public String getEMAIL() 
    {
        return EMAIL;
    }
    public void setActiveTime(Date activeTime) 
    {
        this.activeTime = activeTime;
    }

    public Date getActiveTime() 
    {
        return activeTime;
    }
    public void setPositionName(String positionName) 
    {
        this.positionName = positionName;
    }

    public String getPositionName() 
    {
        return positionName;
    }
    public void setPositionType(String positionType) 
    {
        this.positionType = positionType;
    }

    public String getPositionType() 
    {
        return positionType;
    }
    public void setPositionLevel(String positionLevel) 
    {
        this.positionLevel = positionLevel;
    }

    public String getPositionLevel() 
    {
        return positionLevel;
    }
    public void setPositionQc(String positionQc) 
    {
        this.positionQc = positionQc;
    }

    public String getPositionQc() 
    {
        return positionQc;
    }
    public void setWorkerLevel(String workerLevel) 
    {
        this.workerLevel = workerLevel;
    }

    public String getWorkerLevel() 
    {
        return workerLevel;
    }
    public void setPositionEngage(String positionEngage) 
    {
        this.positionEngage = positionEngage;
    }

    public String getPositionEngage() 
    {
        return positionEngage;
    }
    public void setStudentSource(String studentSource) 
    {
        this.studentSource = studentSource;
    }

    public String getStudentSource() 
    {
        return studentSource;
    }
    public void setGRADE(String GRADE) 
    {
        this.GRADE = GRADE;
    }

    public String getGRADE() 
    {
        return GRADE;
    }
    public void setSchoolLength(String schoolLength) 
    {
        this.schoolLength = schoolLength;
    }

    public String getSchoolLength() 
    {
        return schoolLength;
    }
    public void setSchoolYear(String schoolYear) 
    {
        this.schoolYear = schoolYear;
    }

    public String getSchoolYear() 
    {
        return schoolYear;
    }
    public void setSYSNTIME(Date SYSNTIME) 
    {
        this.SYSNTIME = SYSNTIME;
    }

    public Date getSYSNTIME() 
    {
        return SYSNTIME;
    }
    public void setCZLX(String CZLX) 
    {
        this.CZLX = CZLX;
    }

    public String getCZLX() 
    {
        return CZLX;
    }
    public void setExtensionNumber(String extensionNumber) 
    {
        this.extensionNumber = extensionNumber;
    }

    public String getExtensionNumber() 
    {
        return extensionNumber;
    }
    public void setGrapStatus(String grapStatus) 
    {
        this.grapStatus = grapStatus;
    }

    public String getGrapStatus() 
    {
        return grapStatus;
    }
    public void setGrapTime(Date grapTime) 
    {
        this.grapTime = grapTime;
    }

    public Date getGrapTime() 
    {
        return grapTime;
    }
    public void setPartyPost(String partyPost) 
    {
        this.partyPost = partyPost;
    }

    public String getPartyPost() 
    {
        return partyPost;
    }
    public void setUSERPHOTO(String USERPHOTO) 
    {
        this.USERPHOTO = USERPHOTO;
    }

    public String getUSERPHOTO() 
    {
        return USERPHOTO;
    }
    public void setCARDTYPE(String CARDTYPE) 
    {
        this.CARDTYPE = CARDTYPE;
    }

    public String getCARDTYPE() 
    {
        return CARDTYPE;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("USERNAME", getUSERNAME())
            .append("SEX", getSEX())
            .append("PINYIN", getPINYIN())
            .append("BIRTHDAY", getBIRTHDAY())
            .append("USERTYPE", getUSERTYPE())
            .append("ACCOUNT", getACCOUNT())
            .append("STATUS", getSTATUS())
            .append("DEPARTMENTNUMBER", getDEPARTMENTNUMBER())
            .append("DEPARTMENTNAME", getDEPARTMENTNAME())
            .append("idCard", getIdCard())
            .append("myPhone", getMyPhone())
            .append("EMAIL", getEMAIL())
            .append("activeTime", getActiveTime())
            .append("positionName", getPositionName())
            .append("positionType", getPositionType())
            .append("positionLevel", getPositionLevel())
            .append("positionQc", getPositionQc())
            .append("workerLevel", getWorkerLevel())
            .append("positionEngage", getPositionEngage())
            .append("studentSource", getStudentSource())
            .append("GRADE", getGRADE())
            .append("schoolLength", getSchoolLength())
            .append("schoolYear", getSchoolYear())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("SYSNTIME", getSYSNTIME())
            .append("CZLX", getCZLX())
            .append("extensionNumber", getExtensionNumber())
            .append("grapStatus", getGrapStatus())
            .append("grapTime", getGrapTime())
            .append("partyPost", getPartyPost())
            .append("USERPHOTO", getUSERPHOTO())
            .append("CARDTYPE", getCARDTYPE())
            .toString();
    }
}
