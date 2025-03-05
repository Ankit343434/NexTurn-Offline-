

public class MethodEx {
    //method
    public static int findMax(int a,int b){
        return (a>b)? a:b;
    }
    public static void main(String[] args) {
        
         int result = findMax(3,5);
        // boolean Max;
        System.out.println("The max number is: " + result);
    }
}