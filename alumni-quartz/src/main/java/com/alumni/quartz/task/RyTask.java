package com.alumni.quartz.task;

import com.alumni.common.constant.UserConstants;
import com.alumni.system.domain.SysAlumni;
import com.alumni.system.domain.SysUser;
import com.alumni.system.service.ISysAlumniService;
import com.alumni.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alumni.common.utils.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 定时任务调度测试
 *
 * @author ruoyi
 */
@Component("ryTask")
public class RyTask
{
    @Autowired
    private ISysAlumniService sysAlumniService;

    @Autowired
    private ISysUserService userService;

    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void ryParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void ryNoParams()
    {
        SysAlumni alumni=  new SysAlumni();
        alumni.setCreateTime(new Date());
        List<SysAlumni> list = sysAlumniService.selectSysAlumniList(alumni);
        for(SysAlumni portal :list){
            SysUser user= new SysUser();
            String loginName = portal.getACCOUNT();
            user.setLoginName(loginName);
            String userName=portal.getUSERNAME();
            user.setUserName(userName);
            String idcard=portal.getIdCard();
            user.setIdCard(idcard);
            String email=portal.getEMAIL();
            user.setEmail(email);
            String phonenumber=portal.getMyPhone();
            user.setPhonenumber(phonenumber);
            String sex=portal.getSEX();
            user.setSex(sex);
            String password=portal.getPASSWORD();
            user.setPassword(password);
            user.setStatus("0");
            String userType=portal.getUSERTYPE();
            user.setUserType(userType);
            SysUser dbUser= userService.selectUserByLoginName(user.getLoginName());
            if (dbUser!=null)
            {
                user.setUserId(dbUser.getUserId());
                userService.updateUser(user);
            }else{
                userService.insertUser(user);
            }

        }
    }


    /**
     * 同步教职工校友用户
     */
    public void sysnTeacher()
    {
        SysAlumni alumni=  new SysAlumni();
        alumni.setCreateTime(new Date());
        List<SysAlumni> list = sysAlumniService.selectSysTeaAlumniList(alumni);
        for(SysAlumni portal :list){
            SysUser user= new SysUser();
            String loginName = portal.getACCOUNT();
            user.setLoginName(loginName);
            String userName=portal.getUSERNAME();
            user.setUserName(userName);
            String idcard=portal.getIdCard();
            user.setIdCard(idcard);
            String email=portal.getEMAIL();
            user.setEmail(email);
            String phonenumber=portal.getMyPhone();
            user.setPhonenumber(phonenumber);
            String sex=portal.getSEX();
            user.setSex(sex);
            String password=portal.getPASSWORD();
            user.setPassword(password);
            user.setStatus("0");
            String userType=portal.getUSERTYPE();
            user.setUserType(userType);
            SysUser dbUser= userService.selectUserByLoginName(user.getLoginName());
            if (dbUser!=null)
            {
                user.setUserId(dbUser.getUserId());
                userService.updateUser(user);
            }else{
                userService.insertUser(user);
            }

        }
    }

    /**
     * 同步附属单位职工校友用户
     */
    public void sysnDocter()
    {
        SysAlumni alumni=  new SysAlumni();
        alumni.setCreateTime(new Date());
        List<SysAlumni> list = sysAlumniService.selectSysAlumniList(alumni);
        for(SysAlumni portal :list){
            SysUser user= new SysUser();
            String loginName = portal.getACCOUNT();
            user.setLoginName(loginName);
            String userName=portal.getUSERNAME();
            user.setUserName(userName);
            String idcard=portal.getIdCard();
            user.setIdCard(idcard);
            String email=portal.getEMAIL();
            user.setEmail(email);
            String phonenumber=portal.getMyPhone();
            user.setPhonenumber(phonenumber);
            String sex=portal.getSEX();
            user.setSex(sex);
            String password=portal.getPASSWORD();
            user.setPassword(password);
            user.setStatus("0");
            String userType=portal.getUSERTYPE();
            user.setUserType(userType);
            SysUser dbUser= userService.selectUserByLoginName(user.getLoginName());
            if (dbUser!=null)
            {
                user.setUserId(dbUser.getUserId());
                userService.updateUser(user);
            }else{
                userService.insertUser(user);
            }

        }
    }

    /**
     * 同步学生校友用户
     */
    public void sysnStudent()
    {
        SysAlumni alumni=  new SysAlumni();
        alumni.setCreateTime(new Date());
        List<SysAlumni> list = sysAlumniService.selectSysAlumniList(alumni);
        for(SysAlumni portal :list){
            SysUser user= new SysUser();
            String loginName = portal.getACCOUNT();
            user.setLoginName(loginName);
            String userName=portal.getUSERNAME();
            user.setUserName(userName);
            String idcard=portal.getIdCard();
            user.setIdCard(idcard);
            String email=portal.getEMAIL();
            user.setEmail(email);
            String phonenumber=portal.getMyPhone();
            user.setPhonenumber(phonenumber);
            String sex=portal.getSEX();
            user.setSex(sex);
            String password=portal.getPASSWORD();
            user.setPassword(password);
            user.setStatus("0");
            String userType=portal.getUSERTYPE();
            user.setUserType(userType);
            SysUser dbUser= userService.selectUserByLoginName(user.getLoginName());
            if (dbUser!=null)
            {
                user.setUserId(dbUser.getUserId());
                userService.updateUser(user);
            }else{
                userService.insertUser(user);
            }

        }
    }
}
