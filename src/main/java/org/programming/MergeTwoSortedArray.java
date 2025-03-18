package org.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] array1={2,4,6,7,9};
        int[] array2={3,5,6,8,10,11,12};
        int[]mergedArray=mergedTwoSortedArray(array1,array2);
        System.out.println("mergedArray "+ Arrays.toString(mergedArray));
    }

    private static int[] mergedTwoSortedArray(int[] array1, int[] array2) {
        List<Integer> result=new ArrayList<>();
        int i=0;int j=0;int k=0;
        while(i<array1.length && j<array2.length){
            if(array1[i]<array2[j]){
                result.add(array1[i++]);
            } else if (array2[j]<array1[i]) {
                result.add(array2[j++]);
            }else{
                result.add(array1[i++]);
                j++;
            }
        }

            while(i<array1.length)
            result.add(array1[i++]);
           /* System.arraycopy(array1,i,mergedArray,k,array1.length-i);*/

            while(j<array2.length)
                result.add(array2[j++]);
            /*System.arraycopy(array2,j,mergedArray,k,array2.length-j);*/

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
