package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {
    private Node currentNode;
    public LinkedListIterator(Node head){// constructor para recorrer de principio a fin//
        currentNode=head;
    }

 public String next(){

       String value= currentNode.data;

       currentNode=currentNode.next;

       return value;
 }

 public boolean hasNext(){
      return currentNode!=null;
 }
    public Node getCurrentNode(){
        return currentNode;
    }
}

