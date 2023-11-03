package com.iodemo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteDemo {
     File f1 = new File("C:\\Users\\dell\\Desktop"+"\\Data.txt");
     
     public void writeData() {
         try(FileWriter writer = new FileWriter(f1)) {
                String data = "I Love my Country";
                writer.write(data);
                System.out.println("Data saved into the file ");
         }
         catch(IOException exc ){
             exc.printStackTrace();
         }
     }
     
     public void readCharByChar() {
     try(FileReader reader = new FileReader(f1)){
      int x = 0;
      String str = "" ;
      while((x = reader.read()) != -1) {
        str = str + (char) x;
      }
         System.out.println("data read from file :" + str);
     }
     catch(IOException exc){
      exc.printStackTrace();
     }
     }
     public void readLineByLine() {
      try(FileReader reader = new FileReader(f1);
              BufferedReader br = new BufferedReader(reader)){
          String str = "";
          System.out.println("data read from file : ");
          while((str = br.readLine()) != null  ) {
              System.out.println(str);
          }
      }
      catch(IOException exc){
      exc.printStackTrace();
     }
     }
     
     public void readInBulk() {
     try(FileReader reader = new FileReader(f1);
              BufferedReader br = new BufferedReader(reader)){
        char[] arr = new char[50];
        int count = 0;
        String str = "";
        
         System.out.println("data read form file :");
         while((count = br.read(arr))> 0) {
           str = new String(arr,0,count);
             System.out.println(str);
         }
     }
     catch(IOException exc){
      exc.printStackTrace();
     }
     }
}
