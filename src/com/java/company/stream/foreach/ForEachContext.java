package com.company.stream.foreach;

import com.company.interfaces.Context;

public class ForEachContext implements Context {
    @Override
    public void go() {
        Prices prices = PricesFactory.create();
        assert equals(prices.totalAsStream() == prices.totalAsFor());
    }
}
