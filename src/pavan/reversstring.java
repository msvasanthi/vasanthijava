package pavan;

import java.util.Scanner;

public class reversstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();
        StringBuffer sb=new StringBuffer();
        sb.append(str);
       // StringBuffer rev=sb.reverse();
        System.out.printf("Reverse the String:"+sb.reverse());


    }
}
