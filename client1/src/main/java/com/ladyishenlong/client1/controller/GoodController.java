package com.ladyishenlong.client1.controller;

import com.ladyishenlong.client1.bean.Good;
import com.ladyishenlong.client1.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client1-good")
public class GoodController {

    @Autowired
    GoodRepository goodRepository;

    @GetMapping("/client1-getGoodById")
    public Good getGoodById(@RequestParam("id") int id){
        return goodRepository.getGoodById(id);
    }

}
