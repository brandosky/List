package uaslp.objetos.list.linkedlist;

public class LinkedListIterator {
    private Node currentNode;
    LinkedListIterator(Node head){// constructor para recorrer de principio a fin//
        currentNode=head;
    }
 public String next(){

       String value= currentNode.data;

       currentNode=currentNode.next;

       return value;
 }

 public boolean hasNext(){
        if(currentNode==null){
            return false;
        }else {
            return true;
        }
 }
}

