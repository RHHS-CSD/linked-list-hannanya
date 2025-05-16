/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList{
    private Node head;
    private Node tail;

    /**
     * Return the size of the Linked List
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
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(Train item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return false;
        }
        
        // if head
        if (index == 0) {
            if (head != null) {
                head = head.node;
                return true;
            }
            else {
                System.out.println("List is empty");
            }
            return false;
        }
        
        Node current = head;
        int count = 0;
        
        // traverse to node
        while (current != null && count < index - 1) {
            current = current.node;
            count++;
        }
        
        // index out of bounds
        if (current == null || current.node == null) {
            System.out.println("Index out of bounds");
            return false;
        }
        
        // skip to next node to "remove"
        current.node = (current.node).node;
        return true;
    }
    
    /**
     * Swap the items m and n in the list
     * @param m first item to be swapped
     * @param n second item to be swapped
     */
    public void swap(int m, int n) {
        if (m == n) {
            return;
        }
        
        // make n the greater index for simplicity
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }
        
        // prev and current nodes for m and n
        Node m0 = null;
        Node m1 = head;
        Node n0 = null;
        Node n1 = head;
        
        // traverse to mth node
        for (int i = 0; m1 != null && i < m; i++) {
            m0 = m1;
            m1 = m1.node;
        }
        
        // traverse to nth node
        for (int i = 0; n1 != null && i < n; i++) {
            n0 = n1;
            n1 = n1.node;
        }
        
        if (m1 == null || n1 == null) {
            System.out.println("Invalid indices");
            return;
        }
        
        if (m0 != null) {
            m0.node = n1;
        }
        else {
            head = n1;
        }
        
        // swap pointers
        Node temp = m1.node;
        m1.node = n1.node;
        n1.node = temp;
    }

    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Train item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    @Override
    public Train get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(Train item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(Train item, int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
