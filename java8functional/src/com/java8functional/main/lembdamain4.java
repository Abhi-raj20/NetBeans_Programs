package com.java8functional.main;
import java.util.function.Predicate;
import com.java8functional.interfaces.EvenOdd;
public class lembdamain4 {
    public static void main(String[] args) {
        Predicate<Integer>  ref = x -> x%2==0;
        
        System.out.println("In 23 even : "+ref.test(23));
        System.out.println("In 26 even : "+ref.test(26));
                
                }
}
