package org.example.valuesAndTypes;

public class ValuesAndTypes {
    public static void main(String[] args) {
        Integer in = 5;
        System.out.println(in.getClass());

        String apples = "apples";
        System.out.println(apples.getClass());

        Float num = 2.55f;
        System.out.println(num.getClass());

        Boolean t = true;
        System.out.println(t.getClass());

        Boolean f = false;
        System.out.println(f.getClass());

        System.out.println();
        System.out.println("Basic arithmetic");
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);
        System.out.println(11 % 5);

        System.out.println();
        System.out.println("Equals");
        System.out.println(10 == 10);
        System.out.println(10 == 11);

        System.out.println(10 != 10);
        System.out.println(10 != 11);

        System.out.println();
        System.out.println("Comparators");
        System.out.println(9 < 10);
        System.out.println(9 > 10);
        System.out.println(9 <= 10);
        System.out.println(9 >= 10);

        System.out.println();
        System.out.println("Accessing a character");
        System.out.println("happy".charAt(0));
        System.out.println("happy".charAt(1));
        System.out.println("happy".length());
        System.out.println("happy" + " " + "together");
        System.out.println("same" == "same");
        System.out.println("same" != "different");
        System.out.println("So happy".toUpperCase());
        System.out.println("SHHH BE QUIET".toLowerCase());
    }
}
