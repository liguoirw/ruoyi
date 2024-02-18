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
import com.ruoyi.system.domain.Wenjuandiaocha;
import com.ruoyi.system.service.IWenjuandiaochaService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 信用卡申请大数据评估系统Controller
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
@RestController
@RequestMapping("/system/wenjuandiaocha")
public class WenjuandiaochaController extends BaseController
{
    @Autowired
    private IWenjuandiaochaService wenjuandiaochaService;

    /**
     * 查询信用卡申请大数据评估系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuandiaocha:list')")
    @GetMapping("/list")
    public TableDataInfo list(Wenjuandiaocha wenjuandiaocha)
    {
        startPage();
        List<Wenjuandiaocha> list = wenjuandiaochaService.selectWenjuandiaochaList(wenjuandiaocha);
        return getDataTable(list);
    }

    /**
     * 导出信用卡申请大数据评估系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuandiaocha:export')")
    @Log(title = "信用卡申请大数据评估系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Wenjuandiaocha wenjuandiaocha)
    {
        List<Wenjuandiaocha> list = wenjuandiaochaService.selectWenjuandiaochaList(wenjuandiaocha);
        ExcelUtil<Wenjuandiaocha> util = new ExcelUtil<Wenjuandiaocha>(Wenjuandiaocha.class);
        util.exportExcel(response, list, "信用卡申请大数据评估系统数据");
    }

    /**
     * 获取信用卡申请大数据评估系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuandiaocha:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(wenjuandiaochaService.selectWenjuandiaochaById(id));
    }

    /**
     * 新增信用卡申请大数据评估系统
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuandiaocha:add')")
    @Log(title = "信用卡申请大数据评估系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Wenjuandiaocha wenjuandiaocha)
    {
        return toAjax(wenjuandiaochaService.insertWenjuandiaocha(wenjuandiaocha));
    }

    /**
     * 修改信用卡申请大数据评估系统
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuandiaocha:edit')")
    @Log(title = "信用卡申请大数据评估系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Wenjuandiaocha wenjuandiaocha)
    {
        return toAjax(wenjuandiaochaService.updateWenjuandiaocha(wenjuandiaocha));
    }

    /**
     * 删除信用卡申请大数据评估系统
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuandiaocha:remove')")
    @Log(title = "信用卡申请大数据评估系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wenjuandiaochaService.deleteWenjuandiaochaByIds(ids));
    }
}
