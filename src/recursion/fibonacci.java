package recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int n = sc.nextInt();
        fib(n);

}
static int fib(int n){
    if (n==0||n==1) return 0 ;
    fib(n-1);

    System.out.println(n);
return fib(n-1)+fib(n-2);
    }
}

