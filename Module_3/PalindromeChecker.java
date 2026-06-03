package Cognizant.Module_3;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PALINDROME CHECKER");
        System.out.print("Enter String: ");
        String st = sc.nextLine();
        String newSt="";
        for(int i = st.length()-1; i>=0; i--){
            char ch = st.charAt(i);
            if((ch>='A'&& ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')) newSt+=ch;
        }
        newSt= newSt.toLowerCase();
        System.out.println("Given string: "+st);
        System.out.println("reversed String: "+newSt);
        if(newSt.equals(st)) System.out.println("PALINDROME");
        else System.out.println("NOT PALINDROME");
    }
}
