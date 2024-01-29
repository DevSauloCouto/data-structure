package com.studies.data_structure.linked_list;

public class IteratorLinkedList<T> {

    private Node<T> node;

    public IteratorLinkedList(Node<T> head) {
        this.node = head;
    }

    public boolean hasNext() {
        return node.hasNext();
    }

    public Node<T> getNext() {
        node = node.getNext();

        return node;
    }

}
