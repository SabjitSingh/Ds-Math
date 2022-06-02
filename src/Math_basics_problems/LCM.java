package Math_basics_problems;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for LCM: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("LCM is: "+LCM(a,b));
    }
    static int LCM(int a,int b){
      return (a*b)/gcd_Euclidean(a,b);


    }
    public static int gcd_Euclidean(int a, int b){
        if (b==0){
            return a;
        }
        return (gcd_Euclidean(b,a%b));
    }

}
