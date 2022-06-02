package Math_basics_problems;
import java.util.Scanner;
public class count_number_length {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
     long n= sc.nextLong();

        System.out.println("Total no in "+n+ " is "+count_number(n));
        System.out.println("Total length by rec method "+count_nolength_rec(n));
    }
    public static int count_number(long n){
        int count =0;
        while(n!=0){
            n =n/10;
            count ++;
        }
        return count;
    }
    public static int count_nolength_rec(long n){
        if(n==0){
            return 0;
        }
        return 1+count_nolength_rec(n/10);
    }
}
