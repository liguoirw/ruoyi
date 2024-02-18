package com.ruoyi.web.controller.system;

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
import com.ruoyi.system.domain.Jytzfc;
import com.ruoyi.system.service.IJytzfcService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交易通知返参Controller
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
@RestController
@RequestMapping("/system/jytzfc")
public class JytzfcController extends BaseController
{
    @Autowired
    private IJytzfcService jytzfcService;

    /**
     * 查询交易通知返参列表
     */
    @PreAuthorize("@ss.hasPermi('system:jytzfc:list')")
    @GetMapping("/list")
    public TableDataInfo list(Jytzfc jytzfc)
    {
        startPage();
        List<Jytzfc> list = jytzfcService.selectJytzfcList(jytzfc);
        return getDataTable(list);
    }

    /**
     * 导出交易通知返参列表
     */
    @PreAuthorize("@ss.hasPermi('system:jytzfc:export')")
    @Log(title = "交易通知返参", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Jytzfc jytzfc)
    {
        List<Jytzfc> list = jytzfcService.selectJytzfcList(jytzfc);
        ExcelUtil<Jytzfc> util = new ExcelUtil<Jytzfc>(Jytzfc.class);
        util.exportExcel(response, list, "交易通知返参数据");
    }

    /**
     * 获取交易通知返参详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:jytzfc:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(jytzfcService.selectJytzfcById(id));
    }

    /**
     * 新增交易通知返参
     */
    @PreAuthorize("@ss.hasPermi('system:jytzfc:add')")
    @Log(title = "交易通知返参", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Jytzfc jytzfc)
    {
        return toAjax(jytzfcService.insertJytzfc(jytzfc));
    }

    /**
     * 修改交易通知返参
     */
    @PreAuthorize("@ss.hasPermi('system:jytzfc:edit')")
    @Log(title = "交易通知返参", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Jytzfc jytzfc)
    {
        return toAjax(jytzfcService.updateJytzfc(jytzfc));
    }

    /**
     * 删除交易通知返参
     */
    @PreAuthorize("@ss.hasPermi('system:jytzfc:remove')")
    @Log(title = "交易通知返参", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(jytzfcService.deleteJytzfcByIds(ids));
    }
}
