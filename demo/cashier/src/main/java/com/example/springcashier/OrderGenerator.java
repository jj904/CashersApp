package com.example.springlogin;

import java.util.Random;

public class OrderGenerator {
    private static final String[] DRINKS = {"Cappuccino", "Latte", "Americano", "Espresso"};
    private static final String[] MILKS = {"Whole", "2% Milk", "Almond Milk", "Oat Milk"};
    private static final String[] SIZES = {"Tall", "Grande", "Venti"};

    private static final Random random = new Random();

    public static Order generateOrder() {
        random.nextInt(DRINKS.length);
        random.nextInt(MILKS.length);
        random.nextInt(SIZES.length);
        random.nextDouble();

        return new Order();
    }
}
