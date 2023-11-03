package com.genrics.implementer;

import com.genrics.interfaces.PQR;

public class Impl2 implements PQR<String> {

    @Override
    public void show(String param) {
         System.out.println("show() called with" + " String param : " + param);
    }
   }
