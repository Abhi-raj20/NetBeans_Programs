package com.ExceDemo.main;

import java.io.FileWriter;
import java.io.IOException;

public class fileMain {
            public static void main(String[] args) {
        try(FileWriter Writer = new FileWriter("C:\\Users\\dell\\Desktop\\demo.txt")){
        
        Writer.write("I love my Country India");
            System.out.println("Data Saved into the file");
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
            
        }
    
}
