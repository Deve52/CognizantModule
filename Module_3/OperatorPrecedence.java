package Cognizant.Module_3;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 2+3/3-2*5;
        System.out.println("Expression: 2+3/3-2*5");
        System.out.println("val: "+a);
        System.out.println("Order of evaluation: BODMAS");
        System.out.println("1. division and multiplication (left to right)");
        System.out.println("2. substraction and addition (left to right)");
    }
}
