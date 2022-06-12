package recursion;

import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int n = sc.nextInt();
        print1toN(n);
    }
    static void print1toN(int n){
        if (n==0) return;
        print1toN(n-1);
        System.out.print(n+" ");
    }
}
