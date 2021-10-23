package com.chat.controller;

import com.chat.utils.https.HttpRequestSender;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangpenghui
 * @Date 2021/2/26 11:01
 * @Version 1.0
 */
@Controller
public class ChatController {

    private final String url = "http://localhost:9999/faqengine/predict";

    @RequestMapping("/deal")
    @ResponseBody
    public String dealQuestion(String question){
        if (StringUtils.isEmpty(question)){
            return "empty";
        }
        Map<String,String> params = new HashMap<>();
        params.put("robot_id","robot_test");
        params.put("question",question);
        JSONObject jsonParam = JSONObject.fromObject(params);
        String ans = null;
        try {
            ans = HttpRequestSender.sendPost(url,jsonParam.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ans != null ? ans.substring(12,ans.length() - 3) : "请联系客服";
    }
}
