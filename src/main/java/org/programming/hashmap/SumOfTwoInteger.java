package org.programming.hashmap;

import java.sql.Array;
import java.util.*;

public class SumOfTwoInteger {
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5,6};
        int target = 7;
       List sumOfTwoEqualToTarget = sumOfTwoIndex(arry, target);
        System.out.println("Sum of two index equal to target " + sumOfTwoEqualToTarget );
    }

    private static List<List<Integer>> sumOfTwoIndex(int[] arry, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result=new ArrayList<>();
        int compensate = 0;
        for (int i = 0; i < arry.length; i++) {
            compensate = target - arry[i];
            if(map.containsKey(compensate)){
                 result.add(Arrays.asList(map.get(compensate),arry[i]));
            }
            map.put(arry[i],arry[i]);
        }

        return result;
    }
}
