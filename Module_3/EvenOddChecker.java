package Cognizant.Module_3;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ODD / EVEN CHECKER");
        System.out.print("Enter value: ");
        int a = sc.nextInt();
        if(a%2==0) System.out.println("EVEN NUMBER");
        else System.out.println("ODD NUMBER");
    }
}
