package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Columns {
    public static Integer[][] removeColumns(Integer[][] array, int num) {
        Integer[][] result = new Integer[array.length][];

        for (int i = 0; i < array.length; i++) {
            List<Integer> row = new ArrayList<>(Arrays.asList(array[i]));
            int index = num;

            //remove columns from the row
            while (index > 0) {
                row.remove(index);
                index--;
            }

            //we have to override or save the modified row in the original array
            result[i] = row.toArray(new Integer[0]);
        }

        return result;
    }

    public static Integer[][] removeColumns2(Integer[][] array, int num) {
        int rowCount = array.length;
        int colCount = array[0].length;
        int newColCount = colCount - num;
        Integer[][] result = new Integer[rowCount][newColCount];

        for (int i = 0; i < rowCount; i++) {
            System.arraycopy(array[i], 0, result[i], 0, newColCount);
        }

        return result;
    }

    public static void main(String[] args) {
        Integer[][] originalGrid = new Integer[][] {{1,2,3}, {1,2,3}, {1,2,3}};
        System.out.println(Arrays.deepToString(originalGrid));
        System.out.println(Arrays.deepToString(removeColumns(originalGrid, 2)));
        System.out.println(Arrays.deepToString(removeColumns2(originalGrid, 2)));
    }
}
