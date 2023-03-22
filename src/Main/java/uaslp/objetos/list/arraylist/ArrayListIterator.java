package uaslp.objetos.list.arraylist;


import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.linkedlist.Node;

public class ArrayListIterator<H> implements Iterator<H>{
    private int i;
     private final ArrayList<H> lista;
     ArrayListIterator(ArrayList<H>lista){
     this.lista=lista;
     i=0;
     }

    public H next(){

     H value=lista.getAt(i);
     i++;
        return value;
    }

    @Override
    public Node<H> getCurrentNode() {
        return null;
    }

    public boolean hasNext(){
     return i<lista.getSize();
}
}

