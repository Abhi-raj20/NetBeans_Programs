package com.iodemo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOStreamDemo {
         private File f1 = new File("C:\\Users\\dell\\Desktop"+"\\Data.txt");
         
         public void writeData() {
            try(FileOutputStream fout = new FileOutputStream(f1) ){
              String data = " I Love my Country ";
              byte[] arr = data.getBytes();
              fout.write(arr);
              
                System.out.println("data saved into the file ");
            }
            catch(IOException exc){
              exc.printStackTrace();
            }
         }
         public void readByByte() {
            try(FileInputStream fin = new FileInputStream(f1)){
                int x = 0;
                String str = "";
                while((x=fin.read()) != -1) {
                   str = str + (char) x;
                }
                System.out.println("data read from file : " + str);
            }
            catch(IOException exc){
              exc.printStackTrace();
            }
         }
}
