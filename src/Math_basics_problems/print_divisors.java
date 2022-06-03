package Math_basics_problems;

import java.util.Scanner;

public class print_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n= sc.nextInt();
        print_div(n);
    }
    static void print_div(int n){
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
