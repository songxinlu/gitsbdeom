package com.example.gitsbdeom.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: LoginController
 * @Description: 登录操作控制类
 * @Author songxl
 * @Date 2021/3/30
 * @Version 1.0
 */
@RestController
@RequestMapping("login")
public class LoginController {
    @PostMapping("/login")
    public String sayhello(){
        return "登录成功";
    }

}
