package com.alumni.system.mapper;

import java.util.List;
import com.alumni.system.domain.SysAlumni;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-10-15
 */
public interface SysAlumniMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSysAlumniById(String ID);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param IDs 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysAlumniByIds(String[] IDs);
}
