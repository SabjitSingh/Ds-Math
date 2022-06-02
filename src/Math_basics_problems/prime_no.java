package Math_basics_problems;

import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }

    static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }return true;

    }
}