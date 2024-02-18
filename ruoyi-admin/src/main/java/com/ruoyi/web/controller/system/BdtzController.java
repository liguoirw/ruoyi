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
import com.ruoyi.system.domain.Bdtz;
import com.ruoyi.system.service.IBdtzService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 绑机通知Controller
 * 
 * @author ruoyi
 * @date 2024-01-29
 */
@RestController
@RequestMapping("/system/bdtz")
public class BdtzController extends BaseController
{
    @Autowired
    private IBdtzService bdtzService;

    /**
     * 查询绑机通知列表
     */
    @PreAuthorize("@ss.hasPermi('system:bdtz:list')")
    @GetMapping("/list")
    public TableDataInfo list(Bdtz bdtz)
    {
        startPage();
        List<Bdtz> list = bdtzService.selectBdtzList(bdtz);
        return getDataTable(list);
    }

    /**
     * 导出绑机通知列表
     */
    @PreAuthorize("@ss.hasPermi('system:bdtz:export')")
    @Log(title = "绑机通知", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Bdtz bdtz)
    {
        List<Bdtz> list = bdtzService.selectBdtzList(bdtz);
        ExcelUtil<Bdtz> util = new ExcelUtil<Bdtz>(Bdtz.class);
        util.exportExcel(response, list, "绑机通知数据");
    }

    /**
     * 获取绑机通知详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:bdtz:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bdtzService.selectBdtzById(id));
    }

    /**
     * 新增绑机通知
     */
    @PreAuthorize("@ss.hasPermi('system:bdtz:add')")
    @Log(title = "绑机通知", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Bdtz bdtz)
    {
        return toAjax(bdtzService.insertBdtz(bdtz));
    }

    /**
     * 修改绑机通知
     */
    @PreAuthorize("@ss.hasPermi('system:bdtz:edit')")
    @Log(title = "绑机通知", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Bdtz bdtz)
    {
        return toAjax(bdtzService.updateBdtz(bdtz));
    }

    /**
     * 删除绑机通知
     */
    @PreAuthorize("@ss.hasPermi('system:bdtz:remove')")
    @Log(title = "绑机通知", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bdtzService.deleteBdtzByIds(ids));
    }
}
