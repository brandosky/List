package uaslp.objetos.list.linkedlist;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.arraylist.ArrayListIterator;


public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        List<String>lista1 = new LinkedList();
        List<Integer>lista2 = new ArrayList();

        lista1.addAtFront("hola");
        lista1.addAtTail("dale");
        lista1.addAtFront("hola1");
        lista1.addAtTail("dale2");
        printList(lista1);
        lista1.remove(2);
        printList(lista1);
        lista1.removeAll();
        printList(lista1);
        lista1.getAt(2);
        lista1.setAt(7,"juan");
        printList(lista1);
        lista1.removeAllwithValue("hola1");
        printList(lista1);
        lista1.getSize();
        lista1.getIterator();

        lista2.addAtFront(1);
        lista2.addAtTail(2);
        printList(lista2);
        lista2.remove(1);
        printList(lista2);
        lista2.removeAll();
        lista2.getAt(1);
        lista2.setAt(1,3);
        printList(lista2);
        lista2.removeAllwithValue(2);
        lista2.getSize();
        lista2.getIterator();
    }
    public static void printList(List list){
        Iterator i=list.getIterator();
        System.out.print("\n dato:");
        while(i.hasNext()){
            System.out.print(" \n"+ i.next());
        }
        if(i.next()==null){
            System.out.print("\n no existe dato.\n");
        }
    }

}