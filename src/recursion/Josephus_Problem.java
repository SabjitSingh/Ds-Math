package recursion;

import java.util.Scanner;

public class Josephus_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and K");
        int n= sc.nextInt();
        int k=sc.nextInt();
        System.out.println(JP(n,k));

    }
    static int JP(int n,int k){
        if (n==1) return 0;


        return (JP(n-1,k)+k)%n;
    }

}
