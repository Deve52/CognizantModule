package Cognizant.Module_3;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println("STRING REVERSAL");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String st = sc.nextLine();
        StringBuilder sb = new StringBuilder(st);
        System.out.println("Given string: "+sb);
        System.out.println("Reversed string: "+sb.reverse());
    }
}
