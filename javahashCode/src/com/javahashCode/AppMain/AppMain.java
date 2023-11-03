package com.javahashCode.AppMain;

import com.javahashCode.pojo.Student;

public class AppMain {
        public static void main(String[] args) {
          
            Student s1 = new Student(22,"Abhishek");
            System.out.println(s1);
            
            Student s2 = new Student(20,"Anurage");
            System.out.println(s2);
            
            if(s1.equals(s2))
                System.out.println("s1 and s2 are same");
            else
                System.out.println("s1 and s2 are not same");
            
            System.out.println("s1's hashCode :" + s1.hashCode());
            System.out.println("s2's hashCode :" + s2.hashCode());
    }
    
}
