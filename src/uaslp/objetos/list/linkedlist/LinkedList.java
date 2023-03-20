package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class LinkedList implements List {

    private Node head;
    private Node tail;
    private int size;


public void addAtTail(String data){
        Node node =new Node();

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

public void addAtFront(String data){
    Node node =new Node();

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
   Iterator iterator=getIterator();
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
    Iterator iterator=getIterator();

while(iterator.hasNext()){

  Node aux=iterator.getCurrentNode();

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
public void setAt(int index, String data) {
  Iterator iterator =getIterator();
    int currentIndex=0;
    if (index < 0 || index >= size) {
        return;
    }
    for (; currentIndex < index; currentIndex++) {
        iterator.next();
        }
    iterator.getCurrentNode().data=data;
    }

public String getAt(int index) {
 Iterator iterator=getIterator();
    int current_index=0;

    if (index < 0 || index >= size) {
        return null;
    }
    for (; current_index < index; current_index++) {
        iterator.next();
        }
    return iterator.next();
}


public void removeAllwithValue(String data) {
    Iterator iterator=getIterator();

    while (iterator.hasNext()) {
        Node aux=iterator.getCurrentNode();
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

        return new LinkedListIterator(head){


    };
}

}







