package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbers {
    public Integer[] oddCouple(int[] numbers) {
        List<Integer> result = new ArrayList<>();

        for (int num: numbers) {
            if (result.size() < 2) {
                if (num % 2 == 1) result.add(num);
            } else {
                break;
            }
        }

        return result.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        OddNumbers test = new OddNumbers();
        System.out.println(Arrays.toString(test.oddCouple(new int[] {1, 2, 3, 4, 5}))); //expect [1, 3]
        System.out.println(Arrays.toString(test.oddCouple(new int[] {3, 6, 9, 12, 15})));
        System.out.println(Arrays.toString(test.oddCouple(new int[] {10, 15, 20})));
        System.out.println(Arrays.toString(test.oddCouple(new int[] {2, 4, 6, 8})));
    }
}


