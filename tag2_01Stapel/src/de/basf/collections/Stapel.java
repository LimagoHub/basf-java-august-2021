package de.basf.collections;

public class Stapel {

    public static final int DEFAULT_SIZE = 10;
    private int [] data;
    private int index;

    public Stapel() {
        data = new int[DEFAULT_SIZE];
        index = 0;
    }

    public void push(int value) {
        if(isFull()) {
            return ;
        }

        data[index++] = value; // Postincrement (gegenteil von preincrement)
    }

    public int pop() {
        if(isEmpty())
            return 0;
        return data[--index];
    }

    public boolean isEmpty() {
        return index <= 0;
    }

    public boolean isFull() {
        return index >= data.length;
    }


}
