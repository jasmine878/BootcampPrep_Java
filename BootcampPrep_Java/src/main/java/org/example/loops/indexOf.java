package org.example.loops;

public class indexOf {
    public static int myIndexOf(String source, String searchValue, Integer startIndex) {
        Integer startIdx = startIndex;
        int searchLength = searchValue.length();

        if (startIndex == null) startIdx = 0;
        for (int i = startIdx; i <= source.length() - searchLength; i++) {
            String subString = source.substring(i, i + searchLength);

            if (subString.equals(searchValue)) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(myIndexOf("here and there", "here", null));
        System.out.println("here and there".indexOf("here"));
        //expect 0                                  14
        System.out.println(myIndexOf("here and there", "here", 4));
        //expect 10
        System.out.println(myIndexOf("here and there", "nowhere", null));
        System.out.println("here and there".indexOf("nowhere"));
        //expect -1
        System.out.println(myIndexOf("i love apples", "apples", null));
        System.out.println("i love apples".indexOf("apples"));
        //expect 7
    }
}

//iterate through the source from the startIndex and find the first index where searchValue matches
//if a startIndex is not provided then search the entire source
//use substring and see if it matches the searchValue, else keep iterating
//Return -1 if the searchValue doesn't exist in the source
