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
        int count = 0;
        Node current = getHead();
        // traverse to end of list
        while (current != null) {
            count++;
            current = current.node;
        }
        return count;
    }

    /**
     * Reset / Empty the LinkedList
     */
    @Override
    public void clear() {
        setHead(null);
        setTail(null);
    }

    /**
     * Remove the first instance of item from the linked list
     *
     * @param item The item to be removed
     * @return true: if the item was found and removed false otherwise
     */
    @Override
    public boolean remove(Train item) {
        int index = indexOf(item);
        return remove(index);
    }

    /**
     * Remove the item from the particular index
     *
     * @param index The index of the item to remove
     * @return true: if the item was found and removed false otherwise
     */
    @Override
    public boolean remove(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return false;
        }

        // if head
        if (index == 0) {
            if (getHead() != null) {
                setHead(getHead().node);
                return true;
            } else {
                System.out.println("List is empty");
            }
            return false;
        }

        Node current = getHead();
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
     *
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
        Node m1 = getHead();
        Node n0 = null;
        Node n1 = getHead();

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
        } else {
            setHead(n1);
        }

        // swap pointers
        Node temp = m1.node;
        m1.node = n1.node;
        n1.node = temp;
    }

    /**
     * Returns the first found index of the given item
     *
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Train item) {
        Node search = getHead();
        if (getHead() == null) {
            return -1;
        }
        int count = 0;
        do {
            if (search.train.compareTo(item)==0) {
                return count;
            }
            search = search.getNode();
            count++;
        } while (search != null);
        return -1;
    }


/**
 * Retrieves the Data at the given index
 *
 * @param index The index to be retrieved
 * @return The data item, null if bad index
 */
@Override
public Train get(int index) {
        if (index <0) {
            return null;
        }
        Node search = getHead();
        for (int i = 0; i < index - 1; i++) {
            search = search.getNode();
            if (search==null) {
                return null;
            }
        }
        return search.train;
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
        if (getHead() != null) {
            getTail().setNode(n);
            setTail(n);
            return true;
        } else if (getHead() == null || getTail() == null) {
            setTail(n);
            setHead(n);
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
        if (getHead() == null) {
            setHead(n);
            setTail(n);
            return true;
        } else if (index==0) {
            n.setNode(getHead());
            setHead(n);
        } else if (index<0) {
            return false;
        }
        Node search = getHead();
        for (int i = 0; i < index - 1; i++) {
            search = search.getNode();
            if (search==getTail() && index>i+2) {
                return false;
            }
        }
        n.setNode(search.getNode());
        if (search.getNode() == null) {
            search.setNode(n);
            setTail(n);
            return true;
        } else {
            search.setNode(n);
            return false;
        }
    }
    
    public boolean join(SinglyLinkedList other) {
        getTail().setNode(other.getHead());
        setTail(other.getTail());
        return true;
    }

    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }
    
    public String toString() {
        String text = "";
        Node current = getHead();
        // traverse to end of list
        while (current != null) {
            text = text + current.train.getType();
            current = current.node;
        }
        return text;
    }
}
