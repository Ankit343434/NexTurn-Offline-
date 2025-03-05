// package First.java;

public class First {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        //array is collection of elements of same data type stored in continuous memory location.
        //easier to manage large amount of data efficiently.

        //decalration
        //int [] num=new int[3];
        //intializatiion;
        int [] num = {1,2,3,4,5};
        // for(int i =0;i<num.length ;i++){

        //     System.out.println(num[i]);
        // }

        // System.out.println("reverse:");

        // for(int i =num.length; i>0; i--){
        //     System.out.println(num[i-1]);
        // }
        for (int i :num){
            System.out.println(i);

        }

        int [][] jagged = new int[3][];
        jagged[0] = new int []{1,2};
        jagged[1] = new int []{1,2,3};
        jagged[2] = new int []{1,2,3,4};

    }
}