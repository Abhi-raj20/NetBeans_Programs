package com.campuse.data;

 public class Students extends Person {
           
             int rollno;
             String breanch;
             int Semester;
             
        public Students(String name, int age, String address, int rollno, String branch,int semester) {
            
            super(name, age, address);
            this.rollno = rollno;
            this.breanch = branch;
            this.Semester = semester;
            
            System.out.println("name :"+name+"\nAge : "+age+"\n Address"+address+"\nRollno :"+rollno+"\nBranch: "+branch+"\nSemester : "+semester);
            
        }
}

