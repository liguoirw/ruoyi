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
import com.ruoyi.system.domain.TerminalImplement;
import com.ruoyi.system.service.ITerminalImplementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 机具调拨记录Controller
 * 
 * @author wutianxiang
 * @date 2024-02-23
 */
@RestController
@RequestMapping("/system/implement")
public class TerminalImplementController extends BaseController
{
    @Autowired
    private ITerminalImplementService terminalImplementService;

    /**
     * 查询机具调拨记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:implement:list')")
    @GetMapping("/list")
    public TableDataInfo list(TerminalImplement terminalImplement)
    {
        startPage();
        List<TerminalImplement> list = terminalImplementService.selectTerminalImplementList(terminalImplement);
        return getDataTable(list);
    }

    /**
     * 导出机具调拨记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:implement:export')")
    @Log(title = "机具调拨记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TerminalImplement terminalImplement)
    {
        List<TerminalImplement> list = terminalImplementService.selectTerminalImplementList(terminalImplement);
        ExcelUtil<TerminalImplement> util = new ExcelUtil<TerminalImplement>(TerminalImplement.class);
        util.exportExcel(response, list, "机具调拨记录数据");
    }

    /**
     * 获取机具调拨记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:implement:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(terminalImplementService.selectTerminalImplementById(id));
    }

    /**
     * 新增机具调拨记录
     */
    @PreAuthorize("@ss.hasPermi('system:implement:add')")
    @Log(title = "机具调拨记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TerminalImplement terminalImplement)
    {
        return toAjax(terminalImplementService.insertTerminalImplement(terminalImplement));
    }

    /**
     * 修改机具调拨记录
     */
    @PreAuthorize("@ss.hasPermi('system:implement:edit')")
    @Log(title = "机具调拨记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TerminalImplement terminalImplement)
    {
        return toAjax(terminalImplementService.updateTerminalImplement(terminalImplement));
    }

    /**
     * 删除机具调拨记录
     */
    @PreAuthorize("@ss.hasPermi('system:implement:remove')")
    @Log(title = "机具调拨记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(terminalImplementService.deleteTerminalImplementByIds(ids));
    }
}
