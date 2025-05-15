/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

import java.awt.Color;

/**
 *
 * @author michael.roy-diclemen
 */
public class Train implements Comparable<Train>{
    
    private Color color;
    private int type;
    
    @Override
    public String toString(){
        return null;
    }
    
    public Train(Color color,int type) {
        this.color = color;
        this.type = type;
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Data is false
        if (! (o instanceof Train))
            return false;
        //add code to properly compare
        
        return true;
        
    }

    @Override
    public int compareTo(Train o) {
        return this.type - o.type;
    }
}
