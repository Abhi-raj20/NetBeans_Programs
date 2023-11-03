package com.UserDefineException.Main;

import com.UserDefineException.entity.Voter;
import com.UserDefineException.exception.AgeException;

public class VoterMain {
              public static void main(String[] args) {
           
                  Voter v1 = new Voter(21,"Abhishek");
                  Voter v2 = new Voter(17,"yogendra");
                  
                  try {
                  v1.checkAge();
                  v2.checkAge();
                  }
                  catch(AgeException exc) {
                       System.out.println(exc.getMessage());
                  }
    }
    
}
