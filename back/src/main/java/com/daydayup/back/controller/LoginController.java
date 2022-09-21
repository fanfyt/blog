package com.daydayup.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FL
 * @date
 */
@Controller
@RestController("/")
public class LoginController {
    @RequestMapping("login")
    public String login(){

        return "3";
    }

    @RequestMapping("")
    public String h(){

        return "2333";
    }
}
