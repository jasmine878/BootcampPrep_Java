package org.example.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public int[] myReverse(int[] numArray) {
        int[] reverseArray = new int[numArray.length];
        int startIdx = 0;

        for (int i = numArray.length - 1; i >= 0; i--) {
            int number = numArray[i];
            reverseArray[startIdx] = number;
            startIdx++;
        }

        return reverseArray;
    }

    public String[] myReverse(String[] wordArray) {
        String[] reverseArray = new String[wordArray.length];
        int startIdx = 0;

        for (int i = wordArray.length - 1; i >= 0; i--) {
            String word = wordArray[i];
            reverseArray[startIdx] = word;
            startIdx++;
        }

        return reverseArray;
    }

    public Integer[] reverseArray(Integer[] numArray) {
        Collections.reverse(Arrays.asList(numArray));

        return numArray;
    }

    public String[] reverseArray(String[] wordArray) {
        Collections.reverse(Arrays.asList(wordArray));

        return wordArray;
    }

    public static void main(String[] args) {
        Reverse test = new Reverse();
        System.out.println(Arrays.toString(test.myReverse(new int[] {1, 2, 3})));    //expect [3, 2, 1]
        System.out.println(Arrays.toString(test.myReverse(new String[] {"first", "second", "third"}))); //expect ["third", "second", "first"]
        System.out.println();

        System.out.println(Arrays.toString(test.reverseArray(new Integer[] {4, 5, 6})));
        System.out.println(Arrays.toString(test.myReverse(new String[] {"Apple", "Berry", "Corn"})));
    }
}

//iterate through the array in reverse and create a new array and returrn it