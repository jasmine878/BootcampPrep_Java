package org.example.Arrays;

import java.util.Arrays;

public class NestedSentence {
    public static String[] zooInventory(String[][][] zoo) {
        String[] sentences = new String[zoo.length];

        for (int i = 0; i < zoo.length; i++) {
            String[][] animal = zoo[i];

            StringBuilder singleLine = new StringBuilder();
            singleLine.append(animal[0][0] + " the ");      //contains the name
            singleLine.append(animal[1][0] + " is ");       //contains the species
            singleLine.append(animal[1][1] + ".");          //contains the age

            sentences[i] = singleLine.toString();
        }

        return sentences;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zooInventory(new String[][][] {{{"King Kong"}, {"gorilla","42"}}})));

        String[][][] myZoo = {
                {{"King Kong"}, {"gorilla", "42"}},
                {{"Nemo"}, {"fish", "5"}},
                {{"Punxsutawney Phil"}, {"groundhog", "11"}}
        };

        System.out.println(Arrays.deepToString(zooInventory(myZoo)));
    }
}

//we are provided with a multi-dimensiomal array
//Iterate through the nested array and use a stringbuilder to create a string
//return an array with the stringbuilder converted into a String