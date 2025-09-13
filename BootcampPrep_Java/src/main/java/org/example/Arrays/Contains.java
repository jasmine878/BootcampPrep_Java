package org.example.Arrays;

import java.util.Arrays;

public class Contains {
    public static boolean myIncludes(int[] numbers, int searchNum) {
        for (int num: numbers) {
            if (num == searchNum) return true;
        }

        return false;
    }

    public static boolean myIncludes2(String[] words, String searchWord) {
        for (String word: words) {
            if (word.equals(searchWord)) return true;
        }

        return false;
    }

    public static boolean myAnyMatch(int[] numbers, int searchNum) {

        return Arrays.stream(numbers).anyMatch(num -> num == searchNum);
    }

    public static boolean myAnyMatch2(String[] words, String searchWord) {

        return Arrays.asList(words).contains(searchWord);
    }

    public static void main(String[] args) {
        System.out.println(myIncludes(new int[] {10, 20, 30}, 20));  //expect true
        System.out.println(myIncludes2(new String[] {"apples", "bananas", "citrus"}, "pears"));  //expect false
        System.out.println(myIncludes2(new String[] {"ruby", "go", "javascript"}, "javascript"));   //expect true
        System.out.println();

        System.out.println(myAnyMatch(new int[] {1, 2, 3}, 3)); //expect true
        System.out.println(myAnyMatch2(new String[] {"fun", "happy things", "kittens"}, "kittens")); //expect true
        System.out.println(myAnyMatch(new int[] {5, 10, 15}, 20));  //expect false

    }
}


// iterate through the array, if we find the search item, return true
// else return false