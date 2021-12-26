package company.stream.foreach.price1;

import company.interfaces.Context;

public class ForEachContext implements Context {
    @Override
    public void go() {
        Prices prices = PricesFactory.create();
        System.out.println(prices.totalAsStream() == prices.totalAsFor());
        assert equals(prices.totalAsStream() == prices.totalAsFor());
    }
}
