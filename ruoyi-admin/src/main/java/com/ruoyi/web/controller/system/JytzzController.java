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
import com.ruoyi.system.domain.Jytzz;
import com.ruoyi.system.service.IJytzzService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交易通知主Controller
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
@RestController
@RequestMapping("/system/jytzz")
public class JytzzController extends BaseController
{
    @Autowired
    private IJytzzService jytzzService;

    /**
     * 查询交易通知主列表
     */
    @PreAuthorize("@ss.hasPermi('system:jytzz:list')")
    @GetMapping("/list")
    public TableDataInfo list(Jytzz jytzz)
    {
        startPage();
        List<Jytzz> list = jytzzService.selectJytzzList(jytzz);
        return getDataTable(list);
    }




    /**
     * 导出交易通知主列表
     */
    @PreAuthorize("@ss.hasPermi('system:jytzz:export')")
    @Log(title = "交易通知主", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Jytzz jytzz)
    {
        List<Jytzz> list = jytzzService.selectJytzzList(jytzz);
        ExcelUtil<Jytzz> util = new ExcelUtil<Jytzz>(Jytzz.class);
        util.exportExcel(response, list, "交易通知主数据");
    }

    /**
     * 获取交易通知主详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:jytzz:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(jytzzService.selectJytzzById(id));
    }

    /**
     * 新增交易通知主
     */

    @Log(title = "交易通知主", businessType = BusinessType.INSERT)
    @PostMapping("/jytz")
    public AjaxResult jytzadd(@RequestBody Jytzz jytzz)
    {
        return toAjax(jytzzService.insertJytzz(jytzz));
    }



    @PreAuthorize("@ss.hasPermi('system:jytzz:add')")
    @Log(title = "交易通知主", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Jytzz jytzz)
    {
        return toAjax(jytzzService.insertJytzz(jytzz));
    }
    /**
     * 修改交易通知主
     */
    @PreAuthorize("@ss.hasPermi('system:jytzz:edit')")
    @Log(title = "交易通知主", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Jytzz jytzz)
    {
        return toAjax(jytzzService.updateJytzz(jytzz));
    }

    /**
     * 删除交易通知主
     */
    @PreAuthorize("@ss.hasPermi('system:jytzz:remove')")
    @Log(title = "交易通知主", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(jytzzService.deleteJytzzByIds(ids));
    }
}
