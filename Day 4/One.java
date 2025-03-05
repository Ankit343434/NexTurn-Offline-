
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("while loop: ");
        int i =1;
        while(i<=n){
            System.out.println(i);
            i++;
        }

    }
}
