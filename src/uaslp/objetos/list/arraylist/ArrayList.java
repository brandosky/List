package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.linkedlist.LinkedListIterator;
import uaslp.objetos.list.linkedlist.Node;

public class ArrayList implements List {
    private static final int INITIAL_SIZE=10;
    private String[]array;
    private int size;

    public ArrayList(){
        array=new String[INITIAL_SIZE];
    }
    public void addAtTail(String data){
        if(array.length == size){
            increaseSize();
        }
        array[size]=data;
        size++;
    }
    public  void addAtFront(String data){
        int i=0;
        if(array.length == size){
            increaseSize();
        }
        array[i]=data;
        size++;
    }
    public void remove(int index){
    int i=0;
        for(;i<index;i++){
            array[i]=null;
        }
        size--;
    }
    public void removeAll(){
    int i=0;
            for(;i<size;i++){
                array[i]=null;
            }
        size=0;
    }
    public  void setAt(int index, String data){
        int i=0;
        while(i!=index){
            i++;
        }
        array[i]=data;
    }
    public String getAt(int index){
        int i=0;
        while(i!=index){
            i++;
        }
        return array[i];
    }
    public  void removeAllwithValue(String data){
    int i=0;
        while (i!=size){
        i++;
        if(array[i]==data){
            array[i]=null;
        }
    }
    }
    public Iterator getIterator() {
        return new ArrayListIterator(this) {


        };
    }

    public  int getSize(){
        return size;
    }

    private void increaseSize(){
        String []newArray=new String[array.length*2];

        for(int i=0;i< array.length;i++){
            newArray[i]=array[i];
        }
        array=newArray;
    }
}
