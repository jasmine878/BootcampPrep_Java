package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenAndOdd {
    public Integer[][] evenAndOddArray(int[] numbers) {
        Integer[][] result = new Integer[2][];
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int num: numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }
        result[0] = evens.toArray(new Integer[0]);
        result[1] = odds.toArray(new Integer[0]);

        return result;
    }

    public static void main(String[] args) {
        EvenAndOdd test = new EvenAndOdd();
        System.out.println(Arrays.deepToString(test.evenAndOddArray(new int[] {1, 2, 3, 4, 5, 6})));
    }
}

//create 2 arraylists:  evens, odds
//iterate through the parameter numbers and put the numbers in their respective arraylist
//create a final array with the evens and odds arraylists converted to an array
