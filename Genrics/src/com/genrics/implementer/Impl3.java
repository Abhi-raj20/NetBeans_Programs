package com.genrics.implementer;

import com.genrics.interfaces.PQR;

public class Impl3 implements PQR {

    @Override
    public void show(Object param) {
        System.out.println("show() called with" + " Object parameter : " + param);
    }
  }
