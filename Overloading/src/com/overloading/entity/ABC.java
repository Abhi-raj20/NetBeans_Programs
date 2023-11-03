
package com.overloading.entity;

public class ABC {
        public void show(){
        System.out.println("show() called");
        }    
        public void show(int x,int y){
        System.out.println("show(int,int)called");
        }
        public void show(String x,String y){
        System.out.println("show(String,String)called");
        }
}
