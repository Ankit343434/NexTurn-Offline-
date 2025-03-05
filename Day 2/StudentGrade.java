
import java.util.Scanner;



public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entersubject (Math,English,Sci,Hindi) : ");
        String subject = scanner.nextLine();

        System.out.println("Enter the marks : ");
        int marks = scanner.nextInt();


        String grade = switch (marks ){

            case 90-100 -> "Grade A"; //90-100
            case 80-89 -> "Grade B";
            case 70 -> "Grade C";
            case 60 -> "Grade D";
            default -> "Fail";

        };

        System.out.println("Subject: " + subject + ", Marks: " + marks + ", Grade: " + grade +".");
        scanner.close();


    
        

    }
    


}
