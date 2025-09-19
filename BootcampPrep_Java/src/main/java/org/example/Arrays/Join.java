package org.example.Arrays;

public class Join {
    public String myJoin(String[] words, String separator) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            sb.append(i < words.length - 1 ? " " + separator + " " : "");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Join test = new Join();
        System.out.println(test.myJoin(new String[] {"Beyonce", "Kelly", "Michelle"}, "and"));
        //expect "Beyonce and Kelly and Michelle
    }
}

//Use StringBuilder to create a new String
//iterate through the array and add the element to the StringBuilder along with the separator
