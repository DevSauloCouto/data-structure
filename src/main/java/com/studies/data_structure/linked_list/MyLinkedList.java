package com.studies.data_structure.linked_list;
/*
*  Uma Lista Ligada/Encadeada possui referências para seu primeiro Nó e seu último Nó, também adicionamos uma referência do tipo int para
   armazenar o tamanho da lista.
*  Algumas possíveis operações na Lista Ligada: adicionar um novo Nó, remover um Nó, buscar um Nó com base em uma posição ou em um valor do
   próprio Nó.
*  Para percorrer uma Lista Ligada/Encadeada devemos ter uma referência para o primeiro Nó da mesma, e a partir desta referência vamos navegar
   entre os próximos Nós de cada Nó acessado respectivamente até chegar a um valor 'null' que indica o fim da lista pois o último Nó não conhece
   outro Nó depois dele.
*
* */
public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> last;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getLast() {
        return this.last;
    }

    public int getSize() {
        return this.size;
    }

    public void addNode(T value) {
        Node<T> node = new Node<T>(value);

        if (this.head == null && this.last == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.setNext(node);
            this.last = node;
        }

        this.size++;
    }

    private boolean isHeadNode(Node<T> node) {
        return this.head == node;
    }

    private boolean isLastNode(Node<T> node) {
        return this.last == node;
    }

    public void removeNode(T value) {
        Node<T> previous = null;
        Node<T> actual = this.head;

        for (int i = 0; i < size; i++) {
            if (actual.getValue().equals(value)) {
                if (this.size == 1) {
                    this.head = null;
                    this.last = null;

                } else if (isHeadNode(actual)) {
                    this.head = actual.getNext();
                    actual.setNext(null);

                } else if (isLastNode(actual)) {
                    this.last = previous;
                    this.last.setNext(null);

                } else {
                    previous.setNext(actual.getNext());
                    actual = null;
                }
                this.size--;
                break;
            }
            previous = getNodeByPos(i);
            actual = actual.getNext();
        }
    }

    public Node<T> getNodeByPos(int position) {
        Node<T> actual = this.head;

        if (position > this.size - 1) {
            throw new RuntimeException("Index invalid");
        }

        for (int i = 0; i < position; i++) {
            if (actual.hasNext()) {
                actual = actual.getNext();
            }
        }

        return actual;
    }

    public Node<T> getNodeByValue(T value) {
        Node<T> actual = this.head;

        while (actual != null) {
            if (actual.getValue().equals(value)) {
                return actual;
            }
            actual = actual.getNext();
        }

        throw new RuntimeException("Not Found Element in Linked List");
    }

    public IteratorLinkedList<T> iterator() {
        return new IteratorLinkedList<T>(this.head);
    }

}
