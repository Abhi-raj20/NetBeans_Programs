
package com.overloading.main;
import com.overloading.entity.ABC;
public class Appmain {
  public static void main(String[] args){
        ABC obj = new ABC();
        obj.show("hi","hello");
        obj.show();
        obj.show(12,23);
  }  
}
