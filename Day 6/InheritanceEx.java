class Student {
    void speak(){
        System.out.println("Ankit you can speak");
    }
}
class Teacher extends Student {
    void teach(){
        System.out.println(" Can you teach us");
    }
}

class Principle extends Teacher {
    void Manage(){
        System.out.println("Principle Mam");
    }
}



public class InheritanceEx {


    public static void main(String[] args) {
        Teacher obj = new Teacher();
        Principle obj1 = new Principle ();
        Student obj2= new Student();
        obj1.Manage();
        obj.teach();
        
        obj2.speak();
        
    }
}
