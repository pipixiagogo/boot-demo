package com.dhc.bootdemo.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/10/14 14:58
 * @Description:
 */
@RestController
public class HelloAction {

    @GetMapping("/hello")
    public String helloAction(){
        return "hello world";
    }

}
