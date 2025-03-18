package org.programming;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] array1={2,4,6,7,9};
        int[] array2={3,5,8,10,11,12};
        int[]mergedArray=mergedTwoSortedArray(array1,array2);
        System.out.println("mergedArray "+ Arrays.toString(mergedArray));
    }

    private static int[] mergedTwoSortedArray(int[] array1, int[] array2) {
        int[] mergedArray=new int[array1.length+array2.length];
        int i=0;int j=0;int k=0;
        while(i<array1.length && j<array2.length){
            if(array1[i]<array2[j]){
                mergedArray[k++]=array1[i++];
            } else if (array2[j]<array1[i]) {
                mergedArray[k++]=array2[j++];
            }
        }
        if(i<array1.length){
            for(int l=i;l<array1.length;l++)
            mergedArray[k++]=array1[i];
        }
        if(j<array2.length){
            for(int l=j;l<array2.length;l++)
                mergedArray[k++]=array2[l];
        }
        return mergedArray;
    }
}
