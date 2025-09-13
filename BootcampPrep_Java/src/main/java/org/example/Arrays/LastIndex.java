package org.example.Arrays;

import java.util.Arrays;

public class LastIndex {
    public static int myLastIndexOf(int[]numbers, int searchItem, int startIdx) {
        int foundIdx = -1;

        for (int i = startIdx; i < numbers.length; i++) {
            int number = numbers[i];

            if (number == searchItem) foundIdx = i;
        }

        return foundIdx;
    }

    public static int myLastIndexOf(String[] words, String searchItem, int startIdx) {
        int foundIdx = -1;

        for (int i = startIdx; i < words.length; i++) {
            String word = words[i];

            if (word.equals(searchItem)) foundIdx = i;
        }

        return foundIdx;
    }

    public static int lastIndexOf(Integer[] numbers, int searchItem, int startIdx) {
        return Arrays.asList(numbers).lastIndexOf(searchItem);
    }

    public static int lastIndexOf(String[] words, String searchItem, int startIdx) {
        return Arrays.asList(words).lastIndexOf(searchItem);
    }

    public static void main(String[] args) {
        System.out.println(myLastIndexOf(new int[] {0, 10, 20, 10, 0}, 10, 0)); //expect 3
        System.out.println(myLastIndexOf(new String[] {"peanut", "cashew", "walnut"}, "lemon", 0));  //expect -1
        System.out.println(myLastIndexOf(new String[] {"gee", "gee", "gee", "gee", "baby", "baby"}, "gee", 0));  //expect 3
        System.out.println();

        System.out.println(lastIndexOf(new Integer[] {0, 10, 20, 10, 0}, 10, 0));  //expect 3
        System.out.println(lastIndexOf(new String[] {"Tiffany", "Sunny", "Yoona"}, "Jessica", 0));  //expect -1
        System.out.println(lastIndexOf(new String[] {"the", "girls", "bring", "the", "boys", "out"}, "the", 0));  //expect 3
    }
}

//start searching from the start index and move towards the front of the array
//return the last index of an array where the search item occurs
//return -1 if the search item does not appear in the array

//iterate through the array from startIdx
//update the foundIdx as we find the searchItem
//return the most up-to-date foundIdx
