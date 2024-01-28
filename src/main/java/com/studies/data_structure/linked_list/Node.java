package com.studies.data_structure.linked_list;
/*
*  Um nó armazena seu próprio valor e uma referência para seu próximo nó se existir, caso contrário o próximo nó é dado como valor null.
*  Este nó será utilizado para implementar a Lista Ligada, seu valor pode ser definido para um tipo específico ou um tipo genérico.
*  Neste caso como estamos usando POO e o conceito de encapsulamento, implementamos os getters e setters dos atributos da Classe, e
   também fizemos a implementação de um método auxiliar que retorna um booleano e avalia a condição se o atributo 'next' é null ou não.
* */
public class Node {

    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String newValue) {
        this.value = newValue;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    @Override
    public String toString() {
        return "value: "
                + value
                + "\nnextNode -> "
                + "\n"
                + next;
    }

}
