
package com.OopConstractor.main;
import com.OopConstractor.entity.Engine;
public class AppMain 
{
    public static void main(String[] args)
    {
        //0-argument Constractor called
        Engine e1 = new Engine();
       System.out.println("e1's details are :-");
       e1.showEngineDetails();
      
       //Parameterized Constractor called
       Engine e2 = new Engine(1800,"Diesel");
       System.out.println("e2's details are :-");
       e2.showEngineDetails();
       
      
       
     
}
    
}