package com.alumni.system.service;

import java.util.List;
import com.alumni.system.domain.SysAlumni;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-10-15
 */
public interface ISysAlumniService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SysAlumni selectSysAlumniById(String ID);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysAlumni 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysAlumni> selectSysAlumniList(SysAlumni sysAlumni);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysAlumni 【请填写功能名称】
     * @return 结果
     */
    public int insertSysAlumni(SysAlumni sysAlumni);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysAlumni 【请填写功能名称】
     * @return 结果
     */
    public int updateSysAlumni(SysAlumni sysAlumni);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysAlumniByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ID 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSysAlumniById(String ID);
}
