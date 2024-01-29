package com.studies.data_structure;

import com.studies.data_structure.linked_list.IteratorLinkedList;
import com.studies.data_structure.linked_list.MyLinkedList;

public class PerformLinkedList {

    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        int limitLoop = 1000000;

        Long timeInitial = System.currentTimeMillis();

        for (int i = 0; i < limitLoop; i++) {
            linkedList.addNode(i);
        }

        Long timeEnd = System.currentTimeMillis();

        System.out.println("Adicionou " + limitLoop + " elementos na LinkedList em: " + (timeEnd - timeInitial) + "ms");

        timeInitial = System.currentTimeMillis();

        IteratorLinkedList<Integer> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            iterator.getNext();
        }

        timeEnd = System.currentTimeMillis();

        System.out.println("Tempo de leitura de " + limitLoop + " elementos da LinkedList: " + (timeEnd - timeInitial) + "ms");
    }

}
