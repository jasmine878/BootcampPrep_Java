package org.example.controlFlow;

public class practice {
    public boolean founderFinder(String name) {
        if (name.equals("David") || name.equals("Nimit")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        practice test = new practice();
        System.out.println(test.founderFinder("David"));
        System.out.println(test.founderFinder("Nimit"));
        System.out.println(test.founderFinder("Someone else"));
    }
}
