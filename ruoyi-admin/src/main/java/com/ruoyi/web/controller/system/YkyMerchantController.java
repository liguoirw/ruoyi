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
import com.ruoyi.system.domain.YkyMerchant;
import com.ruoyi.system.service.IYkyMerchantService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商户Controller
 * 
 * @author ruoyi
 * @date 2024-02-02
 */
@RestController
@RequestMapping("/system/merchant")
public class YkyMerchantController extends BaseController
{
    @Autowired
    private IYkyMerchantService ykyMerchantService;

    /**
     * 查询商户列表
     */
    @PreAuthorize("@ss.hasPermi('system:merchant:list')")
    @GetMapping("/list")
    public TableDataInfo list(YkyMerchant ykyMerchant)
    {
        startPage();
        List<YkyMerchant> list = ykyMerchantService.selectYkyMerchantList(ykyMerchant);
        return getDataTable(list);
    }

    /**
     * 导出商户列表
     */
    @PreAuthorize("@ss.hasPermi('system:merchant:export')")
    @Log(title = "商户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, YkyMerchant ykyMerchant)
    {
        List<YkyMerchant> list = ykyMerchantService.selectYkyMerchantList(ykyMerchant);
        ExcelUtil<YkyMerchant> util = new ExcelUtil<YkyMerchant>(YkyMerchant.class);
        util.exportExcel(response, list, "商户数据");
    }

    /**
     * 获取商户详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:merchant:query')")
    @GetMapping(value = "/{merchantId}")
    public AjaxResult getInfo(@PathVariable("merchantId") Long merchantId)
    {
        return success(ykyMerchantService.selectYkyMerchantByMerchantId(merchantId));
    }

    /**
     * 新增商户
     */
    @PreAuthorize("@ss.hasPermi('system:merchant:add')")
    @Log(title = "商户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody YkyMerchant ykyMerchant)
    {
        return toAjax(ykyMerchantService.insertYkyMerchant(ykyMerchant));
    }

    /**
     * 修改商户
     */
    @PreAuthorize("@ss.hasPermi('system:merchant:edit')")
    @Log(title = "商户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody YkyMerchant ykyMerchant)
    {
        return toAjax(ykyMerchantService.updateYkyMerchant(ykyMerchant));
    }

    /**
     * 删除商户
     */
    @PreAuthorize("@ss.hasPermi('system:merchant:remove')")
    @Log(title = "商户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{merchantIds}")
    public AjaxResult remove(@PathVariable Long[] merchantIds)
    {
        return toAjax(ykyMerchantService.deleteYkyMerchantByMerchantIds(merchantIds));
    }
}
