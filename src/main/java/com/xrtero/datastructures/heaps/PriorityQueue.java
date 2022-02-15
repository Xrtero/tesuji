package com.xrtero.datastructures.heaps;

import java.util.Comparator;

/**
 * @author Xrtero
 */
public class PriorityQueue<E extends Comparable<E>> {

    Object[] q;
    private int size;
    private int capacity;
    private Comparator<E> c;

    public PriorityQueue(int capacity) {
        this.capacity = capacity + 1;
        this.size = 0;
        this.q = new Object[this.capacity];
        c = Comparator.naturalOrder();
    }


    private int compare(int q1, int q2) {
        return c.compare((E) q[q1], (E) q[q2]);
    }


    private void exch(int x, int y) {
        E temp = (E) q[x];
        q[x] = q[y];
        q[x] = temp;
    }

    private void swim(int k) {
        while (k > 1 && compare(k, k / 2) > 0) {
            exch(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k < this.capacity) {
            int j = 2 * k;
            if (k < this.capacity && compare(j, j + 1) <= 0) {
                j++;
            }
            if (compare(k, j) > 0) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }

    public E peek() {
        return (E) q[1];
    }

    public E poll() {
        E min = peek();
        exch(1, size--);
        q[size + 1] = null;
        sink(1);
        return min;
    }

    public int size() {
        return size;
    }


    public void add(E e) {
        q[++size] = e;
        swim(size);
    }

    public boolean contains(Object o) {
        return false;
    }


}
