package bai11;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(10);
        myLinkedListQueue.enqueue(3);
        myLinkedListQueue.enqueue(3);
        myLinkedListQueue.dequeue();
        myLinkedListQueue.dequeue();
        myLinkedListQueue.dequeue();
        myLinkedListQueue.enqueue(3);
        myLinkedListQueue.enqueue(1);
        System.out.println(myLinkedListQueue.dequeue().key);
        System.out.println(myLinkedListQueue.dequeue().key);
    }
}
