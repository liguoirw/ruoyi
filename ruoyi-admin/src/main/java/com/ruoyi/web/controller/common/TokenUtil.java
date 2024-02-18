package com.ruoyi.web.controller.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TokenUtil {

    private String api="http://121.89.222.153:38660/";     // 你的 api
    private String agentId; // 你的 agentId
    private String AESKey;  // 你的 AESKey

    public TokenUtil(String agentId, String aesKey) {
        this.agentId = agentId;
        this.AESKey = aesKey;
    }

    public String getToken(String tokenType) throws JsonProcessingException {
        String postUrl = api + "/api/acq-channel-gateway/v1/acq-channel-auth-service/tokens/token";

        Map<String, String> data = new HashMap<>();
        data.put("agentId", agentId);
        data.put("tokenType", tokenType);
        data.put("sign", signByMap(data));
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonRes= objectMapper.writeValueAsString(data);
        System.out.println(jsonRes);
        System.out.println(postUrl);
        // 调用 http_post_data 方法发送 POST 请求，获取 token
        String res = sendPostRequest(postUrl, jsonRes);
        return res;
    }
    public String getreqFlowNo(String token,String reqFlowNo ) throws JsonProcessingException {
        String postUrl = api + "/api/acq-channel-gateway/v1/acq-channel-service/agent/expand/account/query/reqFlowNo";
        Map<String, String> data = new HashMap<>();
        data.put("agentId", agentId);
        data.put("token", token);
        data.put("reqFlowNo", reqFlowNo);
        data.put("sign", signByMap(data));
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonRes= objectMapper.writeValueAsString(data);
        System.out.println(jsonRes);
        System.out.println(postUrl);
        // 调用 http_post_data 方法发送 POST 请求，获取 token
        String res = sendPostRequest(postUrl, jsonRes);
        return res;
    }

    public String getaccountUuid(String token,String accountUuid ) throws JsonProcessingException {
        String postUrl = api + "/api/acq-channel-gateway/v1/acq-channel-service/agent/expand/account/query/accountUuid";
        Map<String, String> data = new HashMap<>();
        data.put("agentId", agentId);
        data.put("token", token);
        data.put("accountUuid", accountUuid);
        data.put("sign", signByMap(data));
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonRes= objectMapper.writeValueAsString(data);
        System.out.println(jsonRes);
        System.out.println(postUrl);
        // 调用 http_post_data 方法发送 POST 请求，获取 token
        String res = sendPostRequest(postUrl, jsonRes);
        return res;
    }

    public String getfwfds(String token,String merchId,String directAgentId,String sn, String posCharge, String vipCharge,String simCharge,String smsSend,String smsCode,String traceNo) throws JsonProcessingException {
        String postUrl = api + "/api/acq-channel-gateway/v1/terminal-service/terms/activityReformV3/amountFrozen";
        Map<String, String> data = new HashMap<>();
        data.put("agentId", agentId);
        data.put("token", token);
        data.put("merchId", merchId);//商户编号
        data.put("directAgentId", directAgentId); //直属代理商id
        data.put("sn", sn);
        data.put("posCharge", posCharge);
        data.put("vipCharge", vipCharge);
        data.put("simCharge", simCharge);
        data.put("smsSend", "1");
        data.put("smsCode", smsCode);
        data.put("traceNo", traceNo);
        data.put("sign", signByMap(data));
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonRes= objectMapper.writeValueAsString(data);
        System.out.println(jsonRes);
        System.out.println(postUrl);
        // 调用 http_post_data 方法发送 POST 请求，获取 token
        String res = sendPostRequest(postUrl, jsonRes);
        return res;
    }


    public String getfwfdscx(String token,String traceNo) throws JsonProcessingException {
        String postUrl = api + "/api/acq-channel-gateway/v1/terminal-service/terms/activityReformV3/queryAmtInfo";
        Map<String, String> data = new HashMap<>();
        data.put("agentId", agentId);
        data.put("token", token);
        data.put("traceNo", traceNo);
        data.put("sign", signByMap(data));
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonRes= objectMapper.writeValueAsString(data);
        System.out.println(jsonRes);
        System.out.println(postUrl);
        // 调用 http_post_data 方法发送 POST 请求，获取 token
        String res = sendPostRequest(postUrl, jsonRes);
        return res;
    }

    private String signByMap(Map<String, String> data) {
        StringBuilder sign = new StringBuilder();

        if (data != null && !data.isEmpty()) {
            // 使用 TreeMap 对 map 按键进行排序
            Map<String, String> sortedData = new TreeMap<>(data);

            for (String value : sortedData.values()) {
                if (value != null) {
                    sign.append(value);
                }
            }
        }

        if (sign.length() > 0) {
            sign = new StringBuilder(md5(AESKey + sign.toString()));
        }

        return sign.toString();
    }

    // 你的 http_post_data 方法实现
    public static String sendPostRequest(String url, String jsonRequest) {
        // 创建RestTemplate对象
        RestTemplate restTemplate = new RestTemplate();

        // 设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // 构造HttpEntity对象，包含请求头和请求体
        HttpEntity<String> requestEntity = new HttpEntity<>(jsonRequest, headers);

        // 发起POST请求
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        // 获取响应体
        String responseBody = responseEntity.getBody();

        // 返回响应体
        return responseBody;
    }

    // 你的 md5 方法实现
    private String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes(StandardCharsets.UTF_8));

            // 将字节数组转换为十六进制字符串
            StringBuilder result = new StringBuilder();
            for (byte b : hashBytes) {
                result.append(String.format("%02x", b));
            }

            return result.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
//    public static void main(String[] args) throws JsonProcessingException {
//        // 使用示例
//
//    }
}
