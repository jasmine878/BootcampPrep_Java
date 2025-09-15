package org.example.Arrays;

import java.util.Arrays;

public class Grid {
    public static int[][] makeGrid(int columns, int rows) {
        int[][] grid = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int count = j + 1;

                grid[i][j] = count;
            }
        }

        return grid;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(makeGrid(3, 4)));
    }
}

//make an Integer array with the specified rows and columns
//Create a new array with length = rows
//columns should iterate numbers from 1
