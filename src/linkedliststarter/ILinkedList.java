/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public interface ILinkedList {
    public String toString();
public int size();
public void clear();
public boolean remove(Train item);
public boolean remove(int index);
public int indexOf(Train item);
public Train get(int index);
public boolean add(Train item);
public boolean add(Train item, int index);
}
