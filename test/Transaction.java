package com.example.test.ceti;

import lombok.Data;

/**
 * @author yd
 * @date 2021/4/1 13:53
 */
@Data
public class Transaction {

    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Transaction() {
    }
}
