/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList {

    private Node head;
    private Node tail;

    /**
     * Return the size of the Linked List
     *
     * @return an int representing the size
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Reset / Empty the LinkedList
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove the first instance of item from the linked list
     *
     * @param item The item to be removed
     * @return true: if the item was found and removed false otherwise
     */
    @Override
    public boolean remove(Train item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove the item from the particular index
     *
     * @param index The index of the item to remove
     * @return true: if the item was found and removed false otherwise
     */
    @Override
    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the first found index of the given item
     *
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Train item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retrieves the Data at the given index
     *
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    @Override
    public Train get(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Add the gen item to the end of the linked list
     *
     * @param item Item to add
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(Train item) {
        Node n = new Node(item, null);
        if (head != null) {
            tail.setNode(n);
            tail = n;
            return true;
        } else if (head == null || tail == null) {
            tail = n;
            head = n;
            return true;
        }
        return false;
    }

    /**
     * Add the gen item to the linked list at the given position
     *
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(Train item, int index) {
        Node n = new Node(item, null);
        if (head == null) {
            head = n;
            tail = n;
            return true;
        } else if (index==0) {
            n.setNode(head);
            head = n;
        }
        Node search = head;
        for (int i = 0; i < index - 1; i++) {
            search = search.getNode();
        }
        n.setNode(search.getNode());
        if (search.getNode() == null) {
            search.setNode(n);
            tail = n;
            return false;
        } else {
            search.setNode(n);
            return false;
        }
    }
    
    public boolean join(SinglyLinkedList other) {
        tail.setNode(other.head);
        tail = other.tail;
        other.head = head;
        return true;
    }

}
