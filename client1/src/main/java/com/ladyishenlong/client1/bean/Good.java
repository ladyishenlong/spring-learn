package com.ladyishenlong.client1.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_good")
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//这个策略让主键自增长
    @Column(name = "id")
    public int id;

    @Column(name = "name")
    public String name;

}
