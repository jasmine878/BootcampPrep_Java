package org.example.Arrays;

import java.util.Arrays;

public class Rotate {
    public static Integer[] rotateArray(Integer[] numbers, int num) {
        int arrayLength = numbers.length;
        Integer[] result = new Integer[arrayLength];

        System.arraycopy(numbers, arrayLength - num, result, 0, num);
        System.arraycopy(numbers, 0, result, num, arrayLength - num);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new Integer[] {1, 2, 3, 4, 5}, 1)));
        //expect [5, 1, 2, 3, 4]
    }
}
