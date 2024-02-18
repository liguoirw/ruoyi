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
import com.ruoyi.system.domain.Ceshi;
import com.ruoyi.system.service.ICeshiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 测试Controller
 * 
 * @author ruoyi
 * @date 2024-01-15
 */
@RestController
@RequestMapping("/system/ceshi")
public class CeshiController extends BaseController
{
    @Autowired
    private ICeshiService ceshiService;

    @Autowired
    private CommonController commonController;

    /**
     * 查询测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ceshi ceshi)
    {
        startPage();
        List<Ceshi> list = ceshiService.selectCeshiList(ceshi);
        return getDataTable(list);
    }




    /**
     * 查询测试列表
     */

    @GetMapping("/jiekoutijiao")
    public static void jiekoutijiao(String path,String data){
        try {
            URL url = new URL(path);
//打开和url之间的连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            PrintWriter out = null;
//请求方式
            conn.setRequestMethod("post");
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
     * 导出测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi:export')")
    @Log(title = "测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Ceshi ceshi)
    {
        List<Ceshi> list = ceshiService.selectCeshiList(ceshi);
        ExcelUtil<Ceshi> util = new ExcelUtil<Ceshi>(Ceshi.class);
        util.exportExcel(response, list, "测试数据");
    }


    /**
     * 导入测试列表
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi:export')")
    @Log(title = "测试", businessType = BusinessType.EXPORT)
    @PostMapping("/exportin")
    public void exportin(HttpServletResponse response, Ceshi ceshi)
    {
        List<Ceshi> list = ceshiService.selectCeshiList(ceshi);
        ExcelUtil<Ceshi> util = new ExcelUtil<Ceshi>(Ceshi.class);
        util.exportExcel(response, list, "测试数据");
    }


    @Log(title = "接口", businessType = BusinessType.EXPORT)
    @PostMapping("/jiekou")
    public void jiekou(HttpServletResponse response, Ceshi ceshi)
    {
        String aa=commonController.encrypt("6215590715002807029 ","12345678123456781234567812345678");
System.out.println(aa);
    }
    /**
     * 获取测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ceshiService.selectCeshiById(id));
    }

    /**
     * 新增测试
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi:add')")
    @Log(title = "测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Ceshi ceshi)
    {
        return toAjax(ceshiService.insertCeshi(ceshi));
    }

    /**
     * 修改测试
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi:edit')")
    @Log(title = "测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Ceshi ceshi)
    {
        return toAjax(ceshiService.updateCeshi(ceshi));
    }

    /**
     * 删除测试
     */
    @PreAuthorize("@ss.hasPermi('system:ceshi:remove')")
    @Log(title = "测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ceshiService.deleteCeshiByIds(ids));
    }
}
