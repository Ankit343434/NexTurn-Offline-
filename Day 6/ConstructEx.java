
public class ConstructEx {
    String name;
    int num;
    // constructor method
    ConstructEx(){

        //default constructor
        System.out.println("Hi welcome");
        name = "Ankit";
        num =123456789;


    }
    public ConstructEx(String a, int b){
        name=a;
        num= b;
    }
    void show(){
        System.out.println(name+" "+ num);
    }
    // a construct is a special method that is used to intialization
    //it is automatically create when object is called 
    // 1. same name as class
    //2. no return type
    //3. called automatically
    //4. overloading is possible
    //type: default constructor and parameterized constructed
    // default constructor is provided by the compiler if noo constructor is defined
    public static void main(String[] args) {
        // int a;
        // System.out.println(a);
        ConstructEx obj = new ConstructEx();
        ConstructEx obj2= new ConstructEx("Ankit",123);
        System.out.println(obj);
        obj.show();
        obj2.show();
    }
}
