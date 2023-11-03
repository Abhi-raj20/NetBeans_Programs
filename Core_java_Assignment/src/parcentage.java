
/*Program to calculate sum of marks of 3 subjects and find
percentage marks.(Take input via command line arguments)*/
public class parcentage {
    public static void main(String[] ar)
    {
     int mathematics=87,physics=90,chymisty=80;
     int Total;
     int parsentage;
     
     Total = mathematics+physics+chymisty;
     
     System.out.println("Mathematics: "+mathematics+" Physics: "+physics+" chymistry: "+chymisty);
     
     System.out.println("Total Marks is: "+Total);
     
    parsentage = Total/3;
    
    System.out.println("Parsentage is : "+parsentage);
    }
}
