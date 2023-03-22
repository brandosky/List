package uaslp.objetos.list;

import uaslp.objetos.list.linkedlist.Node;

public interface Iterator <T> {
    boolean hasNext();
    T next();
    Node getCurrentNode();
}
