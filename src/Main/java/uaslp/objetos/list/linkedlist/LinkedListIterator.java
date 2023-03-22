package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator <K>implements Iterator<K>{
    private Node<K> currentNode;
    public LinkedListIterator(Node<K> head){// constructor para recorrer de principio a fin//
        currentNode=head;
    }

 public K next(){

     K value= currentNode.data;

       currentNode=currentNode.next;

       return value;
 }

 public boolean hasNext(){
      return currentNode!=null;
 }
    public Node<K>getCurrentNode(){
        return currentNode;
    }
}

