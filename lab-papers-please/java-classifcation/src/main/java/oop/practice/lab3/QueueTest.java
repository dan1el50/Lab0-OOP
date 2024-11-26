package oop.practice.lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    // Helper method to test a queue implementation
    private <T> void testQueueImplementation(Queue<T> queue, T[] testData) {
        // Enqueue elements
        for (T data : testData) {
            queue.enqueue(data);
        }
        assertEquals(testData.length, queue.size(), "Queue size after enqueuing");

        // Peek the first element
        assertEquals(testData[0], queue.peek(), "Peek should return the first element");

        // Dequeue elements and check order
        for (T data : testData) {
            assertEquals(data, queue.dequeue(), "Dequeue should return elements in order");
        }

        // Ensure the queue is empty
        assertTrue(queue.isEmpty(), "Queue should be empty after dequeuing all elements");
        assertThrows(IllegalStateException.class, queue::dequeue, "Dequeue on empty queue should throw exception");
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
    public void testPriorityQueue() {
        Queue<Integer> queue = new DequeQueue<>();
        Integer[] testData = {30, 10, 20};

        // Enqueue elements
        for (Integer data : testData) {
            queue.enqueue(data);
        }
        assertEquals(testData.length, queue.size(), "Queue size after enqueuing");

        // Peek should return the smallest element (priority behavior)
        assertEquals(10, queue.peek(), "Peek should return the smallest element in PriorityQueue");

        // Dequeue elements and check priority order
        assertEquals(10, queue.dequeue(), "Dequeue should return the smallest element first");
        assertEquals(20, queue.dequeue(), "Dequeue should return the next smallest element");
        assertEquals(30, queue.dequeue(), "Dequeue should return the largest element last");

        // Ensure the queue is empty
        assertTrue(queue.isEmpty(), "Queue should be empty after dequeuing all elements");
        assertThrows(IllegalStateException.class, queue::dequeue, "Dequeue on empty queue should throw exception");
    }


}
