package com.campuse.data;

public class Faculty  extends Person {
      
        int facultyId;
       public  double salary;
        String branch;
      public Faculty(String name,int age,String address,int facultyId,double salary,String branch){
          
          super(name, age , address);
           this.facultyId = facultyId;
           this.salary = salary;
           this.branch = branch;
      
            System.out.println("name :"+name+"\nAge : "+age+"\n Address"+address+"\nFaculty Id :"+facultyId+"\nBranch: "+branch+"\nSalary : "+salary);
           
         
      }
}