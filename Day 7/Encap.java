//finding fields and methods
// controlled access
class class1{
    private String name;
    void setName(String name){
        this.name = name;

    }
    String getname(){

        return name;

    }
}

public class Encap {
    public static void main(String[] args) {
        class1 obj = new class1();
        obj.setName("Ankit");
        System.out.println(obj.getname());

    }
}
