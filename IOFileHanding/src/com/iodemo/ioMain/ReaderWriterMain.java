package com.iodemo.ioMain;

import com.iodemo.io.ReadWriteDemo;

public class ReaderWriterMain {
      public static void main(String[] args) {
        ReadWriteDemo obj = new ReadWriteDemo();
//        obj.writeData();
        obj.readCharByChar();
        obj.readLineByLine();
        obj.readInBulk();
    }
    
}
