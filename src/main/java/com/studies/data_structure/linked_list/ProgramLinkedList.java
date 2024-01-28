package com.studies.data_structure.linked_list;

public class ProgramLinkedList {

    public static void main(String[] args) {
        MyLinkedList<String> listNames = new MyLinkedList<String>();
        MyLinkedList<Integer> salarys = new MyLinkedList<Integer>();
        MyLinkedList<Boolean> listBool = new MyLinkedList<Boolean>();

        listNames.addNode("Saulo");
        salarys.addNode(1000);
        listBool.addNode(false);

        listNames.addNode("Gabi");
        salarys.addNode(500);
        listBool.addNode(true);

        listNames.addNode("Artur");
        salarys.addNode(1500);
        listBool.addNode(false);

        System.out.println("Quant. Nomes: " + listNames.getSize());
        System.out.println("Quant. Salario: " + salarys.getSize());
        System.out.println("Quant. Boolean: " + listBool.getSize());
        for (int i = 0; i < listNames.getSize(); i++) {
            System.out.println("");
            System.out.println(listNames.getNodeByPos(i).getValue());
            for (int s = i; s <= i; s++) {
                System.out.println(salarys.getNodeByPos(s).getValue());
                for (int b = s; b <= s; b++) {
                    System.out.println(listBool.getNodeByPos(b).getValue());
                }
            }
        }
    }

}
