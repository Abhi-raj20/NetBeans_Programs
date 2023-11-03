
package com.OopConstractor.entity;

public class Engine
{
    private int Capacity;
    private String Fuel;
    
    //0-argument constructor
    public Engine()
    {
       Capacity = 1200;
       Fuel = "petrol";
    }
    
    //Parameterized Constructor
    public Engine(int Capacity,String Fuel)
    {
       this.Capacity = Capacity;
       this.Fuel = Fuel;
    }
   
    public void showEngineDetails()
    {
       System.out.println("capacity :"+ Capacity +" fuel :"+ Fuel);
    }
}
