package com.iodemo.ioMain;

import com.iodemo.io.SerialDeserialDemo;

public class SerialMain {
     public static void main(String[] args) {
        SerialDeserialDemo obj = new SerialDeserialDemo();
        obj.writeData();
        obj.readData();
    }
    
}
