package uaslp.objetos.list.linkedlist;

public class LinkedList {

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
   int i;
    if (index < 0 || index >= size){
        return;
    }
    head=head.next;
    for(i=0;i<index;i++){

    }
        head=null;
    size--;

}
public void removeAll(){
for(int index=0;index<size;index++){
    if(head.next!=null){
        head.next=null;
    }
}
    size=0;
}
public void setAt(int index, String data) {
    if (index < 0 || index >= size) {
        return;
    }
    for (int i = 0; i < index; i++) {
    if(i==index){
        head.data=data;
    } else {
        head=head.next;
    }
        }
    }

public String getAt(int index) {
    if (index < 0 || index >= size) {
        return null;
    }
    for (int i = 0; i < index; i++) {
            if (i == index) {
                return head.data;
            }
        }
    return head.data;
}


public void removeAllwithValue(String data) {
    for (int i = 0; i < size; i++) {
        if ((head.data == data)) head.data = null;
    }
    if (data == tail.data) {
        tail = null;
    }
}
public int getSize(){
    return size;
}
public LinkedListIterator getIterator() {

    return new LinkedListIterator(head);
}
}





