
package com.oopdemo.entity;


public class ABC {
    private int x;
    static private ABC obj = new ABC(35);
    
    private ABC(int x){
        this.x = x;
    }
    public void showData(){
      System.out.println("valu of x"+x);
    }

    public static ABC getInstance() {
        return obj;
    }

    
 
    
}
