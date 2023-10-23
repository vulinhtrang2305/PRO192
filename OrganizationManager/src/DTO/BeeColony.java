/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chucken
 */
public class BeeColony extends Colony implements Role {
    protected String type;
   
    public BeeColony() {
    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "The colony's type is: " + this.type + " ,size is about: " + this.size + "And the place is: " + this.place;
    }

    @Override
    public void createWork() {
        System.out.println("Worker bees perform all the work of the bees ");
    }
}
