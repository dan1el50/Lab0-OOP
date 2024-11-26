package oop.practice.lab3;

import java.util.PriorityQueue;

public class PriorityQueueImpl<T extends Comparable<T>> implements Queue<T> {
    private PriorityQueue<T> elements = new PriorityQueue<>();

    @Override
    public void enqueue(T element) {
        elements.add(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.poll();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.peek();
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
