package Cognizant.Module_3;

public class MethodOverloading {
    public int add(int a , int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a , int b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,4));
        System.out.println(obj.add(1.11,0.2));

    }
}
