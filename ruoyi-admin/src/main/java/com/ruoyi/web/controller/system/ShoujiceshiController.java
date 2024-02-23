package com.ruoyi.web.controller.system;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.system.domain.Ceshi;
import com.ruoyi.web.controller.common.CommonController;
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
import com.ruoyi.system.domain.Shoujiceshi;
import com.ruoyi.system.service.IShoujiceshiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
/**
 * shoujiceshiController
 * 
 * @author ruoyi
 * @date 2024-01-05
 */
@RestController
@RequestMapping("/system/shoujiceshi")
public class ShoujiceshiController extends BaseController
{
    @Autowired
    private IShoujiceshiService shoujiceshiService;
    @Autowired
    private CommonController commonController;

    /**
     * 查询shoujiceshi列表
     */
    @PreAuthorize("@ss.hasPermi('system:shoujiceshi:list')")
    @GetMapping("/list")
    public TableDataInfo list(Shoujiceshi shoujiceshi)
    {
        startPage();
        List<Shoujiceshi> list = shoujiceshiService.selectShoujiceshiList(shoujiceshi);
        return getDataTable(list);
    }

    @GetMapping("/list1")
    public AjaxResult list1(Shoujiceshi shoujiceshi)
    {



        List<Shoujiceshi> list = shoujiceshiService.selectShoujiceshiList(shoujiceshi);
        AjaxResult ajax = AjaxResult.success(list);
        return ajax;
    }

    @GetMapping("/list2")
    public String list2(Shoujiceshi shoujiceshi)
    {
System.out.println("11111");
        commonController.addWaterMark("D:\\360安全浏览器下载\\fec49f59b98041a4a16886893447f746.jpeg","D:\\360安全浏览器下载\\5.jpeg","今天晚上吃什么我啥都想吃你想吃啥呢我不知道你想吃啥");


        return "1";
    }


    @GetMapping("/jiekou")
    public String jiekou(Shoujiceshi shoujiceshi) throws JsonProcessingException {



        TokenUtil tokenUtil = new TokenUtil("74800623", "748006234755DEF3");
        String tokenType = "2083";
        String token = null;
        try {
            token = tokenUtil.getToken(tokenType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Token: " + token);

        JSONObject jObj =  JSONObject.parseObject(token);

        JSONObject jObj1 =  JSONObject.parseObject(jObj.get("data").toString());
       String result= tokenUtil.getfwfds(jObj1.get("token").toString(),"748000000133666","74800623","00005702883072004268","0","10","0","0","0001","999999");
System.out.println(result);


        return "1111111";
    }

    @GetMapping("/jiekou1")
    public String jiekou1(Shoujiceshi shoujiceshi) throws JsonProcessingException {



        TokenUtil tokenUtil = new TokenUtil("74800623", "748006234755DEF3");
        String tokenType = "2087";
        String token = null;
        try {
            token = tokenUtil.getToken(tokenType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Token: " + token);

        JSONObject jObj =  JSONObject.parseObject(token);

        JSONObject jObj1 =  JSONObject.parseObject(jObj.get("data").toString());
        String result= tokenUtil.getfwfdscx(jObj1.get("token").toString(),"999999");
        System.out.println(result);


        return "1111111";
    }


    @GetMapping("/jiekoutijiao")
    public static void jiekoutijiao(String path,String data){
        try {
            URL url = new URL(path);
//打开和url之间的连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            PrintWriter out = null;
//请求方式
           // conn.setRequestMethod("get");
// conn.setRequestMethod(“POST“);
// //设置通用的请求属性
            conn.setRequestProperty("accept", "/");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            conn.setRequestProperty("Content-Length","0");
//设置是否向httpUrlConnection输出，设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
//最常用的Http请求无非是get和post，get请求可以获取静态页面，也可以把参数放在URL字串后面，传递给servlet，post与get的 不同之处在于post的参数不是放在URL字串里面，而是放在http请求的正文内。
            conn.setDoOutput(true);
            conn.setDoInput(true);
//获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
//发送请求参数即数据
            out.print(data);
//缓冲数据
            out.flush();
//获取URLConnection对象对应的输入流
            InputStream is = conn.getInputStream();
//构造一个字符流缓存
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = "";
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
//关闭流
            is.close();
//断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。直到收发不出信息。写上disconnect后正常一些。
            conn.disconnect();
            System.out.println("完整结束");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 导出shoujiceshi列表
     */
    @PreAuthorize("@ss.hasPermi('system:shoujiceshi:export')")
    @Log(title = "shoujiceshi", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Shoujiceshi shoujiceshi)
    {
        List<Shoujiceshi> list = shoujiceshiService.selectShoujiceshiList(shoujiceshi);
        ExcelUtil<Shoujiceshi> util = new ExcelUtil<Shoujiceshi>(Shoujiceshi.class);
        util.exportExcel(response, list, "shoujiceshi数据");
    }

    /**
     * 获取shoujiceshi详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:shoujiceshi:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(shoujiceshiService.selectShoujiceshiById(id));
    }

    /**
     * 新增shoujiceshi
     */
    @PreAuthorize("@ss.hasPermi('system:shoujiceshi:add')")
    @Log(title = "shoujiceshi", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Shoujiceshi shoujiceshi)
    {
        System.out.println(shoujiceshi);
        return toAjax(shoujiceshiService.insertShoujiceshi(shoujiceshi));
    }

    /**
     * 修改shoujiceshi
     */
    @PreAuthorize("@ss.hasPermi('system:shoujiceshi:edit')")
    @Log(title = "shoujiceshi", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Shoujiceshi shoujiceshi)
    {
        return toAjax(shoujiceshiService.updateShoujiceshi(shoujiceshi));
    }

    /**
     * 删除shoujiceshi
     */
    @PreAuthorize("@ss.hasPermi('system:shoujiceshi:remove')")
    @Log(title = "shoujiceshi", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(shoujiceshiService.deleteShoujiceshiByIds(ids));
    }
}
