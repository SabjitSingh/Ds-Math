package recursion;

import java.util.Scanner;

public class rope_cut_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
     int n= sc.nextInt();
        System.out.println("Enter value of A,B and C: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(maxCuts(n,a,b,c));


    }
    static int maxCuts(int n, int a, int b,int c){
        if (n==0) return 0;
        if(n<0) return -1;
        int res = Math.max(maxCuts(n-a, a, b, c),
                Math.max(maxCuts(n-b, a, b, c),
                        maxCuts(n-c, a, b, c)));

        if(res == -1)
            return -1;

        return res + 1;
    }

}
