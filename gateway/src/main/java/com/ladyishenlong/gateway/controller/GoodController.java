package com.ladyishenlong.gateway.controller;

import com.ladyishenlong.gateway.apiclient.GoodApiClient;
import com.ladyishenlong.gateway.bean.Good;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/good")
@Api("数据库获取商品信息")
public class GoodController {

    @Autowired
    public GoodApiClient goodApiClient;

    @GetMapping("/getGoodById")
    public Good getGoodById(@RequestParam("id") int id){
        return goodApiClient.getGoodById(id);
    }

}
