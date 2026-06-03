package Cognizant.Module_3;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static int fib(int n){
        if(n==0||n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term of fibonacci series: ");
        int a = sc.nextInt();
        if(a<=0){
            System.out.println("BAD INPUT");
            return;
        }

        System.out.println(fib(a-1));

    }
}
