package com.keroles;

public class Main {

    public static void main(String[] args) {

        //normal queue
        MyQueue queue=new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.display();


        // Queue linked list
        MyQueueLinkedList queueLinkedList=new MyQueueLinkedList();
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.dequeue();
        queueLinkedList.enqueue(5);
        queueLinkedList.display();
    }
}
