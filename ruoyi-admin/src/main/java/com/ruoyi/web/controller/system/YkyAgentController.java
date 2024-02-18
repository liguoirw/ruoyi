package com.ruoyi.web.controller.system;

import java.util.List;
import java.util.Random;
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
import com.ruoyi.system.domain.YkyAgent;
import com.ruoyi.system.service.IYkyAgentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 代理商Controller
 * 
 * @author ruoyi
 * @date 2024-02-01
 */
@RestController
@RequestMapping("/system/agent")
public class YkyAgentController extends BaseController
{
    @Autowired
    private IYkyAgentService ykyAgentService;

    /**
     * 查询代理商列表
     */
    @PreAuthorize("@ss.hasPermi('system:agent:list')")
    @GetMapping("/list")
    public TableDataInfo list(YkyAgent ykyAgent)
    {
        startPage();
        List<YkyAgent> list = ykyAgentService.selectYkyAgentList(ykyAgent);
        return getDataTable(list);
    }

    /**
     * 导出代理商列表
     */
    @PreAuthorize("@ss.hasPermi('system:agent:export')")
    @Log(title = "代理商", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, YkyAgent ykyAgent)
    {
        List<YkyAgent> list = ykyAgentService.selectYkyAgentList(ykyAgent);
        ExcelUtil<YkyAgent> util = new ExcelUtil<YkyAgent>(YkyAgent.class);
        util.exportExcel(response, list, "代理商数据");
    }

    /**
     * 获取代理商详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:agent:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ykyAgentService.selectYkyAgentById(id));
    }

    /**
     * 新增代理商
     */
    @PreAuthorize("@ss.hasPermi('system:agent:add')")
    @Log(title = "代理商", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody YkyAgent ykyAgent)
    {
        ykyAgent.setPromotionNo(generateSoleName());
        toAjax(ykyAgentService.insertYkyAgent(ykyAgent));
        YkyAgent agentData = ykyAgentService.selectYkyAgentList(ykyAgent).get(0);
        String belongAgentNo = agentData.getBelongAgentNo();
        if(!("").equals(belongAgentNo)&& belongAgentNo != null){
            YkyAgent ykyAgentData = ykyAgentService.selectAgentByProNo(belongAgentNo);
            String agentName = ykyAgentData.getAgentName();
            if(!("").equals(agentName)&& agentName != null){
                //下级代理商
                ykyAgentData.setAgentName(agentName.concat(".").concat(agentData.getCompanyName()));
            }else{
                //下级代理商
                ykyAgentData.setAgentName(agentData.getCompanyName());
            }
            ykyAgentService.updateYkyAgent(ykyAgentData);
            int status = Integer.parseInt(ykyAgentData.getAgentStatus());
            //代理商级别
            agentData.setAgentStatus((status+1)+"");
            //上级代理商编号
            agentData.setSuperiorNo(ykyAgentData.getId().toString());
            //上级代理商名称
            agentData.setSuperiorName(ykyAgentData.getCompanyName());
            //代理商编号树
            agentData.setRouteNo(ykyAgentData.getRouteNo().concat(".").concat(agentData.getId().toString()));
            //代理商名称树
            agentData.setRouteName(ykyAgentData.getRouteName().concat(".").concat(agentData.getCompanyName()));
        }else{
            agentData.setAgentStatus("1");
            agentData.setSuperiorNo("");
            agentData.setSuperiorName("");
            agentData.setRouteNo(agentData.getId().toString());
            agentData.setRouteName(agentData.getCompanyName());
        }
        ykyAgentService.updateYkyAgent(agentData);
        return success();
    }

    /**
     * 修改代理商
     */
    @PreAuthorize("@ss.hasPermi('system:agent:edit')")
    @Log(title = "代理商", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody YkyAgent ykyAgent)
    {
        return toAjax(ykyAgentService.updateYkyAgent(ykyAgent));
    }

    /**
     * 删除代理商
     */
    @PreAuthorize("@ss.hasPermi('system:agent:remove')")
    @Log(title = "代理商", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ykyAgentService.deleteYkyAgentByIds(ids));
    }

    /**
     * 随机生成六位不重复的随机数
     */
    public static String generateSoleName() {
        String tmpResult;
        StringBuilder soleResult = new StringBuilder();
        //生成7位随机
        for (int i = 1; i <= 6; i++) {
            //判断产生的随机数是0还是1，是0进入if语句用于输出数字，是1进入else用于输出字符
            int mark = Math.random() >= 0.5 ? 1 : 0;
            if (0 == mark) {
                Random random = new Random();
                //产生0-9数字
                tmpResult = random.nextInt(10) + "";
            } else {
                //'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
                char[] englishNumArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                Random random = new Random();
                int sub = random.nextInt(englishNumArray.length);
                //产生A——z字符
                tmpResult = englishNumArray[sub] + "";
            }
            soleResult.append(tmpResult);
        }
        return soleResult.toString();
    }
}
