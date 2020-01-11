package com.coding.http;
import com.coding.util.HttpUtil;

import java.util.HashMap;
//https:需要认证，需要把安全证书导入jdk信任文档

public class HttpTest {
    public static void main(String[] args) throws Exception {
        HashMap<String,String> params = new HashMap<String, String>();
        params.put("shouji","13462881272");
        params.put("appkey","45aca922b30b655579470ce36d8e5ba0");
        String s=HttpUtil.sendHttpRequest("http://way.jd.com/jisuapi/query4",params);
        System.out.println(s);
    }
}
