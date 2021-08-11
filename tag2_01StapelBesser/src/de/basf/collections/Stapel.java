package de.basf.collections;

public class Stapel<T> { // t ist ein Platzhalter für einen Typ

    public static final int DEFAULT_SIZE = 10;
    private T [] data;
    private int index;

    public Stapel() {
        this(DEFAULT_SIZE);
    }

    public Stapel(int size) {
        data = (T []) new Object[size < 1 ? DEFAULT_SIZE: size];
        index = 0;
    }

    public void push(T value) {
        if(isFull()) {
            return ;
        }

        data[index++] = value; // Postincrement (gegenteil von preincrement)
    }

    public T pop() {
        if(isEmpty())
            return null;
        return data[--index];
    }

    public boolean isEmpty() {
        return index <= 0;
    }

    public boolean isFull() {
        return index >= data.length;
    }


}
