package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.web.controller.common.CommonController;
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
import com.ruoyi.system.domain.Ceshi1;
import com.ruoyi.system.service.ICeshi1Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * tupianController
 * 
 * @author ruoyi
 * @date 2024-01-15
 */
@RestController
@RequestMapping("/system/ceshi1")
public class Ceshi1Controller extends BaseController
{
    @Autowired
    private ICeshi1Service ceshi1Service;
    @Autowired
    private CommonController commonController;

    /**
     * 查询tupian列表
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi1:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ceshi1 ceshi1)
    {
        startPage();
        List<Ceshi1> list = ceshi1Service.selectCeshi1List(ceshi1);
        return getDataTable(list);
    }
    /**
     * 查询tupian列表
     */

    @GetMapping("/listall")
    public TableDataInfo listall(Ceshi1 ceshi1)
    {

        List<Ceshi1> list = ceshi1Service.selectCeshi1List(ceshi1);
        return getDataTable(list);
    }
    /**
     * 导出tupian列表
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi1:export')")
    @Log(title = "tupian", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Ceshi1 ceshi1)
    {
        List<Ceshi1> list = ceshi1Service.selectCeshi1List(ceshi1);
        ExcelUtil<Ceshi1> util = new ExcelUtil<Ceshi1>(Ceshi1.class);
        util.exportExcel(response, list, "tupian数据");
    }

    /**
     * 获取tupian详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi1:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ceshi1Service.selectCeshi1ById(id));
    }

    /**
     * 新增tupian
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi1:add')")
    @Log(title = "tupian", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Ceshi1 ceshi1)
    {

        String str1=ceshi1.getTupiandizhi().substring(0, ceshi1.getTupiandizhi().indexOf("."));
        String str2=ceshi1.getTupiandizhi().substring(str1.length()+1, ceshi1.getTupiandizhi().length());
        String str3=ceshi1.getTupiandizhi().substring(8, ceshi1.getTupiandizhi().length());
        String str5="d:/ruoyi/uploadPath"+str3;
        String str6=str5.substring(0, str5.indexOf("."));
        String str7=str5.substring(str6.length()+1, str5.length());
        String str8=str6+"shuiyin."+str7;

        commonController.addWaterMark(str5,str8,ceshi1.getName());
        ceshi1.setBak(str1+"shuiyin."+str2);
        return toAjax(ceshi1Service.insertCeshi1(ceshi1));
    }

    /**
     * 修改tupian
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi1:edit')")
    @Log(title = "tupian", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Ceshi1 ceshi1)
    {



        return toAjax(ceshi1Service.updateCeshi1(ceshi1));
    }

    /**
     * 删除tupian
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi1:remove')")
    @Log(title = "tupian", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ceshi1Service.deleteCeshi1ByIds(ids));
    }
}
