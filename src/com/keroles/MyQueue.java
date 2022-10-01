package com.keroles;

public class MyQueue {
    int front,rear,size=0;
    int arr[];

    public MyQueue() {
        front=rear=-1;
        arr=new int[10];
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("overflow to enqueue");
            return;
        }
        arr[++rear]=data;
        if (front==-1)front++;
        size++;
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("underflow to dequeue");
            return;
        }
        front++;
        if (rear==0)rear--;
        size--;
    }

    public void display()
    {
        if (front==-1) {
            System.out.println("under flow to display");
            return;
        }
        for(int i=front;i<=rear;i++)
            System.out.println(arr[i]);
    }

    public boolean isFull(){
        return rear==arr.length-1? true:false;
    }

    public boolean isEmpty(){
        return front==-1||front>rear? true:false;
    }
}
