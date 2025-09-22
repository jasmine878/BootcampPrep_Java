package org.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Leet {
    char[] letters = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    String[] leetChars = new String[] {"@", "8", "(", "|)", "3", "ph", "g", "#","l", "_|", "|<", "1", "|'|'|", "/\\/", "0", "|D", "(,)", "|2", "5", "+", "|_|", "|/", "|/|/'","><", "j", "2"};
    public String leetTranslator (String word) {
        Map<Character, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            map.put(letters[i], leetChars[i]);
        }

        for (char letter: word.toCharArray()) {
            String leetLetter = map.get(letter);

            sb.append(leetLetter);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Leet test = new Leet();
        System.out.println(test.leetTranslator("fullstack"));
        // expect ph|_|115+@(|<
    }
}
