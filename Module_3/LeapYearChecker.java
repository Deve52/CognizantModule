package Cognizant.Module_3;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int a = sc.nextInt();
        if(a%400==0 || (a%100!=0 && a%4==0)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }
}
