/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pic1;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author chucken
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xdesign; 
        int xPower, xPower2; 
        int tc;
        xPower2 = 0;
        System.out.println();
        System.out.println("Enter Design: ");
        xdesign = sc.nextLine();
        System.out.println("Enter Power: ");
        xPower = sc.nextInt(); sc.nextLine();
        
        System.out.println("1. Test getDesign(): ");
        System.out.println("2. Test setPower(): ");
        
        System.out.println("Enter tc ( 1 or 2 ): ");
        tc = sc.nextInt(); sc.nextLine();
        
        Engine t = new Engine(xdesign,xPower );
        if (tc==2) {
            System.out.println("Enter new Power: ");
            xPower2 = sc.nextInt(); sc.nextLine();
            t.setPower(xPower2);
            
        }
        System.out.println("OUTPUT: ");
        switch(tc) {
            case 1: 
                String u = t.getDesigner();
                System.out.printf("%s\r\n",u);
                break;
                
            case 2:
                int v = t.getPower();
                System.out.printf("%d\r\n",v);
                break;
                
                default:
                return;
        }
        System.out.println();
    }
}
