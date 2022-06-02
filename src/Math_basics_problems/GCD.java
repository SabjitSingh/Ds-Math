package Math_basics_problems;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers to get GCD:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gcd(n,m));
        System.out.println(gcd_Euclidean(n,m));

    }

        public static int gcd(int a, int b){
            int res = Math.min(a,b);
            while(res>0){
                if(a%res==0&&b%res==0){
                    break;
                }
                res--;

            }
            return res;


        }
        public static int gcd_Euclidean(int a, int b){
        if (b==0){
            return a;
        }
        return (gcd_Euclidean(b,a%b));
        }

    }


