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

    public static void main(String[] args) {
        // 测试
        int[] arr = new int[]{4,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
