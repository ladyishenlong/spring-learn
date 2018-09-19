package com.ladyishenlong.gateway.apiclient;

import com.ladyishenlong.gateway.bean.Good;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@FeignClient(name = "client1")
@RequestMapping("/client1-good")
public interface GoodApiClient {

    @GetMapping("/client1-getGoodById")
    Good getGoodById(@RequestParam("id") int id);
}
