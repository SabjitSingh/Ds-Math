package Math_basics_problems;
import java.util.Scanner;
public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No to Check it is palindrome number:");
        int n = sc.nextInt();
        System.out.println(palindrome(n));

    }

    public static boolean palindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return (rev == n);
    }
}
