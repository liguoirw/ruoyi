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
import com.ruoyi.system.domain.YkyTransation;
import com.ruoyi.system.service.IYkyTransationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交易Controller
 * 
 * @author ruoyi
 * @date 2024-02-18
 */
@RestController
@RequestMapping("/system/transation")
public class YkyTransationController extends BaseController
{
    @Autowired
    private IYkyTransationService ykyTransationService;

    /**
     * 查询交易列表
     */
    @PreAuthorize("@ss.hasPermi('system:transation:list')")
    @GetMapping("/list")
    public TableDataInfo list(YkyTransation ykyTransation)
    {
        startPage();
        List<YkyTransation> list = ykyTransationService.selectYkyTransationList(ykyTransation);
        return getDataTable(list);
    }

    /**
     * 导出交易列表
     */
    @PreAuthorize("@ss.hasPermi('system:transation:export')")
    @Log(title = "交易", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, YkyTransation ykyTransation)
    {
        List<YkyTransation> list = ykyTransationService.selectYkyTransationList(ykyTransation);
        ExcelUtil<YkyTransation> util = new ExcelUtil<YkyTransation>(YkyTransation.class);
        util.exportExcel(response, list, "交易数据");
    }

    /**
     * 获取交易详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:transation:query')")
    @GetMapping(value = "/{transId}")
    public AjaxResult getInfo(@PathVariable("transId") Long transId)
    {
        return success(ykyTransationService.selectYkyTransationByTransId(transId));
    }

    /**
     * 新增交易
     */
    @PreAuthorize("@ss.hasPermi('system:transation:add')")
    @Log(title = "交易", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody YkyTransation ykyTransation)
    {
        return toAjax(ykyTransationService.insertYkyTransation(ykyTransation));
    }

    /**
     * 修改交易
     */
    @PreAuthorize("@ss.hasPermi('system:transation:edit')")
    @Log(title = "交易", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody YkyTransation ykyTransation)
    {
        return toAjax(ykyTransationService.updateYkyTransation(ykyTransation));
    }

    /**
     * 删除交易
     */
    @PreAuthorize("@ss.hasPermi('system:transation:remove')")
    @Log(title = "交易", businessType = BusinessType.DELETE)
	@DeleteMapping("/{transIds}")
    public AjaxResult remove(@PathVariable Long[] transIds)
    {
        return toAjax(ykyTransationService.deleteYkyTransationByTransIds(transIds));
    }
}
