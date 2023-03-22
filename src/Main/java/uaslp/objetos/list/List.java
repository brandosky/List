package uaslp.objetos.list;

import uaslp.objetos.list.linkedlist.LinkedListIterator;


public interface List <G>{
     void addAtTail(G data);
//public y abstract ya son por default en interface
     void addAtFront(G data);

     void remove(int index);
     void removeAll();
    void setAt(int index, G data);

    G getAt(int index);

     void removeAllwithValue(G data);
     int getSize();
    Iterator<G> getIterator();
}







