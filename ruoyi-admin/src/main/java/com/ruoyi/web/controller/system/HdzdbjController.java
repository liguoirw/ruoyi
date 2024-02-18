package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoyi.system.domain.Shoujiceshi;
import com.ruoyi.web.controller.common.TokenUtil;
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
import com.ruoyi.system.domain.Hdzdbj;
import com.ruoyi.system.service.IHdzdbjService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 活动终端标记Controller
 * 
 * @author liguo
 * @date 2024-01-29
 */
@RestController
@RequestMapping("/system/hdzdbj")
public class HdzdbjController extends BaseController
{
    @Autowired
    private IHdzdbjService hdzdbjService;

    /**
     * 查询活动终端标记列表
     */
    @PreAuthorize("@ss.hasPermi('system:hdzdbj:list')")
    @GetMapping("/list")
    public TableDataInfo list(Hdzdbj hdzdbj)
    {
        startPage();
        List<Hdzdbj> list = hdzdbjService.selectHdzdbjList(hdzdbj);
        return getDataTable(list);
    }

    /**
     * 导出活动终端标记列表
     */
    @PreAuthorize("@ss.hasPermi('system:hdzdbj:export')")
    @Log(title = "活动终端标记", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Hdzdbj hdzdbj)
    {
        List<Hdzdbj> list = hdzdbjService.selectHdzdbjList(hdzdbj);
        ExcelUtil<Hdzdbj> util = new ExcelUtil<Hdzdbj>(Hdzdbj.class);
        util.exportExcel(response, list, "活动终端标记数据");
    }

    /**
     * 获取活动终端标记详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:hdzdbj:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(hdzdbjService.selectHdzdbjById(id));
    }




    /**
     * 新增活动终端标记
     */
    @PreAuthorize("@ss.hasPermi('system:hdzdbj:add')")
    @Log(title = "活动终端标记", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Hdzdbj hdzdbj)
    {
        return toAjax(hdzdbjService.insertHdzdbj(hdzdbj));
    }

    /**
     * 修改活动终端标记
     */
    @PreAuthorize("@ss.hasPermi('system:hdzdbj:edit')")
    @Log(title = "活动终端标记", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Hdzdbj hdzdbj)
    {
        return toAjax(hdzdbjService.updateHdzdbj(hdzdbj));
    }

    /**
     * 删除活动终端标记
     */
    @PreAuthorize("@ss.hasPermi('system:hdzdbj:remove')")
    @Log(title = "活动终端标记", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hdzdbjService.deleteHdzdbjByIds(ids));
    }

    /**
     * 服务费代收
     */
    @GetMapping("/serviceChargeCollect")
    public String serviceChargeCollect(Hdzdbj hdzdbj) throws JsonProcessingException {

        TokenUtil tokenUtil = new TokenUtil("74800623", "748006234755DEF3");
        String tokenType = "2082";
        String token = null;
        try {
            token = tokenUtil.getToken(tokenType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Token: " + token);

        JSONObject jObj =  JSONObject.parseObject(token);

        JSONObject jObj1 =  JSONObject.parseObject(jObj.get("data").toString());

        String result= tokenUtil.getfwfds(jObj1.get("token").toString(),hdzdbj.getShbm(),"","1001010","0","0","0","0","0001","");

        System.out.println(result);


        return "1111111";
    }
}
