/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2Slot8;

import java.util.Scanner;

/**
 *
 * @author chucken
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xLabel; 
        int xType, xStep;
        int tc;
        System.out.println();
        System.out.print("Enter Label: ");
        xLabel = sc.nextLine();
        System.out.print("Enter Type: ");
        xType = sc.nextInt(); sc.nextLine();
        System.out.println("Enter Step: ");
        xStep = sc.nextInt(); sc.nextLine();
        System.out.println("1. Test toString(): ");
        System.out.println("2. Test setData(): ");
        System.out.println("3. Test getValue(): ");
        
        System.out.print("Enter tc (1,2,3): ");
        tc = sc.nextInt(); sc.nextLine();
        System.out.println("OUTPUT: ");
        
        switch (tc) {
            case 1: 
               Robot all = new Robot(xLabel, xType);
               System.out.println(all);
               Robot a12 = new SpecRobot(xLabel, xType, xStep);
               System.out.println(a12);
               break;
  
            
            case 2: 
                SpecRobot b2 = new SpecRobot(xLabel, xType, xStep);
                b2.setData();
                String v2 = b2.getLabel();
                int k2 = b2.getType();
                System.out.printf("%s, %d\n",v2, k2);
                break;
                
            case 3:
                SpecRobot b3 = new SpecRobot(xLabel, xType, xStep);
                int v3 = b3.getStep();
                System.out.printf("%d\n",v3);
                break;
            default:
                break;
        }
        System.out.println();
    }
}
