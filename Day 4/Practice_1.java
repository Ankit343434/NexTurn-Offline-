// 1. check given number is palindrome or not ?(number and string too)
// 2.Java Program to Check if two Arrays are Equal or not
// 3.Java Program to Find Largest Element in an Array
// 4.sum of array
// 5.Java Program to Add two Matrices
// 6.415 leetcode problem
import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or string: ");
        String str = sc.nextLine();  //read i/o as a string
        sc.close();


        String rev = new StringBuilder(str).reverse().toString();// reverse the string

        System.out.println(str.equals(rev)? "Palindrome ": "Not a Palindrome"  );
    }
}
