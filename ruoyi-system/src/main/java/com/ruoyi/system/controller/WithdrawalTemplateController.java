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
import com.ruoyi.system.domain.WithdrawalTemplate;
import com.ruoyi.system.service.IWithdrawalTemplateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 提现模板Controller
 * 
 * @author ztc
 * @date 2024-02-22
 */
@RestController
@RequestMapping("/system/template")
public class WithdrawalTemplateController extends BaseController
{
    @Autowired
    private IWithdrawalTemplateService withdrawalTemplateService;

    /**
     * 查询提现模板列表
     */
    @PreAuthorize("@ss.hasPermi('system:template:list')")
    @GetMapping("/list")
    public TableDataInfo list(WithdrawalTemplate withdrawalTemplate)
    {
        startPage();
        List<WithdrawalTemplate> list = withdrawalTemplateService.selectWithdrawalTemplateList(withdrawalTemplate);
        return getDataTable(list);
    }

    /**
     * 导出提现模板列表
     */
    @PreAuthorize("@ss.hasPermi('system:template:export')")
    @Log(title = "提现模板", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WithdrawalTemplate withdrawalTemplate)
    {
        List<WithdrawalTemplate> list = withdrawalTemplateService.selectWithdrawalTemplateList(withdrawalTemplate);
        ExcelUtil<WithdrawalTemplate> util = new ExcelUtil<WithdrawalTemplate>(WithdrawalTemplate.class);
        util.exportExcel(response, list, "提现模板数据");
    }

    /**
     * 获取提现模板详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:template:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(withdrawalTemplateService.selectWithdrawalTemplateById(id));
    }

    /**
     * 新增提现模板
     */
    @PreAuthorize("@ss.hasPermi('system:template:add')")
    @Log(title = "提现模板", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WithdrawalTemplate withdrawalTemplate)
    {
        return toAjax(withdrawalTemplateService.insertWithdrawalTemplate(withdrawalTemplate));
    }

    /**
     * 修改提现模板
     */
    @PreAuthorize("@ss.hasPermi('system:template:edit')")
    @Log(title = "提现模板", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WithdrawalTemplate withdrawalTemplate)
    {
        return toAjax(withdrawalTemplateService.updateWithdrawalTemplate(withdrawalTemplate));
    }

    /**
     * 删除提现模板
     */
    @PreAuthorize("@ss.hasPermi('system:template:remove')")
    @Log(title = "提现模板", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(withdrawalTemplateService.deleteWithdrawalTemplateByIds(ids));
    }
}
