package com.AppMain;

import com.p1.Student;
import com.p1.p2.Message;

public class AppMain extends Student
{
     public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
//        s1.display();  compile time error
//          s1.print();     compile time error
        AppMain obj = new AppMain();
//          obj.display();      compile time error
          obj.print();
          
        Message msg = new Message();
        msg.show();
        
        }
    
}
