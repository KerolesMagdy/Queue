package com.keroles;

public class MyQueueLinkedList {

    private MyQueueLinkedListNode head;

    public static class MyQueueLinkedListNode{
        private int data;
        private MyQueueLinkedListNode next;

        public MyQueueLinkedListNode(int data) {
            this.data = data;
            next=null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public MyQueueLinkedListNode getNext() {
            return next;
        }

        public void setNext(MyQueueLinkedListNode myQueueLinkedListNode) {
            this.next = myQueueLinkedListNode;
        }
    }

    public void enqueue(int data){
        if (head==null)head=new MyQueueLinkedListNode(data);
        else {
            MyQueueLinkedListNode tail=head;
            while (tail.getNext()!=null){
                tail=tail.getNext();
            }
            tail.setNext(new MyQueueLinkedListNode(data));
        }
    }

    public void dequeue(){
        if (head==null)System.out.println("Underflow");
        else {
            head=head.getNext();
        }
    }

    public void display(){
        if (head==null)System.out.println("Queue is empty");
        else{
            MyQueueLinkedListNode tail=head;
            while (tail!=null){
                System.out.println(tail.getData());
                tail=tail.getNext();
            }
        }
    }

    public int getQueueCount(){
        int count=0;
        MyQueueLinkedListNode tail=head;
        while (tail!=null){
            tail=tail.getNext();
            count++;
        }
        return count;
    }
}
