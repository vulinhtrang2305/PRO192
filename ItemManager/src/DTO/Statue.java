/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author chucken
 */
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int value, String creator,int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void output(){
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Weight: ");
        this.weight = sc.nextInt();
        
        System.out.println("Enter Colour: ");
        this.colour = sc.nextLine();
    }
}
