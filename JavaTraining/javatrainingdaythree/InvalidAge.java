package javatrainingdaythree;
import java.util.Scanner;

class AgeNotValid extends Exception{
    public AgeNotValid(){
        System.out.println("Not valid age");
    }
}
public class InvalidAge {
    public void ageNotValid() throws AgeNotValid {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        try{
            if(age<18){
                throw new AgeNotValid();
            }
        }catch(AgeNotValid e){
            System.out.println("Your age is not valid for voting!");
        }
        finally{
            System.out.println("Finally reached.");
        }

    }
}
