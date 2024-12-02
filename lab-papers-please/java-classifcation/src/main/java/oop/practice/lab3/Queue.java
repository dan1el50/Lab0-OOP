package oop.practice.lab3;

public interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    T peek(); //
    boolean isEmpty();
    int size();
}
