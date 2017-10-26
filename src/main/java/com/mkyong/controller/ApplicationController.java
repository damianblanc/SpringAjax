package com.mkyong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class ApplicationController {

    @GetMapping("/index")
    public String showIndex() {
        return "/web/ajax";
    }

}
