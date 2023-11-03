package com.campus.account;

import com.campuse.data.Students;

public class Fess {
          Students student;
          public double amount;
          String paymentDate;
          
          public Fess(Students student,double amount,String paymentDate) {
                   this.student = student;
                   this.amount = amount;
                   this.paymentDate = paymentDate;
          }
}
