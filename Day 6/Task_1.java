public class Task_1 {
    String name;
    int rollNumber;
    char grade;

    //Construct to initialize student details
    public Task_1(String name, int rollNumber, char grade){
        this.name=name;
        this.rollNumber=rollNumber ;
        this.grade = grade;
    }
    void show(){
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        {
            // ConstructEx obj = new ConstructEx();
        Task_1 obj= new Task_1("Ankit", 156 ,'O');
        System.out.println(obj);
        obj.show();
        }
    }
}
