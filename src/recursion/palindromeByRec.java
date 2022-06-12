package recursion;

import java.util.Scanner;

public class palindromeByRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        System.out.println(palindrome(str,0,str.length()-1));

    }
    static boolean palindrome(String str, int start, int end){
      if (start>=end) return true;
      return (str.charAt(start)==str.charAt(end)&&palindrome(str,start+1,end-1));




    }
}
