package com.Stirngdemo.main;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringMain {
          public static void main(String[] args) {
             
              String s1 = "hi, how are you?";
              
              String s2 = "I am fine";
              
              System.out.println("Total no. of characters"+ " in s1: "+s1.length());
             
              System.out.println("is  how present in s1 :" + s1.contains("how"));
             
              System.out.println("how is present in s1 at " + "index : "+ s1.indexOf("how"));
              
              System.out.println("hello is present in s2 "+ "at index :"+ s2.indexOf("hello"));
             
              System.out.println("let's say : " + s1.substring(0,2));
             
              System.out.println("let's say : "+s2.substring(5));
              
              System.out.println("let's replace h with H : " + s1.replace('h', 'H'));
              
              System.out.println("Is yes and YES equals : " + "yes".equals("YES"));
              
              System.out.println("Now , is yes and YES equals : " + "YES".equalsIgnoreCase("YES"));
              
              System.out.println("let's print everything  in" + " uppercase : " + s1.toUpperCase());
              
              System.out.println("let's print everything in" + " lowercase : " +s2.toLowerCase());
              
              String[] arr = s1.split(" ");
              System.out.println("Individual string from" + " s1 are :- ");
              
              for(String s : arr)
                         System.out.println(s);
              
              StringTokenizer tokenizer = new StringTokenizer(s2);
               System.out.println("Individual string from s2 " + " are :- ");
               
             while(tokenizer.hasMoreTokens()) {
                 System.out.println(tokenizer.nextToken());
             }
             
             StringJoiner joiner = new StringJoiner(" | ");
             joiner.add("Abhishek");
             joiner.add("Anurag");
             joiner.add("Atul");
             joiner.add("Yogendra");
             joiner.add("Prateek");
             joiner.add("Prince");
             
              System.out.println(joiner);
             
              
              
    }
    
}
