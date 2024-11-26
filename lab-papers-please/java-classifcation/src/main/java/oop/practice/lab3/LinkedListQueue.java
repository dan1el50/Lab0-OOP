package oop.practice.lab3;

import java.util.LinkedList;

public class LinkedListQueue<T> implements Queue<T> {
    private LinkedList<T> elements = new LinkedList<>();

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
