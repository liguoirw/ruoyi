package com.ruoyi.web.controller.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.*;
import com.ruoyi.system.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.utils.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpServletRequest;

/**
 * swagger 用户测试方法
 * 
 * @author ruoyi
 */
@Api("用户信息管理")
@RestController
@RequestMapping("/test/user")
public class TestController extends BaseController
{

    @Autowired
    private IJytzzService jytzzService;
    @Autowired
    private IJytzzbService jytzzbService;
    @Autowired
    private IJytzfcService jytzfcService;
    @Autowired
    private IBdtzService bdtzService;
    private Jytzz jytzz;
    @Autowired
    private IHdzdbjService hdzdbjService;
    @Autowired
    private IYkyMerchantService ykyMerchantService;
    private final static Map<Integer, UserEntity> users = new LinkedHashMap<Integer, UserEntity>();
    {
        users.put(1, new UserEntity(1, "admin", "admin123", "15888888888"));
        users.put(2, new UserEntity(2, "ry", "admin123", "15666666666"));
    }

    @ApiOperation("获取用户列表")
    @GetMapping("/list")
    public R<List<UserEntity>> userList()
    {
        List<UserEntity> userList = new ArrayList<UserEntity>(users.values());
        return R.ok(userList);
    }

    @ApiOperation("获取用户列表测试")
    @PostMapping("/listceshi")
    public String listceshi(String ss,String aa)
    {
        String cc=aa+"sssssssssssssss"+ss;
       System.out.println(aa+"sssssssssssssss"+ss);
return cc;
    }


    @ApiOperation("交易通知请求")
    @RequestMapping("/jytz")
    public String jytz(HttpServletRequest request) {


        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        try{
            reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));
            String line = null;
            while ((line = reader.readLine()) != null){
                sb.append(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                if (null != reader){ reader.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("json;"+sb.toString());
        String map=sb.toString();

        JSONObject jObj =  JSONObject.parseObject(map);
        jytzz = new Jytzz();

        jytzz.setConfigAgentId(jObj.getString("configAgentId"));
        jytzz.setSign(jObj.getString("sign"));
        jytzz.setSendBatchNo(jObj.getString("sendBatchNo"));
        jytzz.setSendNum(jObj.getString("sendNum"));
        jytzz.setSendTime(jObj.getString("sendTime"));
        jytzz.setTransDate(jObj.getString("transDate"));
        jytzzService.insertJytzz(jytzz);

        if(jObj.getString("dataType")==null||jObj.getString("dataType").equals("")
                ||jObj.getString("dataType").equals("null")
                ||jObj.getString("dataType").equals("undefined")) {
            jObj.put("dataType","1");
        }
        if(jObj.getString("dataType").equals("0")) {

            JSONArray jary1 = jObj.getJSONArray("dataList");

            for (int i = 0; i < jary1.size(); i++) {
                JSONObject obj1 = jary1.getJSONObject(i);

                Bdtz bdtz=new Bdtz();
                bdtz.setAgentId(obj1.get("agentId").toString());
                bdtz.setMerchantId(obj1.get("merchantId").toString());
                bdtz.setTermId(obj1.get("termId").toString());
                bdtz.setTermModel(obj1.get("termModel").toString());
                bdtz.setTermSn(obj1.get("termSn").toString());
                bdtz.setMerchantId(obj1.get("merchantId").toString());
                bdtz.setVersion(obj1.get("version").toString());
                bdtzService.insertBdtz(bdtz);

            }
        }
        else {

            List<Jytzz> jytzzlist = new ArrayList<>();
            jytzzlist = jytzzService.selectJytzzListzx(jytzz);

            JSONArray jary = jObj.getJSONArray("dataList");

            for (int i = 0; i < jary.size(); i++) {
                JSONObject obj = jary.getJSONObject(i);
                Jytzzb jytzzb = new Jytzzb();

                jytzzb.setAmount(obj.getString("amount"));
                jytzzb.setCardNo(obj.getString("cardNo"));
                jytzzb.setCardType(obj.getString("cardType"));
                jytzzb.setBankName(obj.getString("bankName"));
                jytzzb.setFid(jytzzlist.get(0).getId());
                jytzzb.setAgentId(jObj.getString("agentId"));

                jytzzb.setSysRespDesc(obj.getString("sysRespDesc"));
                jytzzb.setSysRespCode(obj.getString("sysRespCode"));
                jytzzb.setAgentId(obj.getString("agentId"));
                jytzzb.setAuthCode(obj.getString("authCode"));
                jytzzb.setChannelRrn(obj.getString("channelRrn"));
                jytzzb.setTermId(obj.getString("termId"));
                jytzzb.setTranTime(obj.getString("tranTime"));
                jytzzb.setSysTraceNo(obj.getString("sysTraceNo"));
                jytzzb.setTraceNo(obj.getString("traceNo"));
                jytzzb.setTermSn(obj.getString("termSn"));
                jytzzb.setMobileNo(obj.getString("mobileNo"));
                jytzzb.setBatchNo(obj.getString("batchNo"));
                jytzzb.setSettleAmount(obj.getString("settleAmount"));
                jytzzb.setSettleDate(obj.getString("settleDate"));
                jytzzb.setFeeType(obj.getString("feeType"));
                jytzzb.setTermModel(obj.getString("termModel"));
                jytzzb.setMerchantName(obj.getString("merchantName"));
                jytzzb.setMerchLevel(obj.getString("merchLevel"));
                jytzzb.setRrn(obj.getString("rrn"));
                jytzzb.setTermSn(obj.getString("termSn"));
                jytzzb.setMerchantId(obj.getString("merchantId"));
                jytzzb.setInputMode(obj.getString("inputMode"));
                jytzzb.setTranCode(obj.getString("tranCode"));


                Double ss=Double.parseDouble(obj.getString("amount"))- Double.parseDouble(obj.getString("settleAmount"));
                Double bb =ss/Double.parseDouble(obj.getString("amount"));

                jytzzb.setExtend(bb.toString());
                jytzzbService.insertJytzzb(jytzzb);

                if(jytzzb.getSysRespDesc().indexOf("交易成功")==1){
                    Hdzdbj hdzdbj=new Hdzdbj();
                    hdzdbj.setZhongduansn(jytzzb.getTermSn().toString());

                 List<Hdzdbj> hdzdbjlist=  hdzdbjService.selectHdzdbjList(hdzdbj);

                    hdzdbjlist.get(0).setShmc(jytzzb.getMerchantName());
                    hdzdbjlist.get(0).setShbm(jytzzb.getMerchantId());
                    hdzdbjlist.get(0).setLjjy(Double.parseDouble(jytzzb.getAmount()));
                    hdzdbjlist.get(0).setZdzt("已激活");

                    hdzdbjService.updateHdzdbj(hdzdbjlist.get(0));

                    YkyMerchant ykyMerchant=new YkyMerchant();
                    ykyMerchant.setMachineBrand(hdzdbjlist.get(0).getPinpai());
                    ykyMerchant.setMachineSN(hdzdbjlist.get(0).getZhongduansn());
                    ykyMerchant.setUnderAgentNo(hdzdbjlist.get(0).getZsdls());
                    //代理人电话
                    ykyMerchant.setAgentTel("");
                    ykyMerchant.setMerchantName(hdzdbjlist.get(0).getShmc());
                    //法人名称
                    ykyMerchant.setLegalName("");
                    ykyMerchant.setMerchantNo(hdzdbjlist.get(0).getShbm());
                    //商户电话
                    ykyMerchant.setTelePhone(jytzzb.getMobileNo());
                    ykyMerchant.setAccumTrans(hdzdbjlist.get(0).getLjjy().toString());
                    ykyMerchant.setFirLevAgentNo(hdzdbjlist.get(0).getYdbm());
                    //信用卡手续费费率(%)
                    ykyMerchant.setCreCardProcFee("");
                    //借记卡手续费费率(%)
                    ykyMerchant.setDebCardProcFee("");
                    //借记卡手续费最大值(元)
                    ykyMerchant.setDebCardProcMax("");
                    //微信手续费费率(%)
                    ykyMerchant.setWxProcFee("");
                    //支付宝手续费费率(%)
                    ykyMerchant.setAliPayProcFee("");
                    //云闪付信用卡手续费费率(%)
                    ykyMerchant.setYunCreCardFee("");
                    //云闪付借记卡手续费费率(%)
                    ykyMerchant.setYunDebCardFee("");
                    //单笔
                    ykyMerchant.setSingleStroke("0.00");
                    ykyMerchant.setPosCharge("");
                    ykyMerchant.setVipCharge("");
                    ykyMerchant.setSimCharge("");
                    //首笔交易时间
                    ykyMerchant.setFirstTransTime(hdzdbjlist.get(0).getSbjysj());
                    //创建时间
                    Date date = new Date();
                    ykyMerchant.setCreatTime(date);
                    ykyMerchantService.insertYkyMerchant(ykyMerchant);
                }


            }
        }

            Jytzfc jytzfc = new Jytzfc();
            jytzfc.setConfigAgentId(jObj.getString("configAgentId"));
            jytzfc.setSign(jObj.getString("sign"));
            jytzfc.setTransDate(jObj.getString("transDate"));
            jytzfc.setSendBatchNo(jObj.getString("sendBatchNo"));
            jytzfc.setResponseCode("00");
            jytzfc.setResponseDesc("交易成功");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String today = sdf.format(new Date());
            jytzfc.setRevTime(today);
            jytzfcService.insertJytzfc(jytzfc);


            Map map1 = new HashMap();

            map1.put("configAgentId", jytzfc.getConfigAgentId());
            map1.put("sign", jytzfc.getSign());
            map1.put("transDate", jytzfc.getTransDate());
            map1.put("sendBatchNo", jytzfc.getSendBatchNo());
            map1.put("responseCode", "00");
            map1.put("responseDesc", "交易成功");
            map1.put("revTime", today);
            ObjectMapper objectMapper = new ObjectMapper();
            String json = null;
            try {
                json = objectMapper.writeValueAsString(map1);
                System.out.println(json);
            } catch (Exception e) {
                e.printStackTrace();
            }

        return json;
    }


    @ApiOperation("获取用户详细")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "int", paramType = "path", dataTypeClass = Integer.class)
    @GetMapping("/{userId}")
    public R<UserEntity> getUser(@PathVariable Integer userId)
    {
        if (!users.isEmpty() && users.containsKey(userId))
        {
            return R.ok(users.get(userId));
        }
        else
        {
            return R.fail("用户不存在");
        }
    }

    @ApiOperation("新增用户")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "userId", value = "用户id", dataType = "Integer", dataTypeClass = Integer.class),
        @ApiImplicitParam(name = "username", value = "用户名称", dataType = "String", dataTypeClass = String.class),
        @ApiImplicitParam(name = "password", value = "用户密码", dataType = "String", dataTypeClass = String.class),
        @ApiImplicitParam(name = "mobile", value = "用户手机", dataType = "String", dataTypeClass = String.class)
    })
    @PostMapping("/save")
    public R<String> save(UserEntity user)
    {
        if (StringUtils.isNull(user) || StringUtils.isNull(user.getUserId()))
        {
            return R.fail("用户ID不能为空");
        }
        users.put(user.getUserId(), user);
        return R.ok();
    }

    @ApiOperation("更新用户")
    @PutMapping("/update")
    public R<String> update(@RequestBody UserEntity user)
    {
        if (StringUtils.isNull(user) || StringUtils.isNull(user.getUserId()))
        {
            return R.fail("用户ID不能为空");
        }
        if (users.isEmpty() || !users.containsKey(user.getUserId()))
        {
            return R.fail("用户不存在");
        }
        users.remove(user.getUserId());
        users.put(user.getUserId(), user);
        return R.ok();
    }

    @ApiOperation("删除用户信息")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "int", paramType = "path", dataTypeClass = Integer.class)
    @DeleteMapping("/{userId}")
    public R<String> delete(@PathVariable Integer userId)
    {
        if (!users.isEmpty() && users.containsKey(userId))
        {
            users.remove(userId);
            return R.ok();
        }
        else
        {
            return R.fail("用户不存在");
        }
    }
}

@ApiModel(value = "UserEntity", description = "用户实体")
class UserEntity
{
    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("用户名称")
    private String username;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("用户手机")
    private String mobile;

    public UserEntity()
    {

    }

    public UserEntity(Integer userId, String username, String password, String mobile)
    {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
}
