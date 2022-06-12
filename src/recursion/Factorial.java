package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int n = sc.nextInt();
        System.out.println(fac(n));
}
static int fac(int n){
    if (n==0) return 1;
    return n*fac(n-1);
    }
}
