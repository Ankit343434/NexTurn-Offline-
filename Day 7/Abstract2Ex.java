

abstract class DataBase{
    abstract void connecting();
    void disconnect(){
        System.out.println("disconnected");
    }
}

class Mydata extends DataBase {
    void connecting(){
        //codeblock for connecting
        System.out.println("connected to databse");
    }
}
public class Abstract2Ex {
    public static void main(String[] args) {
        Mydata db =new Mydata();
    db.connecting();
    }
    
}
