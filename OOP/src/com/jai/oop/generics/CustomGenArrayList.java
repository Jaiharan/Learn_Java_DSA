package com.jai.oop.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomGenArrayList<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    // example for wildcard
    public void getList(List<? extends Number> list) {
        // do something
        // here you only pass Number type or its SubClasses
    }

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;

    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy current items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)data[size--];
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index,T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(5);
        list.add(54);
        list.add(525);

        System.out.println(list);
    }
}
