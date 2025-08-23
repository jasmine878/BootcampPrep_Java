package org.example.controlFlow;

public class practice {
    public boolean founderFinder(String name) {
        if (name.equals("David") || name.equals("Nimit")) {
            return true;
        }

        return false;
    }

    public String perfectMatch(String word) {
        if(word.charAt(0) == 'p' && word.length() == 7) {
            return word.toUpperCase();
        }

        return word;
    }

    public String truthTeller(boolean arg1, boolean arg2) {
        if(arg1 && arg2) return "both";
        if (arg1 || arg2) return "one";

        return "none";
    }

    public static void main(String[] args) {
        practice test = new practice();
//        System.out.println(test.founderFinder("David"));
//        System.out.println(test.founderFinder("Nimit"));
//        System.out.println(test.founderFinder("Someone else"));

//        System.out.println(test.perfectMatch("carrots"));
//        System.out.println(test.perfectMatch("pacific"));
//        System.out.println(test.perfectMatch("perfecto"));

        System.out.println(test.truthTeller(true, true));
        System.out.println(test.truthTeller(true, false));
        System.out.println(test.truthTeller(false, false));
    }
}
