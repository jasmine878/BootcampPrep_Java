package org.example.scopes;

public class Increment {
    int counter = 0;
    public int incrementalChange(int num) {
        return counter += num;
    }

    public static void main(String[] args) {
        Increment test = new Increment();
        System.out.println(test.incrementalChange(100));    //expect 100
        System.out.println(test.incrementalChange(-50));    //expect 50

        Increment test2 = new Increment();
        System.out.println(test2.incrementalChange(2));     //expect 2
        System.out.println(test2.incrementalChange(6));     //expect 8
        System.out.println(test2.incrementalChange(-1));    //expect 7
    }

}

//create a global variable called counter
//increment it by the parameter
//return the new counter
