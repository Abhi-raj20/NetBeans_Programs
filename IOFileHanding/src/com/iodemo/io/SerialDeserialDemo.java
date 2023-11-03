package com.iodemo.io;

import com.iodemo.bean.Employee;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDeserialDemo {
     private  File f1 = new File("C:\\Users\\dell\\dp.dal");
     
     public void writeData() {
          try(FileOutputStream fout = new FileOutputStream(f1);
                  ObjectOutputStream out = new ObjectOutputStream(fout)){
              Employee e1 = new Employee(123, "Abhi");
              Employee e2 = new Employee(124, "Sidhharth");
              Employee e3 = new Employee(125,"Deepak");
              
              out.writeObject(e1);
              out.writeObject(e2);
              out.writeObject(e3);
              
              System.out.println("Object saved in the " + "File" );
              
              
          }
          catch(IOException exc){
             exc.printStackTrace();
          }
     }
     
      public void readData() {
          try(FileInputStream fin = new FileInputStream(f1);
                  ObjectInputStream oin = new ObjectInputStream(fin)){
            
              while(true){
                  Employee e = (Employee) oin.readObject();
                  System.out.println(e);
                  }
             }
          catch(EOFException exc){
              System.out.println("All Object read from file");
          }
          catch(IOException | ClassNotFoundException exc){
             exc.printStackTrace();
          }
     }
}
