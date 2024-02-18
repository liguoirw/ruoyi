package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.Api;
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
import com.ruoyi.system.domain.Wenjuanjieguo;
import com.ruoyi.system.service.IWenjuanjieguoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 问卷结果Controller
 * 
 * @author ruoyi
 * @date 2024-01-12
 */
@RestController
@RequestMapping("/system/wenjuanjieguo")
public class WenjuanjieguoController extends BaseController
{
    @Autowired
    private IWenjuanjieguoService wenjuanjieguoService;

    /**
     * 查询问卷结果列表
     */

    @GetMapping("/list")
    public TableDataInfo list(Wenjuanjieguo wenjuanjieguo)
    {
        startPage();
        List<Wenjuanjieguo> list = wenjuanjieguoService.selectWenjuanjieguoList(wenjuanjieguo);
        return getDataTable(list);
    }

    /**
     * 导出问卷结果列表
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuanjieguo:export')")
    @Log(title = "问卷结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Wenjuanjieguo wenjuanjieguo)
    {
        List<Wenjuanjieguo> list = wenjuanjieguoService.selectWenjuanjieguoList(wenjuanjieguo);
        ExcelUtil<Wenjuanjieguo> util = new ExcelUtil<Wenjuanjieguo>(Wenjuanjieguo.class);
        util.exportExcel(response, list, "问卷结果数据");
    }

    /**
     * 获取问卷结果详细信息
     */

    @GetMapping(value = "/{id}")

    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(wenjuanjieguoService.selectWenjuanjieguoById(id));
    }

    /**
     * 新增问卷结果
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuanjieguo:add')")
    @Log(title = "问卷结果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Wenjuanjieguo wenjuanjieguo)
    {
        return toAjax(wenjuanjieguoService.insertWenjuanjieguo(wenjuanjieguo));
    }

    /**
     * 修改问卷结果
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuanjieguo:edit')")
    @Log(title = "问卷结果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Wenjuanjieguo wenjuanjieguo)
    {
        return toAjax(wenjuanjieguoService.updateWenjuanjieguo(wenjuanjieguo));
    }

    /**
     * 删除问卷结果
     */
    @PreAuthorize("@ss.hasPermi('system:wenjuanjieguo:remove')")
    @Log(title = "问卷结果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wenjuanjieguoService.deleteWenjuanjieguoByIds(ids));
    }
}
