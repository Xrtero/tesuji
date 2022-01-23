package com.xrtero.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Xrtero
 */
public class SortTest {

    public static int[] newArray(){
        HashSet<Integer> set = new HashSet<>();
        Random r = new Random(System.currentTimeMillis());

        while(set.size()<10){
            set.add(r.nextInt(999));
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }


    @Test
    public void insertSortTest(){
        int[] arr1 = newArray();
        int[] arr2 = Arrays.copyOf(arr1,arr1.length);
        BubbleSort.work(arr1);
        Arrays.sort(arr2);

        assertArrayEquals(arr1,arr2);
    }




}
