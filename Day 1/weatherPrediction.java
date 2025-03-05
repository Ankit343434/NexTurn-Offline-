import java.util.Scanner;

public class weatherPrediction {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        
        String weatherCondition;
        
        if (temperature > 30) {
            weatherCondition = "Hot";
        } else if (temperature >= 20 && temperature <= 30) {
            weatherCondition = "Warm";
        } else if (temperature >= 10 && temperature < 20) {
            weatherCondition = "Moderate";
        } else {
            weatherCondition = "Cold";
        }
        
        System.out.println("The weather is: " + weatherCondition);
        
        scanner.close();
    }
}
