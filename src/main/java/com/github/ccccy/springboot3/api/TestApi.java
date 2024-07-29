package com.github.ccccy.springboot3.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu.cao
 * @since 2024/7/29 10:07
 */
@RestController
@RequestMapping("/test")
public class TestApi {

    @RequestMapping("/a")
    public String success(){
        return "success";
    }
}
