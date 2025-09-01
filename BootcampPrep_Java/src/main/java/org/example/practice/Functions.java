package org.example.practice;

public class Functions {
    public int simpleSum(int num1, int num2) {
        return num1 + num2;
    }

    public String defaultGreet(String firstName, String lastName) {
        if (lastName == null) lastName = "Doe";

        return "Hi " + firstName + " " + lastName + "!";
    }

    public String greeting(String name) {

        return name != null ? String.format("Hello %s!", name) : "Hello!";
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

    public boolean doYouPlayTheTheremin(String name) {
        if (("s").equalsIgnoreCase(Character.toString(name.charAt(0)))) {
            return true;
        }

        return false;
    }

    public boolean lastCharacter(String word1, String word2) {
        return word1.charAt(word1.length() - 1) == word2.charAt(word2.length() - 1);
    }

    public int maxOfThree(int num1, int num2, int num3) {
        int maxNum = num1;

        if (num2 > maxNum) maxNum = num2;
        if (num3 > maxNum) maxNum = num3;

        return maxNum;
    }

    public String everyWhichWay(int num1, int num2, int result) {
        if (num1 + num2 == result) return "sum";
        if (num1 - num2 == result) return "difference";
        if (num1 * num2 == result) return "product";
        if (num1 / num2 == result) return "fraction";

        return null;
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

//        System.out.println(test1.myMnemonic("Must", "Accept", "Sugar", "Happiness"));
        //expect MASH
//        System.out.println(test1.myMnemonic("We", "Eat", "Eggs"));
        //expect WEE

//        System.out.println(test1.greeting("Layla"));
        //expect "Hello Layla!"
//        System.out.println(test1.greeting(null));
        //expect "Hello!"

//        System.out.println(test1.doYouPlayTheTheremin("Griffin"));
        //false
//        System.out.println(test1.doYouPlayTheTheremin("Scott"));
        //true

//        System.out.println(test1.lastCharacter("apples", "pumpkins"));
        //true
//        System.out.println(test1.lastCharacter("marker", "pen"));
        //false

//        System.out.println(test1.maxOfThree(5, 4, 10));
        //10
//        System.out.println(test1.maxOfThree(7, 7, 4));
        //7

        System.out.println(test1.everyWhichWay(10, 20, 30)); //expect sum
        System.out.println(test1.everyWhichWay(50, 20, 30)); //expect difference
        System.out.println(test1.everyWhichWay(4, 4, 16)); //expect product
        System.out.println(test1.everyWhichWay(100, 10, 10)); //expect fraction
        System.out.println(test1.everyWhichWay(1, 1000, 50)); //expect null
    }
}
