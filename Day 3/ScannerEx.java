import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a scanner obect

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your Age:");
        int age =sc.nextInt();
        System.out.println(age);

        System.out.println("Value of Pi: ");
        float Pi = sc.nextFloat();
        System.out.println(Pi);

        
        // boolean isSingle =sc.nextBoolean();
        // System.out.println(isSingle);



    }
}