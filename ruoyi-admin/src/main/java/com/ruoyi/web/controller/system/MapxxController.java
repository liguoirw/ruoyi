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
import com.ruoyi.system.domain.Mapxx;
import com.ruoyi.system.service.IMapxxService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 地图信息Controller
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
@RestController
@RequestMapping("/system/mapxx")
public class MapxxController extends BaseController
{
    @Autowired
    private IMapxxService mapxxService;

    /**
     * 查询地图信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:mapxx:list')")
    @GetMapping("/list")
    public TableDataInfo list(Mapxx mapxx)
    {
        startPage();
        List<Mapxx> list = mapxxService.selectMapxxList(mapxx);
        return getDataTable(list);
    }

    /**
     * 导出地图信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:mapxx:export')")
    @Log(title = "地图信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Mapxx mapxx)
    {
        List<Mapxx> list = mapxxService.selectMapxxList(mapxx);
        ExcelUtil<Mapxx> util = new ExcelUtil<Mapxx>(Mapxx.class);
        util.exportExcel(response, list, "地图信息数据");
    }

    /**
     * 获取地图信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:mapxx:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mapxxService.selectMapxxById(id));
    }

    /**
     * 新增地图信息
     */
    @PreAuthorize("@ss.hasPermi('system:mapxx:add')")
    @Log(title = "地图信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Mapxx mapxx)
    {
        return toAjax(mapxxService.insertMapxx(mapxx));
    }

    /**
     * 修改地图信息
     */
    @PreAuthorize("@ss.hasPermi('system:mapxx:edit')")
    @Log(title = "地图信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Mapxx mapxx)
    {
        return toAjax(mapxxService.updateMapxx(mapxx));
    }

    /**
     * 删除地图信息
     */
    @PreAuthorize("@ss.hasPermi('system:mapxx:remove')")
    @Log(title = "地图信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mapxxService.deleteMapxxByIds(ids));
    }
}
