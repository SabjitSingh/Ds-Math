package recursion;

import java.util.Scanner;

public class countSebsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=  sc.nextLine();
        subsets(str,"",0);

    }
    static void subsets(String str, String curr,int i){
        if (i==str.length()) {
            System.out.print(curr+" ");
            return;
        }
        subsets(str,curr,i+1);
        subsets(str,curr+str.charAt(i),i+1);
    }
}
