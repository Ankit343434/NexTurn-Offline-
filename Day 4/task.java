
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pin = 3468;
       

        int i =0;
        while(i<3){

            System.out.println("Enter Your ATM Pin");
            int n =sc.nextInt();
            if( pin==n){
                System.out.println("Acess Granted");
            }
            else{
                System.out.println("Permission is Denied");
            }
            i++;
        }
    }
}
