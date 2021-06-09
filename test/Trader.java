package com.example.test.ceti;

import lombok.Data;

/**
 * @author yd
 * @date 2021/4/1 13:53
 */
@Data
public class Trader {

    private String name;
    private String city;


    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Trader() {
    }
}
