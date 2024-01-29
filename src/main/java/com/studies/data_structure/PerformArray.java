package com.studies.data_structure;

import com.studies.data_structure.linked_list.MyLinkedList;

import java.util.ArrayList;

public class PerformArray {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int limitLoop = 1000000;

        Long timeInitial = System.currentTimeMillis();

        for (int i = 0; i < limitLoop; i++) {
            arrayList.add(i);
        }

        Long timeEnd = System.currentTimeMillis();

        System.out.println("Adicionou " + limitLoop + " elementos no Array em: " + (timeEnd - timeInitial) + "ms");

        timeInitial = System.currentTimeMillis();

        for (int i = 0; i < limitLoop; i++) {
            arrayList.get(i);
        }

        timeEnd = System.currentTimeMillis();

        System.out.println("Tempo de leitura de " + limitLoop + " elementos do Array: " + (timeEnd - timeInitial) + "ms");
    }

}
