package Cognizant.Module_3;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("OPERATIONS:- ");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBSTRACTION");
        System.out.println("3. DIVISION");
        System.out.println("4. MUILTIPLICATION");
        System.out.print("Enter Operation: ");
        int ans = sc.nextInt();

        switch (ans){
            case 1->{
                System.out.println(a+b);
            }
            case 2->{
                System.out.println(a-b);
            }
            case 3->{
                System.out.println(a/b);
            }
            case 4->{
                System.out.println(a*b);
            }
            default -> {
                System.out.println("BAD INPUT");
            }
        }


    }
}
