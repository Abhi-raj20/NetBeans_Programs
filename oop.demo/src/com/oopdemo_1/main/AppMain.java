
package com.oopdemo_1.main;
import com.oopdemo_1.entity.Engine;
public class AppMain 
{
    public static void main(String[] args)
    {
       Engine e1 = new Engine();
       e1.manufactureEngine();
       System.out.println("e1's details are :-");
       e1.showEngineDetails();
      
       Engine e2 = new Engine();
       e2.manufactureEngine(1500,"diesel");
       System.out.println("e2's details are :-");
       e2.showEngineDetails();
       
       e2.changecapacity(1800);
       Engine.changeCompany("kirloskar");
       
       System.out.println("Now,e1's details are:-");
       e1.showEngineDetails();
       
       System.out.println("Now,e2's details are:-");
       e2.showEngineDetails();
}
    
}