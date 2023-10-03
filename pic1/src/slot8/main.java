/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot8;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author chucken
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xTitle; 
        int xPrice, xPrice2; 
        int tc;
        xPrice2 = 0;
        System.out.println();
        System.out.println("Enter title: ");
        xTitle = sc.nextLine();
        System.out.println("Enter price: ");
        xPrice = sc.nextInt(); sc.nextLine();
        
        System.out.println("1. Test getTitle(): ");
        System.out.println("2. Test setprice(): ");
        
        System.out.println("Enter tc ( 1 or 2 ): ");
        tc = sc.nextInt(); sc.nextLine();
        
        bottle t = new bottle (xTitle,xPrice );
        if (tc==2) {
            System.out.println("Enter new price: ");
            xPrice2 = sc.nextInt(); sc.nextLine();
            t.setPrice(xPrice2);
            
        }
        System.out.println("OUTPUT: ");
        switch(tc) {
            case 1: 
                String u = t.getTittle();
                System.out.printf("%s\r\n",u);
                break;
                
            case 2:
                int v = t.getPrice();
                System.out.printf("%d\r\n",v);
                break;
                
                default:
                return;
        }
        System.out.println();
    }
         
}
