/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststarter;

import java.awt.Color;

/**
 *
 * @author michael.roy-diclemen
 */
public class LinkedListStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is a shared space for you to do some testing  It will also likely be the source of lots of conflicts if you're not careful.
        SinglyLinkedList sli1 = new SinglyLinkedList();
        Node nod1 = new Node(new Train(Color.WHITE, 2), null);
        Node nod2 = new Node(new Train(Color.PINK, 1), nod1);
        sli1.setHead(nod2);
        sli1.setTail(nod1);
        System.out.println(sli1.size());
        sli1.add(new Train(Color.BLACK, 3));
        sli1.add(new Train(Color.BLUE, 1), 2);
        System.out.println(sli1.toString());
        SinglyLinkedList sli2 = new SinglyLinkedList();
        Node nod3 = new Node(new Train(Color.YELLOW, 2), null);
        Node nod4 = new Node(new Train(Color.GREEN, 1), nod3);
        sli2.add(new Train(Color.YELLOW, 2));
sli2.add(new Train(Color.GREEN, 1));
//sli2.setHead(nod4);
      //  sli2.setTail(nod3);
        sli1.join(sli2);
        System.out.println(sli1.toString());
        System.out.println(sli1.get(4).getType());
        System.out.println(sli1.indexOf(new Train(Color.BLUE, 1)));
        System.out.println(sli1.toString());
        sli1.remove(0);
        System.out.println("hi" + sli1.toString());
        sli1.remove(new Train(Color.YELLOW, 2));
        System.out.println(sli1.toString());
        sli1.swap(0,1);
        System.out.println(sli1.toString());
        sli1.clear();
        System.out.println(sli1.toString());
    }

}
