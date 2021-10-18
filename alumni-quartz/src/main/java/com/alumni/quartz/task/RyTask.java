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
        alumni.setUSERTYPE("31");
        List<SysAlumni> list = sysAlumniService.selectSysAlumniList(alumni);
        List<SysUser> noUserlist = new ArrayList();
        List<SysUser> exUserlist = new ArrayList();
        for(SysAlumni portal :list){
            SysUser user= new SysUser();
            String loginName = portal.getACCOUNT();
            user.setLoginName(loginName);
            String userName=portal.getUSERNAME();
            user.setUserName(userName);
            String email=portal.getEMAIL();
            user.setEmail(email);
            String phonenumber=portal.getMyPhone();
            user.setPhonenumber(phonenumber);
            String sex=portal.getSEX();
            user.setSex(sex);
            String password="1111111111111111111111";
            user.setPassword(password);
            String status=portal.getSTATUS();
            user.setStatus(status);
            String userType=portal.getUSERTYPE();
            user.setUserType(userType);
            if (UserConstants.USER_NAME_NOT_UNIQUE.equals(userService.checkLoginNameUnique(user.getLoginName())))
            {
                userService.updateUser(user);
            }else{
                userService.insertUser(user);
            }

        }


    }
}
