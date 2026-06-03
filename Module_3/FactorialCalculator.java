package Cognizant.Module_3;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("FACTORIAL CALCULATOR");
        System.out.print("Enter a positive interger: ");
        int a = sc.nextInt();
        if(a<=0){
            System.out.println("bad input");
            return;
        }
        int fact = 1;
        for(int i = a ; i>=1 ; i--){
            fact*=i;
        }
        System.out.println("factorial of "+a+" is : "+fact);
    }
}
