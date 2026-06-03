package Cognizant.Module_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MULTIPLICATOIN TABLE:-");
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        for(int i = 1 ; i<=10; i++){
            System.out.println(a+"X"+i+"="+a*i);
        }
    }
}
