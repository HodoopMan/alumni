package com.alumni.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alumni.common.annotation.Log;
import com.alumni.common.enums.BusinessType;
import com.alumni.system.domain.SysAlumni;
import com.alumni.system.service.ISysAlumniService;
import com.alumni.common.core.controller.BaseController;
import com.alumni.common.core.domain.AjaxResult;
import com.alumni.common.utils.poi.ExcelUtil;
import com.alumni.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2021-10-15
 */
@Controller
@RequestMapping("/system/alumni")
public class SysAlumniController extends BaseController
{
    private String prefix = "system/alumni";

    @Autowired
    private ISysAlumniService sysAlumniService;

    @RequiresPermissions("system:alumni:view")
    @GetMapping()
    public String alumni()
    {
        return prefix + "/alumni";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:alumni:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysAlumni sysAlumni)
    {
        startPage();
        List<SysAlumni> list = sysAlumniService.selectSysAlumniList(sysAlumni);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:alumni:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysAlumni sysAlumni)
    {
        List<SysAlumni> list = sysAlumniService.selectSysAlumniList(sysAlumni);
        ExcelUtil<SysAlumni> util = new ExcelUtil<SysAlumni>(SysAlumni.class);
        return util.exportExcel(list, "alumni");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:alumni:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysAlumni sysAlumni)
    {
        return toAjax(sysAlumniService.insertSysAlumni(sysAlumni));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{ID}")
    public String edit(@PathVariable("ID") String ID, ModelMap mmap)
    {
        SysAlumni sysAlumni = sysAlumniService.selectSysAlumniById(ID);
        mmap.put("sysAlumni", sysAlumni);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:alumni:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysAlumni sysAlumni)
    {
        return toAjax(sysAlumniService.updateSysAlumni(sysAlumni));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:alumni:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysAlumniService.deleteSysAlumniByIds(ids));
    }
}
