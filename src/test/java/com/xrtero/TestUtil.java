package com.xrtero;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Xrtero
 */
public class TestUtil {

    public int[] randomIntArray(int size,int bound){
        SortedSet<Integer> set = new TreeSet();
        Random random = new Random(System.currentTimeMillis());
        while(set.size()<size){
            set.add(random.nextInt(bound)+1);
        }
        Integer[] ints = set.toArray(new Integer[set.size()]);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ints[i];
        }
        return arr;
    }


}
