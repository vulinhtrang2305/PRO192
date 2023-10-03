/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baimau2;

/**
 *
 * @author chucken
 */
public class brick {
    protected String place;
    protected int price;

    public brick() {
    }

    public brick(String place, int price) {
        this.place = place;
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return place + ", " + price;
    }
    
    
}
