package com.mypackage;

public class LinkedList {
    private static int counter=0;
    private Node head;

    public void add(Object data){
        if(head==null){
            head = new Node(data);
            }
        Node temp = new Node(data);
        Node current = head;

        if (current!=null){
            while(current.getNext()!=null){
                current = current.getNext();
            }
        }
        current.setNext(temp);
        incrementCounter();
    }

    private static int getCounter(){
        return counter;
    }

    private void incrementCounter(){
        counter++;
    }

    private void decrementCounter(){
        counter--;
    }

    public void add(Object data, int index){
        Node temp = new Node(data);
        Node current = head;

        for(int i=0;i<index && current.getNext()!=null;i++){
            current = current.getNext();
        }

        temp.setNext(current.getNext());
        current.setNext(temp);
        incrementCounter();
    }

    public Object get(int index) {
        if (index < 0)
            return null;
        Node current = null;
        if(head!=null){
            current = head.getNext();

            for (int i=0;i<index;i++){
                if(current.getNext()==null) return null;
                current = current.getNext();
            }
            return current.getData();
        }
        return current;
    }

    public boolean remove(int index){
        if (index<1 || index>size()){
            return false;
        }
        Node current = head;
        if(head!=null){
            for(int i=0;i<index;i++){
                if(current.getNext()==null) return false;
            }
            decrementCounter();
            return true;
        }
        return false;
    }

    public int size(){
        return getCounter();
    }

    public String toString(){
        String output = "";
        if(head!=null){
            Node current = head.getNext();
            while(current!=null){
                output+="["+current.getData().toString()+"]";
                current = current.getNext();
            }
        }
        return output;
    }
}


