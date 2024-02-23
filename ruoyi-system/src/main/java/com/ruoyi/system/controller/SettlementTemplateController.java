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
import com.ruoyi.system.domain.SettlementTemplate;
import com.ruoyi.system.service.ISettlementTemplateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 金控Controller
 * 
 * @author ztc
 * @date 2024-02-23
 */
@RestController
@RequestMapping("/system/templatejs_jk")
public class SettlementTemplateController extends BaseController
{
    @Autowired
    private ISettlementTemplateService settlementTemplateService;

    /**
     * 查询金控列表
     */
    @PreAuthorize("@ss.hasPermi('system:templatejs_jk:list')")
    @GetMapping("/list")
    public TableDataInfo list(SettlementTemplate settlementTemplate)
    {
        startPage();
        List<SettlementTemplate> list = settlementTemplateService.selectSettlementTemplateList(settlementTemplate);
        return getDataTable(list);
    }

    /**
     * 导出金控列表
     */
    @PreAuthorize("@ss.hasPermi('system:templatejs_jk:export')")
    @Log(title = "金控", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SettlementTemplate settlementTemplate)
    {
        List<SettlementTemplate> list = settlementTemplateService.selectSettlementTemplateList(settlementTemplate);
        ExcelUtil<SettlementTemplate> util = new ExcelUtil<SettlementTemplate>(SettlementTemplate.class);
        util.exportExcel(response, list, "金控数据");
    }

    /**
     * 获取金控详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:templatejs_jk:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(settlementTemplateService.selectSettlementTemplateById(id));
    }

    /**
     * 新增金控
     */
    @PreAuthorize("@ss.hasPermi('system:templatejs_jk:add')")
    @Log(title = "金控", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SettlementTemplate settlementTemplate)
    {
        return toAjax(settlementTemplateService.insertSettlementTemplate(settlementTemplate));
    }

    /**
     * 修改金控
     */
    @PreAuthorize("@ss.hasPermi('system:templatejs_jk:edit')")
    @Log(title = "金控", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SettlementTemplate settlementTemplate)
    {
        return toAjax(settlementTemplateService.updateSettlementTemplate(settlementTemplate));
    }

    /**
     * 删除金控
     */
    @PreAuthorize("@ss.hasPermi('system:templatejs_jk:remove')")
    @Log(title = "金控", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(settlementTemplateService.deleteSettlementTemplateByIds(ids));
    }
}
