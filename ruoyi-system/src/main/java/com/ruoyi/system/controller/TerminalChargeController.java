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
import com.ruoyi.system.domain.TerminalCharge;
import com.ruoyi.system.service.ITerminalChargeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 服务费冻结记录Controller
 * 
 * @author wutianxiang
 * @date 2024-02-22
 */
@RestController
@RequestMapping("/system/charge")
public class TerminalChargeController extends BaseController
{
    @Autowired
    private ITerminalChargeService terminalChargeService;

    /**
     * 查询服务费冻结记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:charge:list')")
    @GetMapping("/list")
    public TableDataInfo list(TerminalCharge terminalCharge)
    {
        startPage();
        List<TerminalCharge> list = terminalChargeService.selectTerminalChargeList(terminalCharge);
        return getDataTable(list);
    }

    /**
     * 导出服务费冻结记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:charge:export')")
    @Log(title = "服务费冻结记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TerminalCharge terminalCharge)
    {
        List<TerminalCharge> list = terminalChargeService.selectTerminalChargeList(terminalCharge);
        ExcelUtil<TerminalCharge> util = new ExcelUtil<TerminalCharge>(TerminalCharge.class);
        util.exportExcel(response, list, "服务费冻结记录数据");
    }

    /**
     * 获取服务费冻结记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:charge:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(terminalChargeService.selectTerminalChargeById(id));
    }

    /**
     * 新增服务费冻结记录
     */
    @PreAuthorize("@ss.hasPermi('system:charge:add')")
    @Log(title = "服务费冻结记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TerminalCharge terminalCharge)
    {
        return toAjax(terminalChargeService.insertTerminalCharge(terminalCharge));
    }

    /**
     * 修改服务费冻结记录
     */
    @PreAuthorize("@ss.hasPermi('system:charge:edit')")
    @Log(title = "服务费冻结记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TerminalCharge terminalCharge)
    {
        return toAjax(terminalChargeService.updateTerminalCharge(terminalCharge));
    }

    /**
     * 删除服务费冻结记录
     */
    @PreAuthorize("@ss.hasPermi('system:charge:remove')")
    @Log(title = "服务费冻结记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(terminalChargeService.deleteTerminalChargeByIds(ids));
    }
}
