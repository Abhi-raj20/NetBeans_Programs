package com.InheritanceDemo.main;
import com.InharitanceDemo.entity.Manager;


public class AppMain {
 
  public static void main(String[] args){
     Manager mgr = new Manager();
     mgr.CalculateSalary();
     mgr.calculateIncentive();
  }
}
