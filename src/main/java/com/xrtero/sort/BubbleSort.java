package com.xrtero.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @author Xrtero
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void work(int[] arr){
       int n = arr.length;
       boolean isSwap = true;
       // 使用flag 可以减少比较次数
       while(isSwap){
           isSwap = false;
           for(int i=0;i<n-1;i++){
               if(arr[i]>arr[i+1]){
                   isSwap = true;
                   // 交换两个数，为了确保溢出，使用临时变量存储
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;
               }
           }
       }

    }




}
