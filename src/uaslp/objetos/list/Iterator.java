package uaslp.objetos.list;

import uaslp.objetos.list.linkedlist.Node;

public interface Iterator {
    boolean hasNext();
    String next();

    Node getCurrentNode();
}
