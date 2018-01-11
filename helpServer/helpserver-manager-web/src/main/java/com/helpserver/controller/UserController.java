package com.helpserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by wunaifu on 2018/1/11.
 */
@Controller
public class UserController {
    @RequestMapping("/index")
    public String showIndex() {
        log.println("nihao");
        return "index";
    }
}
