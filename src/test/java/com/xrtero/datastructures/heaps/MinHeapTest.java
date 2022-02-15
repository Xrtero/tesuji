package com.xrtero.datastructures.heaps;

import com.xrtero.TestUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Xrtero
 */
public class MinHeapTest {

    PriorityQueue<Integer> q = new PriorityQueue<Integer>(10);
    TestUtil util = new TestUtil();
   @Test
   public void baseTest(){
       int[] arr = util.randomIntArray(10,100);
       for (int i = 0; i < arr.length; i++) {
           q.add(arr[i]);
       }

       Arrays.sort(arr);

       Assertions.assertEquals(q.peek(),arr[0]);

   }


}
