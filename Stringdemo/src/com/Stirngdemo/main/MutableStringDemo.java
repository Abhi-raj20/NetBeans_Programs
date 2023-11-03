package com.Stirngdemo.main;

public class MutableStringDemo {
       public static void main(String[] args) {
        
           StringBuilder sb = new StringBuilder("abc");
           System.out.println(sb);
         
            sb.append("pqr");
           System.out.println(sb);
          
           sb.reverse();
           System.out.println(sb);
           
           sb.replace(0, 3, "ABC");
           System.out.println(sb);
          
            
    }
    
}
