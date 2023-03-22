package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.linkedlist.LinkedListIterator;
import uaslp.objetos.list.linkedlist.Node;

public class ArrayList <T>implements List<T> {
    private static final int INITIAL_SIZE=10;
    private T []array;//se puede T o object porque hereda de object pero se podrian perder validaciones
    private int size;

    public ArrayList(){
        array=(T[]) (new Object[INITIAL_SIZE]);
    }
    public void addAtTail(T data){
        if(array.length == size){
            increaseSize();
        }
        array[size]=data;
        size++;
    }
    public  void addAtFront(T data){
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
    public  void setAt(int index, T data){
        int i=0;
        while(i!=index){
            i++;
        }
        array[i]=data;
    }
    public T getAt(int index){
        int i=0;
        while(i!=index){
            i++;
        }
        return (T)array[i];
    }
    public  void removeAllwithValue(T data){
    int i=0;
        while (i!=size){
        i++;
        if(array[i]==data){
            array[i]=null;
        }
    }
    }
    public Iterator <T>getIterator() {
        return (Iterator<T>) new ArrayListIterator<>(this) {
        };
    }

    public  int getSize(){
        return size;
    }

    private void increaseSize(){
        Object[]newArray=new String[array.length*2];

        Iterator<T> iterator=getIterator();
        int Index=0;
        while(iterator.hasNext()){
            newArray[Index]=iterator.next();
            Index++;
        }
    }
}
