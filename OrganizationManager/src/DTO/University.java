/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chucken
 */
public class University extends Organization{
    protected String name;

    public University() {
    }
    
    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    public void enroll() {
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    
    public void educate() {
        System.out.println("provide education at university standard");
    }

    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge";
    }    

    @Override
    public void communucateByTool() {
        System.out.println("In the university, people communicate by voice");
    }
}