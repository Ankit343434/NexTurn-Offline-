import java.util.Scanner;

public class GCD {
     public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int gcd = findGCD(num1, num2);
        
        System.out.println("The Greatest Common Divisor is: " + gcd);
        
        scanner.close();
    }
}

