package com.javahashCode.pojo;



public class Student {
         private int rollno;
         private String name;
    public Student(int rollno,String name) {
                this.rollno = rollno;
                this.name = name;
    }
    public Student()
    {
       
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return rollno+":"+name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.rollno;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
         Student s =(Student) obj;   //Downcasting
        return this.rollno == s.rollno;
    }
    
    
}
