package org.programming.array_related;

import java.sql.Array;
import java.util.Arrays;

public class ArrayMoveZero {
    public static void main(String[] args) {
        int[] arry={10,0,9,0,11,0,8,13};
        int[] result_with_count=move_All_Zero_To_Start_Index(arry);
        int[] result=move_All_Zero_To_Start(arry);
        System.out.println("move all zero to start using count "+ Arrays.toString(result_with_count));
        System.out.println("move all zero to start "+ Arrays.toString(result));
    }
    public static int[] move_All_Zero_To_Start_Index(int[] arry){
        int arrayLength=arry.length;
        int[] result= new int[arrayLength];
        int count =0;
        for(int i=0;i<arrayLength-1;i++){
            if(arry[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            result[i]=0;
        }
            for(int i=0;i<arrayLength;i++){
                if(arry[i]!=0)
                result[count++]=arry[i];
            }

        return result;
    }
    public static int[] move_All_Zero_To_Start(int[] arry){
        int length=arry.length;
        int index=length-1;
        for(int i=index;i>=0;i--){
            if(arry[i]!=0) {
                arry[index] = arry[i];
                index--;
            }
        }
        while(index>0){
            arry[index]=0;
            index--;
        }
        return arry;
    }

}
