package com.java8fetuaresdemo.impl2;

import com.java8fetuaresdemo.interfaces.ABC;
public class Impl2 implements ABC {
    @Override
    public void print(){
    System.out.println("Impl2's print() called");
    }
    @Override
    public void show(){
    System.out.println("Impl2's show() called");
    }
}
