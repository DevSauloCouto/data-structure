package com.studies.data_structure.linked_list;

import java.util.LinkedList;

public class ProgramLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addNode("Saulo");
        list.addNode("Gabi");
        list.addNode("Artur");
        list.addNode("Gislene");

        list.removeNode("Saulo");
        list.removeNode("Gabi");
        list.removeNode("Artur");
        list.removeNode("Gislene");

        list.addNode("Saulo");

        System.out.println("Tamanho: " + list.getSize());
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getNodeByPos(i).getValue());
        }
    }

}
