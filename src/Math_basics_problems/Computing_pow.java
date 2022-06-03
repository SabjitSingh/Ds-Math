package Math_basics_problems;

import java.util.Scanner;

public class Computing_pow {
    static int pow(int n,int pow){
        int res=1;
        if (pow==0) return 1;
        for (int i=0;i<pow;i++){
            res=res*n;
        }
        return res;
    }
    //Efficient Solution
    static int power(int x, int n)
    {
        if(n == 0)
            return 1;

        int temp = power(x, n/2);

        temp = temp * temp;

        if(n % 2 == 0)
            return temp;
        else
            return temp * x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number and power: ");
        int n =sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(pow(n,pow));
        System.out.println(power(n,pow));
    }

}
