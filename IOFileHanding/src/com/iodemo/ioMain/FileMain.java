package com.iodemo.ioMain;

import java.io.File;
import java.util.Date;

public class FileMain {
           public static void main(String[] args) {
        File f1 = new File("C:\\Users\\dell\\Desktop"+"\\Data.txt");
               System.out.println("name of file :" + f1.getName());
               System.out.println("Size of file in bytes :" + f1.getParent());
               System.out.println("parent folder of files : " + f1.exists());
               System.out.println("is file present : " + f1.isFile());
               System.out.println("is f1 readable : " + f1.canRead());
               System.out.println("is f1 writable : " + f1.canWrite());
               System.out.println("is f1 executable : " + f1.canExecute());
               
               long milis = f1.lastModified();
               Date d = new Date(milis);
               
               System.out.println("f1 was last modified " + "at :" + d);
    }
    
}
