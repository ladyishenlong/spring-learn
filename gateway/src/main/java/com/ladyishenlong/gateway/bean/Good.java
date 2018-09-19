package com.ladyishenlong.gateway.bean;

import lombok.Data;

@Data
public class Good {

    private int id;
    private String name;

    public Good(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
