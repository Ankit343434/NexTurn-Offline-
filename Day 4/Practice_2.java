//Java Program to Check if two Arrays are Equal or not
import java.util.Arrays;
import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //take i/o for first array.
        System.out.print("Enter size of arrays: ");
        int size= sc. nextInt();
        int[] arr1 =new int[size], arr2 = new int [size];

        System.out.println("Enter elements of first array: ");
        for(int i=0; i<size; i++) arr1[i]=sc.nextInt();

        //take input from second array
        System.out.println("Enter elements of second array:");
        for(int i=0;i<size;i++) arr2[i]=sc.nextInt();

        sc.close();

        //compare and print result
        System.out.println(Arrays.equals(arr1,arr2)? "Equal" : "Not Equal");



    }
}
