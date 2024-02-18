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
import com.ruoyi.system.domain.Jytzzb;
import com.ruoyi.system.service.IJytzzbService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交易通知子Controller
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
@RestController
@RequestMapping("/system/jytzzb")
public class JytzzbController extends BaseController
{
    @Autowired
    private IJytzzbService jytzzbService;

    /**
     * 查询交易通知子列表
     */
    @PreAuthorize("@ss.hasPermi('system:jytzzb:list')")
    @GetMapping("/list")
    public TableDataInfo list(Jytzzb jytzzb)
    {
        startPage();
        List<Jytzzb> list = jytzzbService.selectJytzzbList(jytzzb);
        return getDataTable(list);
    }

    /**
     * 导出交易通知子列表
     */
    @PreAuthorize("@ss.hasPermi('system:jytzzb:export')")
    @Log(title = "交易通知子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Jytzzb jytzzb)
    {
        List<Jytzzb> list = jytzzbService.selectJytzzbList(jytzzb);
        ExcelUtil<Jytzzb> util = new ExcelUtil<Jytzzb>(Jytzzb.class);
        util.exportExcel(response, list, "交易通知子数据");
    }

    /**
     * 获取交易通知子详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:jytzzb:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(jytzzbService.selectJytzzbById(id));
    }

    /**
     * 新增交易通知子
     */
    @PreAuthorize("@ss.hasPermi('system:jytzzb:add')")
    @Log(title = "交易通知子", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Jytzzb jytzzb)
    {
        return toAjax(jytzzbService.insertJytzzb(jytzzb));
    }

    /**
     * 修改交易通知子
     */
    @PreAuthorize("@ss.hasPermi('system:jytzzb:edit')")
    @Log(title = "交易通知子", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Jytzzb jytzzb)
    {
        return toAjax(jytzzbService.updateJytzzb(jytzzb));
    }

    /**
     * 删除交易通知子
     */
    @PreAuthorize("@ss.hasPermi('system:jytzzb:remove')")
    @Log(title = "交易通知子", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(jytzzbService.deleteJytzzbByIds(ids));
    }
}
