package Math_basics_problems;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to get Factorial:");
        int n= sc.nextInt();
        System.out.println("Answer is: "+fac(n));

    }
    public static int fac(int n){
        if(n==0||n==1){
            return 1;
        }
        return (n * fac(n-1));
    }
}
