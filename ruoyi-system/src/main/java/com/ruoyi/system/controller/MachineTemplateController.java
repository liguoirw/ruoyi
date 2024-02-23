package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MachineTemplate;
import com.ruoyi.system.service.IMachineTemplateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 机具模版Controller
 * 
 * @author ztc
 * @date 2024-02-22
 */
@RestController
@RequestMapping("/system/templatejj")
public class MachineTemplateController extends BaseController
{
    @Autowired
    private IMachineTemplateService machineTemplateService;

    /**
     * 查询机具模版列表
     */
    @PreAuthorize("@ss.hasPermi('system:templatejj:list')")
    @GetMapping("/list")
    public TableDataInfo list(MachineTemplate machineTemplate)
    {
        startPage();
        List<MachineTemplate> list = machineTemplateService.selectMachineTemplateList(machineTemplate);
        return getDataTable(list);
    }

    /**
     * 导出机具模版列表
     */
    @PreAuthorize("@ss.hasPermi('system:templatejj:export')")
    @Log(title = "机具模版", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MachineTemplate machineTemplate)
    {
        List<MachineTemplate> list = machineTemplateService.selectMachineTemplateList(machineTemplate);
        ExcelUtil<MachineTemplate> util = new ExcelUtil<MachineTemplate>(MachineTemplate.class);
        util.exportExcel(response, list, "机具模版数据");
    }

    /**
     * 获取机具模版详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:templatejj:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(machineTemplateService.selectMachineTemplateById(id));
    }

    /**
     * 新增机具模版
     */
    @PreAuthorize("@ss.hasPermi('system:templatejj:add')")
    @Log(title = "机具模版", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MachineTemplate machineTemplate)
    {
        return toAjax(machineTemplateService.insertMachineTemplate(machineTemplate));
    }

    /**
     * 修改机具模版
     */
    @PreAuthorize("@ss.hasPermi('system:templatejj:edit')")
    @Log(title = "机具模版", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MachineTemplate machineTemplate)
    {
        return toAjax(machineTemplateService.updateMachineTemplate(machineTemplate));
    }

    /**
     * 删除机具模版
     */
    @PreAuthorize("@ss.hasPermi('system:templatejj:remove')")
    @Log(title = "机具模版", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(machineTemplateService.deleteMachineTemplateByIds(ids));
    }
}
