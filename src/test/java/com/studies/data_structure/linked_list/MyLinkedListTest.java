package com.studies.data_structure.linked_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    MyLinkedList<Integer> linkedList;

    @BeforeEach
    public void setup() {
        linkedList = new MyLinkedList<>();
    }

    @AfterEach
    public void tearDown() {
        linkedList = null;
    }

    @Test
    @DisplayName("should return size 0 to LinkedList without element and return null to head Node and last Node")
    public void withoutNode() {
        assertEquals(0, linkedList.getSize());
        assertNull(linkedList.getHead());
        assertNull(linkedList.getLast());
    }

    @Test
    @DisplayName("should add five elements and return size 5")
    public void addFiveNodes() {
        addElements();

        assertEquals(5, linkedList.getSize());
        assertEquals(0, linkedList.getHead().getValue());
        assertEquals(4, linkedList.getLast().getValue());
    }

    @Test
    @DisplayName("should remove last Node")
    public void removeLastNode() {
        addElements();

        linkedList.removeNode(4);

        assertEquals(3, linkedList.getLast().getValue());
        assertEquals(4, linkedList.getSize());
    }

    @Test
    @DisplayName("should remove head Node")
    public void removeHeadNode() {
        addElements();

        linkedList.removeNode(0);

        assertEquals(1, linkedList.getHead().getValue());
        assertEquals(4, linkedList.getSize());
    }

    @Test
    @DisplayName("should add one Node and it must be stores in both the head and the last")
    public void addOneNode() {
        Integer element = 10;
        linkedList.addNode(element);

        assertEquals(element, linkedList.getHead().getValue());
        assertEquals(element, linkedList.getLast().getValue());
        assertEquals(1, linkedList.getSize());
    }

    @Test
    @DisplayName("should add three Node and checks if next Node is correct")
    public void verifyNextNode() {
        Integer element1 = 10;
        Integer element2 = 20;
        Integer element3 = 30;

        linkedList.addNode(element1);
        linkedList.addNode(element2);
        linkedList.addNode(element3);

        assertEquals(element1, linkedList.getHead().getValue());
        assertEquals(element3, linkedList.getLast().getValue());

        assertEquals(element2, linkedList.getNodeByValue(10).getNext().getValue());
        assertNotEquals(element1, linkedList.getNodeByValue(10).getNext().getValue());

        assertEquals(element3, linkedList.getNodeByValue(20).getNext().getValue());
        assertNotEquals(element3, linkedList.getNodeByValue(10).getNext().getValue());

        assertNull(linkedList.getNodeByValue(30).getNext());
    }

    @Test
    @DisplayName("should a Node by value in parameter")
    public void returnNodeByValue() {
        addElements();

        assertEquals(0, linkedList.getNodeByValue(0).getValue());
        assertEquals(1, linkedList.getNodeByValue(1).getValue());
        assertEquals(2, linkedList.getNodeByValue(2).getValue());
        assertEquals(3, linkedList.getNodeByValue(3).getValue());
        assertEquals(4, linkedList.getNodeByValue(4).getValue());
    }

    private void addElements() {
        for (int i = 0; i < 5; i++) {
            linkedList.addNode(i);
        }
    }

}