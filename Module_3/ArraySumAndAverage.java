package Cognizant.Module_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ARRAY SUM & AVG--");
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("BAD INPUT");
            return;
        }
        int arr[]= new int[n];
        int sum = 0;
        for(int i = 0 ;i<n; i++){
            System.out.print("enter val: ");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Given Array: "+Arrays.toString(arr));
        System.out.println("SUM: "+sum);
        System.out.println("AVG: "+(double)sum/n);


    }
}
