package javatrainingdayone;


public class Assignment {
    public void max(int a, int b, int c){
        System.out.println(Math.max(Math.max(a,b),c));
    }
    public void swapt(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
    public void swap(int a, int b) {
        int c=0;
        c=b;
        b=a;
        a=c;
        System.out.println(a + " " + b);
    }

    public void nline(int a){
        if(a==0)
            System.out.println("Zero");
        if(a<0)
            System.out.println("Negative");
        else
            System.out.println("Positive");
    }

    public void prime(int a){
        for(int i=2; i<a/2; i++){
            if(a%i==0){
                System.out.println(" Not Prime ");
                break;
            }
        }

        System.out.println("Prime");
    }

    public void palindrome(int a){
        StringBuffer sb = new StringBuffer(a);
        if(sb==sb.reverse())
            System.out.println("Palindrome");
        else
            System.out.println("Not Plaiindrome");
    }

    static void cube(int a){
        System.out.println(a*a*a);
    }


    public static void main(String args[]){
        Assignment as = new Assignment();
        as.max(89, 95, 78);
        as.swapt(56, 12);
        as.swap(45, 89);
        as.nline(-78);
        as.prime(17);
        as.palindrome(989);
        cube(16);
    }

}