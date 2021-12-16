package com.company.stream.foreach;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PricesFactory {

    private static Random random = new Random();

    public static Prices create() {
        return new Prices(randomValues());
    }

    private static List<Price> randomValues() {
        return Stream.generate(PricesFactory::randomValue)
                .limit(10)
                .collect(Collectors.toList());
    }

    private static Price randomValue() {
        return new Price(random.nextInt(100));
    }
}
