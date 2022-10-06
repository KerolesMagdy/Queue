package com.keroles.datastructures;

public class MyQueue {
    public int front,rear;
    int arr[];

    public MyQueue() {
        front=rear=-1;
        arr=new int[5];
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("overflow to enqueue");
            return;
        }
        if(front==-1)front=0;
        rear=(rear+1)%arr.length;
        arr[rear]=data;
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("underflow to dequeue");
            return;
        }
        if (front==rear)front=rear=-1;
        else front=(front+1)% arr.length;
    }

    public void display()
    {
        if (isEmpty()) {
            System.out.println("under flow to display");
            return;
        }
        for(int i=front;i!=rear+1;i=(i+1)%arr.length)
            System.out.println(arr[i]);
    }

    public boolean isFull(){
        return ((front == 0 && rear == arr.length - 1) ||
                (rear == front - 1 ))? true:false;
    }

    public boolean isEmpty(){
        return front==-1? true:false;
    }
}
