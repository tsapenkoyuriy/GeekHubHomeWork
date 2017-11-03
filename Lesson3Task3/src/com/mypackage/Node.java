package com.mypackage;

public class Node {
    private Object data;
    private Node next;

    public Node(Object dataValue){
        next = null;
        this.data = dataValue;
    }

    Node current;

    public Node(Object dataValue, Node nextNode){
        this.data = dataValue;
        this.next = nextNode;
    }

    public Object getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    @SuppressWarnings("unused")
    public void setData(Object dataValue){
        this.data = dataValue;
    }

    public void setNext(Node nextNode){
        this.next = nextNode;
    }
}
