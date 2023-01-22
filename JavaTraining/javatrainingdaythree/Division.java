package javatrainingdaythree;
import java.util.*;

public class Division {
  public void division(){
     Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
        try {
            System.out.println(a / b); // throw Exception
        }
        catch (ArithmeticException e){
            System.out.println(
                    "Division by zero exception raised!");
        }

    }
}
