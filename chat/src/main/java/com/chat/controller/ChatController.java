package com.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

/**
 * @Author zhangpenghui
 * @Date 2021/2/26 11:01
 * @Version 1.0
 */
@Controller
public class ChatController {


    @RequestMapping("/deal")
    @ResponseBody
    public String dealQuestion(String question){
        if (StringUtils.isEmpty(question)){
            return "empty";
        }
        return "success";
    }
}
