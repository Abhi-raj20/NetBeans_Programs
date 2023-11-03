package com.java8functional.main;

import com.java8functional.interfaces.EvenOdd;


public class LembdaMain3 {
    public static void main(String[] args) {
        
    
      EvenOdd ref = x -> x%2==0; 
      System.out.println("Is 23 Even : "+ ref.checkEven(23));
      System.out.println("Is 26 Even : "+ ref.checkEven(26));
   }
    
}