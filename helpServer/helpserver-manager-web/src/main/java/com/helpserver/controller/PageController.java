package com.helpserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wunaifu on 2018/1/13.
 */
@Controller
public class PageController {

    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/")
    public String showIndex1() {
        return "index";
    }

    @RequestMapping("/datatable")
    public String datatable() {
        return "datatable";
    }

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/theming")
    public String theming() {
        return "theming";
    }

    @RequestMapping("/info")
    public String info() {
        return "info";
    }
}
