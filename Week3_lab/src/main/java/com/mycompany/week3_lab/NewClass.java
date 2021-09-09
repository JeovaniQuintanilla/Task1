
package com.mycompany.week3_lab;

/**
 *
 * @author quint
 */


public class NewClass {
    private int lengthName(String b){
        int e = b.length();
        
        return e;
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        String b = "jeo";
        int x = nc.lengthName(b);
        System.out.print(x);
        
    }
    
}
