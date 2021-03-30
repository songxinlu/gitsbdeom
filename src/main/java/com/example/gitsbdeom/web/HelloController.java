package com.example.gitsbdeom.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: 欢迎页面控制类
 * @Author songxl
 * @Date 2021/3/30
 * @Version 1.0
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("/say")
    public String sayhello(){
        return "helloword";
    }

}
