package oop.practice.lab3;

import java.util.ArrayDeque;

public class DequeQueue<T> implements Queue<T> {
    private final ArrayDeque<T> deque = new ArrayDeque<>();

    @Override
    public void enqueue(T element) {
        deque.addLast(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.peekFirst();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public int size() {
        return deque.size();
    }
}
