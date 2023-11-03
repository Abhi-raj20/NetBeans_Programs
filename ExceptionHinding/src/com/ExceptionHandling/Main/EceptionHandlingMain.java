package com.ExceptionHandling.Main;

import java.util.Scanner;

public class EceptionHandlingMain {
        public static void main(String[] args) {
              
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Please Enter two Number : ");
            int fnum = scanner.nextInt();
            int snum = scanner.nextInt();
            try {
            System.out.println("two number is division : " + fnum/snum);
            }
            catch(ArithmeticException exc){
                System.out.println("Number cann't divide by Zero");
            }
            System.out.println("HELLO");       
    }
    
}
