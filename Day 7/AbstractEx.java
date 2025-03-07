abstract class Trainer{
    abstract void Teach();
    //abstract dont have implementation details
}
class Student extends Trainer {
    //child class only having the implementation -like method
    void Teach(){
        System.out.println("Training is going on");
    }

}

public class AbstractEx {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.Teach();
    }
}
