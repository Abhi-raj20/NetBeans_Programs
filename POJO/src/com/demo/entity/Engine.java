
package com.demo.entity;


public class Engine {
    
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

    public int getCapacity() {
        return Capacity;
    }

    public String getFuel() {
        return Fuel;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public void setFuel(String Fuel) {
        this.Fuel = Fuel;
    }
   
   
}


