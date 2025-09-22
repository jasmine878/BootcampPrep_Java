package org.example.Arrays;

public class KatyPerry {
    public int lastFridayNight(Transaction[] transactions) {
        int total = 0;

        for (Transaction item: transactions) {
            total += item.amount;
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
    }
}