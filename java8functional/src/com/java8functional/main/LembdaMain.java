package com.java8functional.main;

import com.java8functional.interfaces.MathOp;
public class LembdaMain {
    public static void main(String[] arr)
    {
      MathOp ref1 = (int a,int b) -> {
          return(a+b);
      };
      System.out.println("Sum of 15 and 10 :"+ ref1.calculate(15, 10));
       
      ref1 = (a,b) -> a - b;
      System.out.println("Diffence of 15 and 10 :" + ref1.calculate(15,10));
    }
}
