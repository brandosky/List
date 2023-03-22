package uaslp.objetos.list.linkedlist;

 public class Node <O>{ //default (package private)
     O data;
    Node<O>next;
     Node<O>previous;

     Node(O data){
         this.data=data;
     }
    public O getData() {
        return data;
    }

    public void setData(O data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {

        this.previous = previous;
    }
}
