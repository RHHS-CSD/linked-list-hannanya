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
public class Train implements Comparable<Train> {

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    private Color color;
    private int type;

    @Override
    public String toString() {
        return "" + type;
    }

    public Train(Color color, int type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        //anything not of type Data is false
        if (!(o instanceof Train)) {
            return false;
        }
        //add code to properly compare

        return true;

    }

    @Override
    public int compareTo(Train o) {
        if (this.getType() - o.getType() == 0) {
            if (this.color.equals(o.color)) {
                return 0;
            } else {
                return -1;
            }
        }
        return this.getType() - o.getType();
    }
}
