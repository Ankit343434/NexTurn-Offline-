

class PrivateEx {
    private final int secretcode = 222;
    void showcode(){ 
        System.out.println(secretcode);
    }
}

public class PrivateAcess {
    public static void main(String[] args) {
        PrivateEx obj = new PrivateEx();
        obj.showcode();
    }
}
