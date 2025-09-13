package org.example.Arrays;

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

    public static void main(String[] args) {
        System.out.println(myIncludes(new int[] {10, 20, 30}, 20));  //expect true
        System.out.println(myIncludes2(new String[] {"apples", "bananas", "citrus"}, "pears"));  //expect false
        System.out.println(myIncludes2(new String[] {"ruby", "go", "javascript"}, "javascript"));   //expect true
    }
}


//iterate through the array, if we find the search item, return true
//else return false