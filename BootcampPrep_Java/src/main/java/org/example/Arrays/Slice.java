package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Slice {
    public static Integer[] mySlice(int[] numbers, int startIdx, int endIdx) {
        List<Integer> result = new ArrayList<>();

        for (int i = startIdx; i < endIdx; i++) {
            result.add(numbers[i]);
        }

        return result.toArray(new Integer[0]);
    }

    public static String[] mySlice(String[] words, int startIdx, int endIdx) {
        List<String> result = new ArrayList<>();

        for (int i = startIdx; i < endIdx; i++) {
            result.add(words[i]);
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySlice(new int[] {1, 2, 3}, 1, 2)));     //expect [2]
        System.out.println(Arrays.toString(mySlice(new String[] {"bagel", "baguette", "bialy", "brioche"}, 0, 2))); //expect ["bagel", "baguette"]
    }
}
