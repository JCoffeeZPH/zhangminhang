package com.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zhangpenghui
 * @Date 2021/3/5 10:19
 * @Version 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String chatIndexPage(){
        return "index";
    }

    @RequestMapping("/homepage")
    public String goHomepage(){
        return "homepage";
    }
}
