package oop.practice.lab3;

import java.util.ArrayList;

public class ArrayQueue<T> implements Queue<T> {
    private ArrayList<T> elements = new ArrayList<>();

    @Override
    public void enqueue(T element) {
        elements.add(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }
}
