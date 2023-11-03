package assignmentweekq1.main;

import com.assignmentweekq1.Floor;
import com.assignmentweekq1.Title;
import java.util.Scanner;

public class AppMain {
         public static void main(String[] args) {
               Scanner Sc = new Scanner(System.in);

           System.out.println("Enter the length if Title :");
             int titleLength = Sc.nextInt();

         Title t = new Title(titleLength);

         System.out.println("Enter the length and width of Floor :");
         int fLength = Sc.nextInt();
         int fwidth = Sc.nextInt();

         Floor f = new Floor(fLength,fwidth);

         f.totoalTitles(t);
    }
    
}
