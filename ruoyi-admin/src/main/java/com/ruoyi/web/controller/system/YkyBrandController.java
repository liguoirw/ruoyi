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
import com.ruoyi.system.domain.YkyBrand;
import com.ruoyi.system.service.IYkyBrandService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 品牌型号Controller
 * 
 * @author ruoyi
 * @date 2024-02-19
 */
@RestController
@RequestMapping("/system/brand")
public class YkyBrandController extends BaseController
{
    @Autowired
    private IYkyBrandService ykyBrandService;

    /**
     * 查询品牌型号列表
     */
    @PreAuthorize("@ss.hasPermi('system:brand:list')")
    @GetMapping("/list")
    public TableDataInfo list(YkyBrand ykyBrand)
    {
        startPage();
        List<YkyBrand> list = ykyBrandService.selectYkyBrandList(ykyBrand);
        return getDataTable(list);
    }

    /**
     * 导出品牌型号列表
     */
    @PreAuthorize("@ss.hasPermi('system:brand:export')")
    @Log(title = "品牌型号", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, YkyBrand ykyBrand)
    {
        List<YkyBrand> list = ykyBrandService.selectYkyBrandList(ykyBrand);
        ExcelUtil<YkyBrand> util = new ExcelUtil<YkyBrand>(YkyBrand.class);
        util.exportExcel(response, list, "品牌型号数据");
    }

    /**
     * 获取品牌型号详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:brand:query')")
    @GetMapping(value = "/{brandId}")
    public AjaxResult getInfo(@PathVariable("brandId") Long brandId)
    {
        return success(ykyBrandService.selectYkyBrandByBrandId(brandId));
    }

    /**
     * 新增品牌型号
     */
    @PreAuthorize("@ss.hasPermi('system:brand:add')")
    @Log(title = "品牌型号", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody YkyBrand ykyBrand)
    {
        return toAjax(ykyBrandService.insertYkyBrand(ykyBrand));
    }

    /**
     * 修改品牌型号
     */
    @PreAuthorize("@ss.hasPermi('system:brand:edit')")
    @Log(title = "品牌型号", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody YkyBrand ykyBrand)
    {
        return toAjax(ykyBrandService.updateYkyBrand(ykyBrand));
    }

    /**
     * 删除品牌型号
     */
    @PreAuthorize("@ss.hasPermi('system:brand:remove')")
    @Log(title = "品牌型号", businessType = BusinessType.DELETE)
	@DeleteMapping("/{brandIds}")
    public AjaxResult remove(@PathVariable Long[] brandIds)
    {
        return toAjax(ykyBrandService.deleteYkyBrandByBrandIds(brandIds));
    }
}
