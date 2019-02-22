package com.zcsj.wx.controller;

import com.zcsj.wx.constant.CommonConstants;
import com.zcsj.wx.constant.WxConstant;
import com.zcsj.wx.vo.BaseResultVO;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/*/app/wxJdk")
public class WxController {

    /*
     * @Description 企业微信JS-SDK
     * @author chenling
     * @date 2018/9/20 15:47
     * @param [url]
     * @return com.ducetech.core.vo.BaseResultVO<com.alibaba.fastjson.JSONObject>
     */
    @RequestMapping("/getJsSdkSign")
    public BaseResultVO<JSONObject> getJsSdkSign(@RequestParam("url") String url) throws Exception {
        //  url ="http://mp.weixin.qq.com?params=value";
        // String urlRe = url.replace("8846", "8848");
        String timestamp = Long.toString((new Date().getTime()) / 1000);
        String noncestr =create_noncestr();
        String jsapi_ticket =getJsapiTicket();
        String appId = WxConstant.AppID;
        String signature = getJsSdkSign(noncestr,jsapi_ticket, timestamp, url);
        JSONObject jo= new JSONObject();
        jo.put("appId",appId);
        jo.put("noncestr",noncestr);
        jo.put("timestamp",timestamp);
        jo.put("signature",signature);
        // jo.put("jsapi_ticket",jsapi_ticket);
        BaseResultVO<JSONObject> vo = new BaseResultVO<>();
        if(signature!=null){
            vo.setResultData(jo);
            vo.setErrorCode(CommonConstants.SUCCESS);
            vo.setMessage("查询成功");
        }else{
            vo.setResultData(jo);
            vo.setErrorCode(CommonConstants.SUCCESS);
            vo.setMessage("查询成功");
        }
        return vo;
    }

    /**
     * 获得加密后的签名
     * @param noncestr
     * @param tsapiTicket
     * @param timestamp
     * @param url
     * @return
     */
    public static String getJsSdkSign(String noncestr,String tsapiTicket,String timestamp,String url){
        String content="jsapi_ticket="+tsapiTicket+"&noncestr="+noncestr+"&timestamp="+timestamp+"&url="+url;
        String ciphertext=getSha1(content);
        return ciphertext;
    }

    /**
     * 进行sha1加密
     * @param str
     * @return
     */
    public static String getSha1(String str){
        if(str==null||str.length()==0){
            return null;
        }
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9',
                'a','b','c','d','e','f'};
        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j*2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获得随机串
     * @return
     */
    public static String create_noncestr() {
        return UUID.randomUUID().toString();
    }

    /**
     * 获得access_token
     * @return
     * @throws Exception
     */
    public static String  getAccessToken() throws Exception {
        String urlStr = WxConstant.GET_ACCESS_TOKEN_URL;
        URL url = new URL(urlStr);
        URLConnection URLconnection = url.openConnection();
        HttpURLConnection httpConnection = (HttpURLConnection) URLconnection;
        int responseCode = httpConnection.getResponseCode();
        String access_token ="";
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream urlStream = httpConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlStream));
            String sCurrentLine = "";
            String sTotalString = "";
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                sTotalString += sCurrentLine;
            }
            JSONObject obj = JSON.parseObject(sTotalString);
            access_token = (String) obj.get("access_token");
        }
        return access_token;
    }

    /**
     * 获得jsapi_ticket
     * @return
     * @throws Exception
     */
    public  static String  getJsapiTicket() throws Exception {
        String access_token = getAccessToken();
        String urlStr = "https://qyapi.weixin.qq.com/cgi-bin/get_jsapi_ticket?access_token="+access_token;
        URL url = new URL(urlStr);
        URLConnection URLconnection = url.openConnection();
        HttpURLConnection httpConnection = (HttpURLConnection) URLconnection;
        int responseCode = httpConnection.getResponseCode();
        String ticket ="";
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream urlStream = httpConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlStream));
            String sCurrentLine = "";
            String sTotalString = "";
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                sTotalString += sCurrentLine;
            }
            JSONObject obj = JSON.parseObject(sTotalString);
            ticket = (String) obj.get("ticket");
        }
        return ticket;
    }

}

