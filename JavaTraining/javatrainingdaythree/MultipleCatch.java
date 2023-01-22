package javatrainingdaythree;
import java.util.*;

public class MultipleCatch {

    public void multipleCatch() {

        try{
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: ");
            n=sc.nextInt();
            int[] array = new int[10];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Arithmetic Exception occurs");
//        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("inside of finally block");
    }

}

