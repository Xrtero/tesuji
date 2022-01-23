package com.xrtero.sort;

/**
 * @author Xrtero
 */
public class MergeSortArray implements Sort{


    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        doSort(unsorted,0,unsorted.length-1);
        return unsorted;
    }


    private static <T extends  Comparable<T>> void doSort(T[] arr,int left,int right){
        if(left<right){
            int mid = left + (right-left >> 1);
            // 分
            doSort(arr,left,mid);
            doSort(arr,mid+1,right);
            // 治
            merge(arr,left,mid,right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] arr, int left,int mid,int right){
        int length = right - left + 1;
        T[] temp = (T[]) new Comparable[length];
        int i = left;
        int j = mid+1;
        int k = 0;

        while(i<=mid&&j<=right){
            if(arr[i].compareTo(arr[j])<=0){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        if(i<=mid){
            temp[k++]=arr[i++];
        }
        if(j<=mid){
            temp[k++]=arr[j++];
        }

    }


}
