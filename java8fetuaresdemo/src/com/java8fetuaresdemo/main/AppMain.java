package com.java8fetuaresdemo.main;

import com.java8fetuaresdemo.impl1.impl1;
import com.java8fetuaresdemo.impl2.Impl2;
import com.java8fetuaresdemo.interfaces.ABC;
public class AppMain {
    public static void main(String[] arr)
    {
       ABC ref1 = new impl1();
       ref1.print();
       ref1.show();
       //ref1.display();          Compile time error
       
       ABC ref2 = new Impl2();
       ref2.print();
       ref2.show();
      // ref2.display();         Compile time error
       ABC.display();
    }
}
