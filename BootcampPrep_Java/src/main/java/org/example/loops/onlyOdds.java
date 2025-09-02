package org.example.loops;

public class onlyOdds {
    public int onlyOdds(int ceiling) {
        int oddSum = 0;

        if (ceiling < 1) return 0;

        for (int i = 1; i <= ceiling; i++) {
            if (isOdd(i)) oddSum += i;
        }

        return oddSum;
    }

    public boolean isOdd(int num) {
        return num % 2 == 1;
    }

    public static void main(String[] args) {
        onlyOdds test = new onlyOdds();
        System.out.println(test.onlyOdds(10));
        //expect 25
        System.out.println(test.onlyOdds(-5));
        //expect 0
    }
}
