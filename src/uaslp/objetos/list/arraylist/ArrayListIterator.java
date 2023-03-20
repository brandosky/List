package uaslp.objetos.list.arraylist;


import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.linkedlist.Node;

public class ArrayListIterator implements Iterator{
    private int i;
     private final ArrayList lista;
     ArrayListIterator(ArrayList lista){
     this.lista=lista;
     i=0;
     }

    public String next(){

     String value=lista.getAt(i);
     i++;
        return value;
    }

    @Override
    public Node getCurrentNode() {
        return null;
    }

    public boolean hasNext(){
     return i<lista.getSize();
}
}

