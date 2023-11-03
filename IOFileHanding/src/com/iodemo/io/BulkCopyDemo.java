package com.iodemo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BulkCopyDemo {
         private  File Srcfile = new File("‪C:\\Users\\dell\\data.txt");
         private  File destfile = new File("C:\\Users\\dell\\dp.txt");
         
         public void copyData() {
           try(FileInputStream fin = new FileInputStream(Srcfile);
                   BufferedInputStream bin = new BufferedInputStream(fin);
                   FileOutputStream fout = new FileOutputStream(destfile);
                   BufferedOutputStream bout = new BufferedOutputStream(fout)){
                        
                      byte[] arr = new byte[1024];
                      int count = 0;
                      while((count = bin.read(arr)) > 0)
                      {
                         bout.write(arr,0,count);
                      }
           }
           catch(IOException exc) {
              exc.printStackTrace();
           }
         }
}
