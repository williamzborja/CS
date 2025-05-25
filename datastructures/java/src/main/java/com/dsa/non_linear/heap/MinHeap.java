package com.dsa.non_linear.heap;

import java.util.*;

public class MinHeap implements Iterable {
    public final List<Integer> items;

    private int fatherIndex(int index) {
        return (index - 1) / 2;
    }

    private int leftIndex(int index) {
        return (2 * index) + 1;
    }

    private int rightIndex(int index) {
        return (2 * index) + 2;
    }

    private boolean hasLeft(int index) {
        return this.leftIndex(index) < items.size();
    }

    private Integer father(int index) {
        return items.get(fatherIndex(index));
    }

    private boolean hasFather(int index) {
        return this.fatherIndex(index) < items.size();
    }


    private int minChild(int index) {
        var leftI = leftIndex(index);
        var rightI = rightIndex(index);

        if (rightI >= items.size()) return leftI;

        return items.get(leftI) < items.get(rightI) ? leftI : rightI;
    }

    private void heapifyUp() {
        int index = items.size() - 1;

        while (hasFather(index) && items.get(index) < father(index)) {
            Collections.swap(items, fatherIndex(index), index);
            index = fatherIndex(index);
        }
    }

    private void heapifyDown() {
        var index = 0;
        var minIndex = this.minChild(index);

        while (hasLeft(index) && items.get(index) > items.get(minIndex)) {
            minIndex = this.minChild(index);
            Collections.swap(items, index, minIndex);
            index = minIndex;
        }
    }

    public MinHeap() {
        this.items = new ArrayList<>();
    }

    public Integer peek() {
        return items.getFirst();
    }

    public Integer poll() {
        var item = items.getFirst();
        items.set(0, items.getLast());
        items.removeLast();

        heapifyDown();

        return item;
    }

    public void add(Integer item) {
        items.add(item);
        heapifyUp();
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < items.size();
            }

            @Override
            public Object next() {
                if (!hasNext()) throw new NoSuchElementException();
                return items.get(index++);
            }
        };
    }


    @Override
    public String toString() {
        return items.toString();
    }
}
