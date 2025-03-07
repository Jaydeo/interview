package org.programming.array_related;

import java.sql.Array;
import java.util.Arrays;

public class ArrayMoveZero {
    public static void main(String[] args) {
        int[] arry = {10, 0, 9, 0, 11, 0, 8, 13};
        // int[] result_with_count=move_All_Zero_To_Start_Index(arry);
        int[] resultStart=move_All_Zero_To_Start(arry);
        int[] resultEnd = move_All_Zero_To_End(arry);
    }

    public static int[] move_All_Zero_To_Start_Index(int[] arry) {
        int arrayLength = arry.length;
        int[] result = new int[arrayLength];
        int count = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (arry[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            result[i] = 0;
        }
        for (int i = 0; i < arrayLength; i++) {
            if (arry[i] != 0)
                result[count++] = arry[i];
        }

        return result;
    }

    public static int[] move_All_Zero_To_Start(int[] arry) {
        int length = arry.length;
        int index = length - 1;
        for (int i = index; i >= 0; i--) {
            if (arry[i] != 0) {
                arry[index] = arry[i];
                index--;
            }
        }
        while (index >= 0) {
            arry[index] = 0;
            index--;
        }
        System.out.println("move_All_Zero_To_Start " + Arrays.toString(arry));
        return arry;
    }


    public static int[] move_All_Zero_To_End(int[] arry) {
        int index = 0;
        int length = arry.length;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] != 0) {
                arry[index] = arry[i];
                index++;
            }
        }
        if (index < length) {
            for (int i = index; i < length; i++) {
                arry[index] = 0;
                index++;
            }
        }
        System.out.println("move_All_Zero_To_End " + Arrays.toString(arry));
        return arry;
    }
}

