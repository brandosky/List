package uaslp.objetos.list.linkedlist;

 public class Node { //default (package private)
     String data;
    Node next;
     Node previous;

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
