/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baimau2;

/**
 *
 * @author chucken
 */
public class SpecBrick extends brick {
    protected int color;

    public SpecBrick() {
    }

    public SpecBrick(String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color; 
    }

    public void setData () {
        super.setPlace(place.substring(0,2)+ "BCA" + place.substring(2));
    }
   
    public int getValue(){
        if (color > 7) return price +9;
        else {
            return price + 6;
        }
    }    
}
