package com.company.stream.foreach;

import java.util.List;

public class Prices {
    List<Price> list;

    public Prices(List<Price> list) {
        this.list = list;
    }

    public List<Price> asList() {
        return list;
    }

    public int totalAsStream(){
        return list.stream().
                map(price -> price.value())
                .mapToInt(value -> value)
                .sum();
    }

    public int totalAsFor(){
        int result = 0;
        for (Price price : list) {
            result += price.value();
        }
        return result;
    }
}
