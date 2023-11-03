package com.UserDefineException.entity;

import com.UserDefineException.exception.AgeException;

public class Voter {
         private int age;
         private String name;
         
      public Voter(int age, String name){
            this.age = age;
            this.name = name;
      } 
      public void checkAge() throws AgeException {
      
          if(age < 18) {
              throw new AgeException(name+" is not Eligible"+"for voting as age<18");
          }
          else {
              System.out.println(name+" is Eligible for Voting");
          }
      }
}
