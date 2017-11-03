package com.mypackage;
import java.util.Arrays;
import com.mypackage.Entry;
public class Map {
    private int size = 0;
    Entry array[]= new Entry[size];

    public void put(Object key, Object value){
        boolean isInsert = false;
        for(int i=0;i<size;i++){
            if (size==0){
                expandArray();
            }
            else try{
                if (array[i].getKey().equals(key)) {
                    array[i].setValue(value);
                    isInsert = true;
                }
            }catch(NullPointerException e){
                System.out.println(i);
            }
        }
        if (!isInsert){
            expandArray();
            array[array.length-1] = new Entry(key,value);
        }
    }

    private void expandArray(){
        size++;
        array = Arrays.copyOf(array,size);
    }

    public Object get(Object key){
        for(int i=0;i<array.length;i++){
            if(array[i]!=null)
            if(array[i].getKey().equals(key)) return array[i].getValue();

        }
        return null;
    }

    public void remove(Object key){
        for(int i=0;i<size;i++){
            if(array[i].getKey().equals(key)){
                array[i] = null;
                condenseArray(i);
            }
        }
    }

    private void condenseArray(int start){
        for(int i=start;i<size-1;i++){
            array[i] = array[i+1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    public LinkedList getKeys(){
        LinkedList list = new LinkedList();
        for(int i=0;i<size;i++){
            list.add(array[i].getKey());
        }
        return list;
    }
}
