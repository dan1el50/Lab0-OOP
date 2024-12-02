package oop.practice.lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test1 {

    // Generic method to test a queue implementation
    private <T> void testQueueImplementation(Queue<T> queue, T[] testData) {
        // Test isEmpty on a newly created queue
        assertTrue(queue.isEmpty(), "New queue should be empty");
        assertEquals(0, queue.size(), "New queue size should be 0");

        // Enqueue elements
        for (T data : testData) {
            queue.enqueue(data);
        }

        // Verify size after enqueueing
        assertEquals(testData.length, queue.size(), "Queue size after enqueuing");

        // Peek at the first element without removing it
        assertEquals(testData[0], queue.peek(), "Peek should return the first element");

        // Dequeue elements and verify order
        for (T data : testData) {
            assertEquals(data, queue.dequeue(), "Dequeue should return elements in the order they were added");
        }

        // Test isEmpty after all elements are dequeued
        assertTrue(queue.isEmpty(), "Queue should be empty after dequeuing all elements");

        // Test exception on dequeue from an empty queue
        assertThrows(IllegalStateException.class, queue::dequeue, "Dequeue on empty queue should throw exception");

        // Test exception on peek from an empty queue
        assertThrows(IllegalStateException.class, queue::peek, "Peek on empty queue should throw exception");
    }

    @Test
    public void testArrayQueue() {
        Queue<Integer> queue = new ArrayQueue<>();
        Integer[] testData = {10, 20, 30};
        testQueueImplementation(queue, testData);
    }

    @Test
    public void testLinkedListQueue() {
        Queue<String> queue = new LinkedListQueue<>();
        String[] testData = {"a", "b", "c"};
        testQueueImplementation(queue, testData);
    }

    @Test
    public void testDequeQueue() {
        Queue<Double> queue = new DequeQueue<>();
        Double[] testData = {1.1, 2.2, 3.3};
        testQueueImplementation(queue, testData);
    }
}
