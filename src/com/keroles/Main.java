package com.keroles;

public class Main {

    public static void main(String[] args) {

        //normal queue
        System.out.println("Queue with array");
        MyQueue queue=new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.display();


        // Queue linked list
        System.out.println("Queue with linked list");
        MyQueueLinkedList queueLinkedList=new MyQueueLinkedList();
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.dequeue();
        queueLinkedList.enqueue(5);
        queueLinkedList.display();
    }
}
