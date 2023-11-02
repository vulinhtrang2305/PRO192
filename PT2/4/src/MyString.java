/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chucken
 */
public class MyString implements IString{
    
    public static boolean check (String n) {
        int count = 0;
        StringBuilder isPa = new StringBuilder();
        if(isPa.reverse() == isPa) {
            count ++;
        }
        return count>=2;
    }
    
    @Override
    public int f1(String str) {
        int sum = 0;
        String words[] = str.split(" ");
        for (int i = 0; i<str.length(); i++) {
            if(!(check(words[i])) && words.length >=2) {
                sum+=words.length;
            }
        }
        return sum;
    }

    @Override
    public String f2(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
