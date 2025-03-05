public class first_2 {
    public static void main(String[] args) {
        byte a =10;
        int b =100;
        float c =12.00f;
        char d= 'A';
        boolean e = true ;
     

        //Using assignment operator
        a+=10 ;
        b -= 200;
        c = c /2;
        d +=3 ;

        //Using arithmetic operator
        int sum = a + b ;
        float product = c *3;
        

        //Using comparison operators
        boolean isAGreaterThanB =a> b;
        
        boolean isBEqualTo2500 = b ==2500;

        boolean isCPositive =c  >0;

        boolean isDAlphabet =d>= 'A' && d <='Z';

        //Using logical operator
        boolean logicalAnd = (a>5)&& (b<50000);
        boolean logicalOr =(c<20) || (d == 'D');
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Is a > b? " + isAGreaterThanB);
        System.out.println("(isB=to2500)" + isBEqualTo2500);
        System.out.println("IsC+" + isCPositive);
        System.out.println("Is d an uppercase letter? " + isDAlphabet);
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);



    }
}
