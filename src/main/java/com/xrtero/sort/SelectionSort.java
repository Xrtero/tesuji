package com.xrtero.sort;

import java.util.Arrays;

/**
 * @author Xrtero
 */
public class SelectionSort {


    /**
     * 选择排序，升序排列
     * @param arr
     */
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int target = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[target]){
                    target = j;
                }
            }
            // 选择出最大的排在第一位
            int temp = arr[i];
            arr[i] = arr[target];
            arr[target] = temp;
        }
    }

}
