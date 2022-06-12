package recursion;

import java.util.Scanner;

public class SumOfDigites {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter digit: ");
        int n=sc.nextInt();
        System.out.println(sumOFDigits(n));

    }
    static int sumOFDigits(int n){
        if(n==0) return 0;
else {
            return sumOFDigits(n/10)+n%10;
        }

    }
}
