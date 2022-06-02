package Math_basics_problems;

import java.util.Scanner;

public class trail_zero_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check Zero in Factorial:");
        int n= sc.nextInt();
        int fac=fac(n);
        System.out.println("Zero in Fac is: "+Zeros(fac));

    }
    public static int fac(int n){
        if(n==0||n==1){
            return 1;
        }
        return (n * fac(n-1));
    }
    public static int Zeros(int fac){
        int count=0;
        int temp=fac;
        while(temp%10==0){
            count++;
            temp=temp/10;
        }
        return count;
}
}
