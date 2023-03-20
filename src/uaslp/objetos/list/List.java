package uaslp.objetos.list;

import uaslp.objetos.list.linkedlist.LinkedListIterator;


public interface List {
     void addAtTail(String data);
//public y abstract ya son por default en interface
     void addAtFront(String data);

     void remove(int index);
     void removeAll();
    void setAt(int index, String data);

     String getAt(int index);


     void removeAllwithValue(String data);
     int getSize();
    Iterator getIterator();
}







