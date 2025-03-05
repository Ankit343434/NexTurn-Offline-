
import java.util.Scanner;

//The Fibonacci sequence is a series of numbers where each number is 
//the sum of the two numbers before it. 
//The sequence starts with 0 and 1, and continues with 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,



public class Problem_1 {
    // recursive method to find nth fibonacci number
    public static int fibonacci (int n){
        if(n<=1){
            return n; // Base case : Fibonacci (0)= 0, Fibonacci(1)=1

        }
        return fibonacci(n-1) + fibonacci(n-2); //recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci sries : ");
        int series = scanner.nextInt();

        System.out.println("Fibonacci Series: ");
        for (int i=0; i< series ; i++){  // printing Fibonacci sequence up to 'series'
    
             System.out.print(fibonacci(i) + " ");
        }
        scanner.close();


    }
}
