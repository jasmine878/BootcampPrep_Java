package org.example.loops;

public class baseByPower {
    public static int exponentiate(int base, int power) {
        int exponentiatedValue = 1;

        for (int i = 1; i <= power; i++) {
            exponentiatedValue *= base;
        }

        return exponentiatedValue;
    }

    public static void main(String[] args) {
        System.out.println(exponentiate(3, 6));
        System.out.println(Math.pow(3, 6));
        //expect 729
        System.out.println(exponentiate(20, 0));
        //expect 1
    }
}

//Loop from 0 to power
//when power equals 0 return 1
//when power equals 1 return the base
//multiply base by itself each time
//return the result
