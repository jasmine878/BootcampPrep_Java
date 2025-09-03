package org.example.loops;

import java.util.Set;

public class countVowels {
    public static String mostVowels(String sentence) {
        String vowels = "aeiou";
        int maxVowelsCount = 0;
        String maxVowelWord = "";
        String removePeriod = sentence.replace(".", "");
        String[] words = removePeriod.split(" ");

        for (String word: words) {
            int wordVowelsCount = 0;

            for (int i = 0; i < word.length(); i++) {
                char element = word.charAt(i);

                if (vowels.contains(Character.toLowerCase(element) + "")) {
                    wordVowelsCount++;
                }
            }

            if (wordVowelsCount > maxVowelsCount) {
                maxVowelsCount = wordVowelsCount;
                maxVowelWord = word;
            }
        }

        return maxVowelWord;
    }

    public static String mostVowels2(String sentence) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int maxVowelsCount = 0;
        String maxVowelsString = "";
        String removePeriod = sentence.replace(".", "");
        String[] words = removePeriod.split(" ");

        for (String word: words) {
            int wordVowelCount = 0;

            for (int i = 0; i < word.length(); i++) {
                char element = word.charAt(i);

                if (vowels.contains(element)) {
                    wordVowelCount++;
                }

                if (wordVowelCount > maxVowelsCount) {
                    maxVowelsCount = wordVowelCount;
                    maxVowelsString = word;
                }
            }
        }

        return maxVowelsString;
    }

    public static void main(String[] args) {
        System.out.println(mostVowels("I am a keeper with some real rhythms"));
        System.out.println(mostVowels2("I am a keeper with some real rhythms"));
        //expect keeper
        System.out.println(mostVowels("try my gym"));
        System.out.println(mostVowels2("try my gym"));
        //expect ""
        System.out.println(mostVowels("Wit beyond measure is man\'s greatest treasure."));
        System.out.println(mostVowels2("Wit beyond measure is man\'s greatest treasure."));
        //expect measure
        System.out.println(mostVowels("Give her hell from us, Peeves."));
        System.out.println(mostVowels2("Give her hell from us, Peeves."));
        //expect Peeves
        System.out.println(mostVowels("why dry my sly lynx?"));
        System.out.println(mostVowels2("why dry my sly lynx?"));
        //expect ""
    }
}

//start with max vowels at 0 and string at the default value of an empty string
//split the sentence into an array of words
//iterate through the words, when we find a word with more vowels, make that the max vowels
//and change the return string to the word with the max vowels

//return the word in the sentence with the most vowels
//if there are no vowels, return an empty string
