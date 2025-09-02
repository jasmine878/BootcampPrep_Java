package org.example.loops;

public class stringSlice {
    public String mySlice(String source, Integer startIndex, Integer endIndex) {
        StringBuilder sb = new StringBuilder();

        if (startIndex == null || endIndex == null) return source;

        for (int i = startIndex; i < endIndex; i++) {
            sb.append(source.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        stringSlice test = new stringSlice();
        System.out.println(test.mySlice("a piece of pie", 2, null));
        System.out.println(test.mySlice("a piece of pie", null, null));
        //expect "a piece of pie"

        String subStr1 = test.mySlice("a piece of pie", 2 , 7);
        String subStr2 = "a piece of pie".substring(2, 7);
        System.out.println(subStr1);
        System.out.println(subStr2);
        //expect "piece"
        System.out.println(subStr1.equals(subStr2));        //equals checks value on String types
        System.out.println(subStr1 == subStr2);             //== checks reference on String or Object types
    }
}

//do not use Java's built in .subString() method
//startIndex always less than endIndex
//if either the startIndex or the endIndex is missing, then return the original string
//return the substring
//Use a String Builder to build the new substring
//iterate through the original string using the start Index and ending before the endIndex
