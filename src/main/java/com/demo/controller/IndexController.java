package com.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Filter;

/**
 * @auther: wjx
 * @Date: 2021/1/7 18:02
 * @Description:
 */
@RestController("/index")
@Slf4j
public class IndexController {

    @GetMapping("/index")
    public String index(){
        log.info("index.........");
        return "index";
    }

}
