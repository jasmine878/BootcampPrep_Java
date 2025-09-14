package org.example.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UnShift {
    public static int[] myUnshift(int[] numbers, int num) {
        int[] result = new int[numbers.length + 1];
        result[0] = num;

        for (int i = 1; i <= numbers.length; i++) {
            result[i] = numbers[i - 1];
        }

        return result;
    }

    public static String[] myUnshift(String[] words, String word) {
        String[] result = new String[words.length + 1];
        result[0] = word;

        for (int i = 1; i <= words.length; i++) {
            result[i] = words[i - 1];
        }

        return result;
    }

    public static Integer[] addAll(Integer[] numbers, int number) {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(List.of(numbers));
        result.addFirst(number);

        return result.toArray(new Integer[0]);
    }

    public static String[] addAll(String[] words, String word) {
        LinkedList<String> result = new LinkedList<>();
        result.addAll(List.of(words));
        result.addFirst(word);

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(myUnshift(new int[] {1, 2, 3}, 0)));  //expect [0, 1, 2, 3]
        System.out.println(Arrays.toString(myUnshift(new String[] {"bears", "cows", "ducks"}, "antelopes")));   //expect ["antelopes", "bears", "cows", "ducks"]
        System.out.println();

        System.out.println(Arrays.toString(addAll(new Integer[] {5, 10, 15}, 2)));  //expect [2, 5, 10, 15]
        System.out.println(Arrays.toString(addAll(new String[] {"Berry", "Corn", "Dates"}, "Apples")));  //expect ["Apples", "Berry", "Corn", "Dates"]
    }
}

//create a new array
//add the parameter we want to insert at the beginning of the array
//add the rest of the parameter array and return the new array