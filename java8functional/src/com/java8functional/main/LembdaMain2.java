
package com.java8functional.main;

import com.java8functional.interfaces.Message;

public class LembdaMain2 {
    public static void main(String[] args) {
        
   
      Message ref = () -> System.out.println("hi");
      ref.showMessage();
      
      ref = () -> {
          System.out.println("hello");
          System.out.println("I am fine");
          
      };
      ref.showMessage();
}
 }
