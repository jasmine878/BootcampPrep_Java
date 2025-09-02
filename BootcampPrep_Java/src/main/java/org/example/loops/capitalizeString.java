package org.example.loops;

public class capitalizeString {
    public static String crazyCaps(String sentence) {
        String sanitizedString = sentence.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char character = sanitizedString.charAt(i);

            if (i % 2 == 1 && Character.isLetter(character)) {
                sb.append(Character.toUpperCase(character));
            } else {
                sb.append(character);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(crazyCaps("fullstack is amazing!"));
        System.out.println(crazyCaps("this is crazy"));
        System.out.println(crazyCaps("WE ARE THE CHAMPIONS!"));
    }
}

//use Stringbuilder to build a new string
//loop through the input
//first index is lowercase
//index 1 is capitalized
//When index is odd, we want to capitalize the letter
//if the character at the odd index is not alphabetic, then we just add it to the new string
//When index is even, we just add the character to the new string
