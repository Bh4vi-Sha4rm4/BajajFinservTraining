package javatrainingdayone;
import java.util.*;


public class MaximumOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first_num =sc.nextInt();
        int second_num = sc.nextInt();
        int third_num = sc.nextInt();
        if(first_num>second_num && first_num>third_num)
        {
            System.out.println(first_num);
        }

        else if(second_num>third_num)
        {
            System.out.println(second_num);
        }
        else
        {
            System.out.println(third_num);
        }




    }

}
