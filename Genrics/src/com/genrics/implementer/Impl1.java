package com.genrics.implementer;

import com.genrics.interfaces.PQR;

public class Impl1<T> implements PQR<T> {

    @Override
    public void show(T param) {
         System.out.println("show() called with" + " parameter : " + param);
    }    
}
