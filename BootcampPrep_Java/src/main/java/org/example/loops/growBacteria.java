package org.example.loops;

import java.security.InvalidParameterException;

public class growBacteria {
    public int bacteriaTime(int currentNum, int targetNum) {
        int minutes = 0;
        int aliveBacteria = currentNum;

        if (targetNum < currentNum) throw new InvalidParameterException("targetNum must be larger than currentNum");

        while (aliveBacteria < targetNum) {
            aliveBacteria *= 2;
            minutes += 20;
        }

        return minutes;
    }

    public static void main(String[] args) {
        growBacteria test = new growBacteria();
        System.out.println(test.bacteriaTime(1, 8));
        //expect 60
        System.out.println(test.bacteriaTime(3, 6000));
        //expect 220
        System.out.println(test.bacteriaTime(100, 50));
        //expect "targetNum must be larger than currentNum"
    }
}

//start with time 0
//if bacteria already exceeds the target, throw an error message
//every 20 minutes double the bacteria
//stop the timer and return once it hits the target number

