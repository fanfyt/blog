package com.daydayup.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author FL
 * @date
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @RequestMapping("login")
    public String login(){

        return "3";
    }
}
