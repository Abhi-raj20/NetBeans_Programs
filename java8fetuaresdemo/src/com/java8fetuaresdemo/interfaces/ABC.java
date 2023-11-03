package com.java8fetuaresdemo.interfaces;

public interface ABC {
    default void show()
    {
    System.out.println("ABC's show() called");
    }
    static void display()
    {
            System.out.println("ABC's display() called");
    }
    void print();
}
