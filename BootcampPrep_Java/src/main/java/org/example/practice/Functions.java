package org.example.practice;

public class Functions {
    public int simpleSum(int num1, int num2) {
        return num1 + num2;
    }

    public String defaultGreet(String firstName, String lastName) {
        if (lastName == null) lastName = "Doe";

        return "Hi " + firstName + " " + lastName + "!";
    }

    public double taxCalculator(int price, String state) {
        return state.equals("NY") ? Math.round(price * 1.04 * 1000.0) / 1000.0 : Math.round(price * 1.06625 * 1000.0) / 1000.0;
    }

    public double taxCalculator2(int price, String state) {
        switch (state) {
            case "NY":
                return Math.round(price * 1.04 * 1000.0) / 1000.0;
            case "NJ":
                return Math.round(price * 1.06625 * 1000.0) / 1000.0;
        }

        return 0.00;
    };

    public String myMnemonic(String...words) {
        StringBuilder sb = new StringBuilder();

        for (String word: words) {
            sb.append(word.charAt(0));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Functions test1 = new Functions();

//        System.out.println(test1.simpleSum(1, 2));
        //expect 3
//        System.out.println(test1.simpleSum(-10, -20));
        //expect -30

//        System.out.println(test1.defaultGreet("Natalie", "Cole"));
        //expect "Hi Natalie Cole!"
//        System.out.println(test1.defaultGreet("Jane", null));
        //expect "Hi Jane Doe!"

//        System.out.println(test1.taxCalculator(100, "NY"));
//        System.out.println(test1.taxCalculator2(100, "NY"));
        //expect 104
//        System.out.println(test1.taxCalculator(100, "NJ"));
//        System.out.println(test1.taxCalculator2(100, "NJ"));
        //expect 106.625

        System.out.println(test1.myMnemonic("Must", "Accept", "Sugar", "Happiness"));
        //expect MASH
        System.out.println(test1.myMnemonic("We", "Eat", "Eggs"));
        //expect WEE
    }
}
