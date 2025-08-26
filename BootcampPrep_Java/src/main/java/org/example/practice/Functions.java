package org.example.practice;

public class Functions {
    public int simpleSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Functions test1 = new Functions();

        System.out.println(test1.simpleSum(1, 2));
        //expect 3
        System.out.println(test1.simpleSum(-10, -20));
        //expect -30
    }
}
