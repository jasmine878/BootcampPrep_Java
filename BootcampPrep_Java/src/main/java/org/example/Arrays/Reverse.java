package org.example.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

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

    public Integer[] reversedStack(int[] numArray) {
        Stack<Integer> stack = new Stack();

        for (int i = numArray.length - 1; i >=0; i--) {
            int element = numArray[i];
            stack.push(element);
        }

        return stack.toArray(new Integer[0]);
    }

    public Integer[] reversedLinkedList(int[] numArray) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer num: numArray) {
            linkedList.addFirst(num);
        }

        return linkedList.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Reverse test = new Reverse();
        System.out.println(Arrays.toString(test.myReverse(new int[] {1, 2, 3})));    //expect [3, 2, 1]
        System.out.println(Arrays.toString(test.myReverse(new String[] {"first", "second", "third"}))); //expect ["third", "second", "first"]
        System.out.println();

        System.out.println(Arrays.toString(test.reverseArray(new Integer[] {4, 5, 6})));    //expect [6, 5, 4]
        System.out.println(Arrays.toString(test.reverseArray(new String[] {"Apple", "Berry", "Corn"})));  //expect ["Corn", "Berry", "Apple"]
        System.out.println();

        System.out.println(Arrays.asList(test.reversedStack(new int[] {5, 10, 15, 20})));   //expect [20, 15, 10, 5]
        System.out.println(Arrays.asList(test.reversedLinkedList(new int[] {1, 100, 1000})));   //expect [1000, 100, 1]
    }
}

//iterate through the array in reverse and create a new array and returrn it