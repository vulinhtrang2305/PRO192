/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baimau2;

import java.util.Scanner;

/**
 *
 * @author chucken
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xPlace; 
        int xPrice, xColor;
        int tc;
        System.out.println();
        System.out.print("Enter place: ");
        xPlace = sc.nextLine();
        System.out.print("Enter price: ");
        xPrice = sc.nextInt(); sc.nextLine();
        System.out.println("Enter Color: ");
        xColor = sc.nextInt(); sc.nextLine();
        System.out.println("1. Test toString(): ");
        System.out.println("2. Test setData(): ");
        System.out.println("3. Test getValue(): ");
        
        System.out.print("Enter tc (1,2,3): ");
        tc = sc.nextInt(); sc.nextLine();
        System.out.println("OUTPUT: ");
        switch (tc) {
            case 1: 
               brick all = new brick (xPlace, xPrice);
               System.out.println("all");
               brick a12 = new SpecBrick(xPlace, xPrice, xColor);
               System.out.println(a12);
               break;
  
            
            case 2: 
                SpecBrick b2 = new SpecBrick(xPlace, xPrice, xColor);
                b2.setData();
                String v2 = b2.getPlace();
                int k2 = b2.getPrice();
                System.out.printf("%s, %d\n",v2, k2);
                break;
                
            case 3:
                SpecBrick b3 = new SpecBrick(xPlace, xPrice, xColor);
                int v3 = b3.getValue();
                System.out.printf("%d\n",v3);
                break;
            default:
                break;
        }
        System.out.println();
    }
}
