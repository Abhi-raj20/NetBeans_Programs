package com.campus.acadmics;

import com.campus.account.Fess;
import com.campuse.data.Faculty;
import com.campuse.data.Students;

public class AppMain {
           public static void main(String[] args) {
        
             Faculty[] fac = new Faculty[5];
             System.out.println("Faculty Details............................");
             fac[0] = new Faculty("Abhishek", 22,"123 bhawakua indore",101,50000.0,"Computer Science");             
             fac[1] = new Faculty("Anurage", 21,"124 bhawakua indore",102,90000.0,"Agricture");   
             fac[2] = new Faculty("Yogendra", 18,"125 bhawakua indore",103,80000.0,"Menegment");   
             fac[3] = new Faculty("Prateek", 26,"127 bhawakua indore",104,70000.0,"homelone");   
             fac[4] = new Faculty("Pratual", 21,"128 bhawakua indore",105,60000.0,"humnalogy");
             
              double totalSalary = 0.0;
              for (Faculty faculty : fac) {
               totalSalary += faculty.salary;
             }

            System.out.println("Total salaries of all faculties: $" + totalSalary);
            
            Students[] stu = new Students[4];
            System.out.println("Student Details............................");
            stu[0] = new Students("Abhishek",22,"123 bhawarkua indore",202,"Computer Science",4);
            stu[1] = new Students("Anurage",21,"123 bhawarkua indore",203,"Computer Science",3);
            stu[2] = new Students("Yogendra",18,"123 bhawarkua indore",204,"Computer Science",2);
            stu[3] = new Students("Atul",21,"123 bhawarkua indore",205,"Computer Science",5);
            
               Fess[] feesList = new Fess[4];
            System.out.println("Fees Details............................");
            feesList[0] = new Fess(stu[0],1000.0,"2023-10-17");
            feesList[1] = new Fess(stu[1],1000.0,"2023-10-17");
            feesList[2] = new Fess(stu[2],1000.0,"2023-10-17");
            feesList[3] = new Fess(stu[3],1000.0,"2023-10-17");
                  
              double totalFeesCollected = 0.0;
              for (Fess fee : feesList) {
                totalFeesCollected += fee.amount;
        }

        System.out.println("Total fees collected from all students: $" + totalFeesCollected);   

    }
    
}
