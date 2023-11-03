
package com.demo.Appmain;

import com.demo.entity.Engine;
import java.util.Scanner;


public class Appmain {
   public static void main(String[] args)
    {
       Scanner Sc = new Scanner(System.in);
       Engine arr[] = new Engine[3];
       
       for(int i=0; i<arr.length; i++)
       {
        System.out.print("Enter Capacity"+"for Engine"+(i+1)+":");
        int cap = Sc.nextInt();
        System.out.print("Enter Fuel"+"for Engine"+(i+1)+":");
        String f = Sc.next();
        
        //Engine e = new Engine();
        //arr[i]=e;
        
        arr[i] = new Engine(cap,f);
        
        /*
          Engine e = new Engine();
          e.setcapacity(cap);
          e.setfuel(f);
          arr[i]=e;
        */
       }
       System.out.println("All Engine are :-");
       for(Engine e : arr)
       {
         System.out.println(e.getCapacity()+":"+e.getFuel());
       }
        

        
       }
    }   

