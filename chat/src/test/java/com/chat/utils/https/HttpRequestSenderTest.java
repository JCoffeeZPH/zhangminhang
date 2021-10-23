package com.chat.utils.https;

import net.sf.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * com.chat.utils.https
 *
 * @author penghui.zhang
 * @date 2021/3/21 11:17
 */
class HttpRequestSenderTest {

    @Test
    void sendPost() {
//        String url = "http://localhost:9999/faqengine/predict";
//        Map<String,String> params = new HashMap<>();
//        params.put("robot_id","robot_test");
//        params.put("question","我的网贷逾期了，要提供身份证信息，如何上传给你们呢？");
//        JSONObject jsonParam = JSONObject.fromObject(params);
//        System.out.println(jsonParam.toString());
//        try {
//            String ans = HttpRequestSender.sendPost(url,jsonParam.toString());
//            System.out.println(ans.substring(12,ans.length() - 3));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @Test
    void sendGetReuqest() {
    }
}