package com.ExceptionHandling.Main;

import java.util.Scanner;

public class EceptionHandlingMain2 {
         public static void main(String[] args) {
           
              String input = "I am Fine.";
              Scanner scanner = new Scanner(System.in);
              
              System.out.print("Enter index of charater"+"to be displayed from input : ");
              int  position = scanner.nextInt();
             
              try{
              System.out.println("charater present in input"+ "at given index : " + input.charAt(position));
              }
              catch(StringIndexOutOfBoundsException exc){
                  
                  System.out.println("Please enter index" + "between (0-9)");
              }
              System.out.println("HELLO");
    }
    
}
