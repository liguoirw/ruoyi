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
import com.ruoyi.system.domain.TerminalTransfer;
import com.ruoyi.system.service.ITerminalTransferService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 划拨记录Controller
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
@RestController
@RequestMapping("/system/transfer")
public class TerminalTransferController extends BaseController
{
    @Autowired
    private ITerminalTransferService terminalTransferService;

    /**
     * 查询划拨记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:transfer:list')")
    @GetMapping("/list")
    public TableDataInfo list(TerminalTransfer terminalTransfer)
    {
        startPage();
        List<TerminalTransfer> list = terminalTransferService.selectTerminalTransferList(terminalTransfer);
        return getDataTable(list);
    }

    /**
     * 导出划拨记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:transfer:export')")
    @Log(title = "划拨记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TerminalTransfer terminalTransfer)
    {
        List<TerminalTransfer> list = terminalTransferService.selectTerminalTransferList(terminalTransfer);
        ExcelUtil<TerminalTransfer> util = new ExcelUtil<TerminalTransfer>(TerminalTransfer.class);
        util.exportExcel(response, list, "划拨记录数据");
    }

    /**
     * 获取划拨记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:transfer:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(terminalTransferService.selectTerminalTransferById(id));
    }

    /**
     * 新增划拨记录
     */
    @PreAuthorize("@ss.hasPermi('system:transfer:add')")
    @Log(title = "划拨记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TerminalTransfer terminalTransfer)
    {
        return toAjax(terminalTransferService.insertTerminalTransfer(terminalTransfer));
    }

    /**
     * 修改划拨记录
     */
    @PreAuthorize("@ss.hasPermi('system:transfer:edit')")
    @Log(title = "划拨记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TerminalTransfer terminalTransfer)
    {
        return toAjax(terminalTransferService.updateTerminalTransfer(terminalTransfer));
    }

    /**
     * 删除划拨记录
     */
    @PreAuthorize("@ss.hasPermi('system:transfer:remove')")
    @Log(title = "划拨记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(terminalTransferService.deleteTerminalTransferByIds(ids));
    }
}
