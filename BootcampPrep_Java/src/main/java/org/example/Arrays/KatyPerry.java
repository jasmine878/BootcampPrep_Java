package org.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class KatyPerry {
    public int lastFridayNight(Transaction[] transactions) {
        int total = 0;

        for (Transaction item: transactions) {
            total += item.amount;
        }

        return total;
    }

    public int lastFridayNight(Map<String, Integer> transactionsMap) {
        int total = 0;

        for (int cost: transactionsMap.values()) {
            total += cost;
        }

        return total;
    }

    public static void main(String[] args) {
        KatyPerry test = new KatyPerry();

        Transaction[] transactions = new Transaction[] {
                new Transaction("Tons of glitter", 70),
                new Transaction("Porcelain Pink Flamingos", 92),
                new Transaction("Chandelier replacement", 10000),
                new Transaction("Dinner at TGIF x6", 350)
        };

        System.out.println(test.lastFridayNight(transactions));         // expect 10512

        Map<String, Integer> transactions2 = new HashMap<>();
        transactions2.put("apples", 5);
        transactions2.put("kleenex", 2);
        transactions2.put("knitting supplies", 10);

        System.out.println(test.lastFridayNight(transactions2));        //expect 17
    }
}