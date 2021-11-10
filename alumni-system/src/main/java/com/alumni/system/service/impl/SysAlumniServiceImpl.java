package com.alumni.system.service.impl;

import java.util.List;

import com.alumni.common.annotation.DataSource;
import com.alumni.common.enums.DataSourceType;
import com.alumni.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alumni.system.mapper.SysAlumniMapper;
import com.alumni.system.domain.SysAlumni;
import com.alumni.system.service.ISysAlumniService;
import com.alumni.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2021-10-15
 */
@Service
public class SysAlumniServiceImpl implements ISysAlumniService
{
    @Autowired
    private SysAlumniMapper sysAlumniMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param ID 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public SysAlumni selectSysAlumniById(String ID)
    {
        return sysAlumniMapper.selectSysAlumniById(ID);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysAlumni 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<SysAlumni> selectSysAlumniList(SysAlumni sysAlumni)
    {
        return sysAlumniMapper.selectSysAlumniList(sysAlumni);
    }

    /**
     * 查询【附属单位职工】列表
     *
     * @param sysAlumni 【附属单位职工】
     * @return 【附属单位职工】
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<SysAlumni> selectSysHpAlumniList(SysAlumni sysAlumni)
    {
        return sysAlumniMapper.selectSysStuAlumniList(sysAlumni);
    }

    /**
     * 查询【学生】列表
     *
     * @param sysAlumni 【学生】
     * @return 【学生】
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<SysAlumni> selectSysStuAlumniList(SysAlumni sysAlumni)
    {
        return sysAlumniMapper.selectSysStuAlumniList(sysAlumni);
    }


    /**
     * 查询【教职工】列表
     *
     * @param sysAlumni 【教职工】
     * @return 【教职工】
     */
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<SysAlumni> selectSysTeaAlumniList(SysAlumni sysAlumni)
    {
        return sysAlumniMapper.selectSysTeaAlumniList(sysAlumni);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sysAlumni 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysAlumni(SysAlumni sysAlumni)
    {
        sysAlumni.setCreateTime(DateUtils.getNowDate());
        return sysAlumniMapper.insertSysAlumni(sysAlumni);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sysAlumni 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysAlumni(SysAlumni sysAlumni)
    {
        sysAlumni.setUpdateTime(DateUtils.getNowDate());
        return sysAlumniMapper.updateSysAlumni(sysAlumni);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysAlumniByIds(String ids)
    {
        return sysAlumniMapper.deleteSysAlumniByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param ID 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSysAlumniById(String ID)
    {
        return sysAlumniMapper.deleteSysAlumniById(ID);
    }
}
