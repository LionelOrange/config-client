package com.cc.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chencheng
 * @date 2019/5/13
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${form}")
    private String form;

    @RequestMapping("/form")
    public String getForm(){
        return this.form;
    }

}