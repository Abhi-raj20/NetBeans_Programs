package com.ExceptionHandling.Main;

import java.util.Scanner;

public class EceptionHandlingMain3 {
         public static void main(String[] args) {
           
              String input = "I am love my country.";
              Scanner scanner = new Scanner(System.in);
              
              System.out.print("Enter index of charater"+"to be displayed from input : ");
              int  position = scanner.nextInt();
             
              try{
              System.out.println("charater present in input"+ "at given index : " + input.charAt(position));
                  System.out.println(10/0);
              }
              catch(Exception exc){         // ganric Exception
                  
                  System.out.println("Exception is Handling");
                  System.out.println(exc.getMessage());
                  exc.printStackTrace();
              }
              System.out.println("HELLO");
    }
    
}
