package com.java8functional.main;

import com.java8functional.interfaces.MathOp;

public class LembdaMain5 {
            public static void main(String[] args) {
             
                MathOp ref = LembdaMain5 :: Perform;   //method refrence called
//                MathOp ref = new LembdaMain5() :: Perform;    //object refrence called
                
                System.out.println("Sum of 15 and 10 :" + ref.calculate(15, 10));
                
               
    }
             static int Perform(int a,int b)       //while object refrence is called be removeing static variable
                {
                   return (a+b);
                }
}
