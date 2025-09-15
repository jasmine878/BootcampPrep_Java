package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {
    public Integer[] arrayFlattener(int[][] manyArrays) {
        List<Integer> result = new ArrayList<>();

        for (int[] array: manyArrays) {
            for (int number: array) {
                result.add(number);
            }
        }

        return result.toArray(new Integer[0]);
    }

    public String[] arrayFlattener(String[][] manyArrays) {
        List<String> result = new ArrayList<>();

        for (String[] array: manyArrays) {
            for (String word: array) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        FlattenArray test = new FlattenArray();
        System.out.println(Arrays.toString(test.arrayFlattener(new int[][] {{1}, {2, 3}, {4}})));
        System.out.println(Arrays.toString(test.arrayFlattener(new String[][] {{"I"}, {"am"}, {"working"}, {"on", "another", "level"}})));
    }
}

//Create a new 1-dimensional array
// iterate through the parameter array and push values to the 1-dimensional array
//return the final array