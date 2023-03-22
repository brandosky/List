package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class LinkedList <T>implements List<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size;


public void addAtTail(T data){
        Node<T> node =new Node<>(data);

        node.data=data;
        if(size == 0){
            head=node;
        }else{
          node.setPrevious(tail);
          tail.setNext(node);
        }
        tail=node;
        size++;
    }

public void addAtFront(T data){
    Node<T> node =new Node<>(data);

    node.setData(data);
    if(size == 0){
        tail=node;
    }else{
        node.setPrevious(head);
        head.setNext(node);
    }
    head=node;
    size++;
}

public void remove(int index) {
   Iterator<T>iterator=getIterator();
   int currentIndex=0;
    if (index < 0 || index >= size){
        return;
    }
    head=head.next;
    for(;currentIndex<index;currentIndex++){
    iterator.next();
    }
        head=null;
    size--;

}
public void removeAll(){
    Iterator <T>iterator=getIterator();

while(iterator.hasNext()){

  Node<T>aux=iterator.getCurrentNode();

  if(head==aux && tail==aux){
      head=null;
      tail=null;
  }
  if(head==aux){
      head=head.next;
      head.previous=null;
      return;
  }
  if(tail==aux){
      tail=tail.previous;
      tail.next=null;
      return;
  }
  aux.previous.next=aux.next;
  aux.next.previous=aux.previous;
}
    size=0;
}
public void setAt(int index,T data) {
  Iterator<T>iterator =getIterator();
    int currentIndex=0;
    if (index < 0 || index >= size) {
        return;
    }
    for (; currentIndex < index; currentIndex++) {
        iterator.next();
        }
    iterator.getCurrentNode().data=data;
    }

public T getAt(int index) {
 Iterator<T>iterator=getIterator();
    int current_index=0;

    if (index < 0 || index >= size) {
        return null;
    }
    for (; current_index < index; current_index++) {
        iterator.next();
        }
    return iterator.next();
}


public void removeAllwithValue(T data) {
    Iterator<T>iterator=getIterator();

    while (iterator.hasNext()) {
        Node<T> aux=iterator.getCurrentNode();
        if(aux.data.equals(data)){
            if(head==aux && tail==aux){
                head=null;
                tail=null;
            }
            if(head==aux){
                head=head.next;
                head.previous=null;
                return;
            }
            if(tail==aux){
                tail=tail.previous;
                tail.next=null;
                return;
            }
            aux.previous.next=aux.next;
            aux.next.previous=aux.previous;
        }
        }
        iterator.next();
    }
    public int getSize(){
        return size;
    }
    public Iterator getIterator() {

        return new LinkedListIterator<>(head){


    };
}

}







