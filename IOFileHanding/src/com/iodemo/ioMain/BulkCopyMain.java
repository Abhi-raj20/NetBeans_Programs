package com.iodemo.ioMain;

import com.iodemo.io.BulkCopyDemo;
import java.time.LocalDateTime;

public class BulkCopyMain {
         public static void main(String[] args) {
            
             BulkCopyDemo obj = new BulkCopyDemo();
             LocalDateTime id = LocalDateTime.now();
             System.out.println("File copy started at :" + id);
             obj.copyData();
             id = LocalDateTime.now();
             System.out.println("File copy ended at : " + id);
             
    }
    
}
