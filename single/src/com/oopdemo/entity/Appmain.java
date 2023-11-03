
package com.oopdemo.entity;


public class Appmain {
    
    public static void main(String[] args){
          ABC ref1 = ABC.getInstance();
          ref1.showData();
            ABC ref2 = ABC.getInstance();
          ref2.showData();

          
    }
}
