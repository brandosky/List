package uaslp.objetos.list.linkedlist;
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.addAtFront("hola");
        linkedlist.getAt(2);
        linkedlist.addAtTail("dale");
        linkedlist.remove(4);
        linkedlist.removeAllwithValue("hola");
        linkedlist.setAt(7,"juan");
        linkedlist.getSize();
        linkedlist.getIterator();
    }
}