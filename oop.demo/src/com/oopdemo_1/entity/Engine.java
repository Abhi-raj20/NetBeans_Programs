
package com.oopdemo_1.entity;

public class Engine
{
    private int capacity;
    private String fuel;
    private static String Company = "fial";
    public void manufactureEngine()
    {
       capacity=120;
       fuel="petrol";
    }
    public void manufactureEngine(int cap,String f)
    {
       capacity = cap;
       fuel = f;
    }
    public void changecapacity(int cap)
    {
     capacity = cap;
    }
    public static void changeCompany(String comp)
    {
        Company = comp;
    }
    public void showEngineDetails()
    {
       System.out.println("capacity :"+capacity+" fuel :"+fuel+" Company :"+Company);
    }
}
