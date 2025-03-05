
import java.util.Scanner;



public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        //Activity

        System.out.println("Enter activity( Running, Cycling, Swiming, Walking): ");
        String activity = scanner.nextLine();
        
        //Duration

        System.out.println("Enter duration in minutes: ");
        double duration = scanner.nextDouble();
   
        //Calories Burned
          double caloriesPerMinute = switch (activity){
            case "running"-> 10;
            
            case "cycling" -> 8;
            case "swiming" -> 9.8;
            case "walking" -> 3.3;
            default -> 0;
          };     
        
        if(caloriesPerMinute == 0) {
            System.out.println("Invalid activity ");
        }else {
            System.out.println("Calories Burned: " + (caloriesPerMinute* duration));

        }


        scanner.close();
        }
    
}
