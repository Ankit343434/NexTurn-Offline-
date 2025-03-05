public class Problem2 {
    public static void main(String[] args) {
        int rows = 3; // total numbers of rows
        int num =1; //no. to start printing


        //loop for each row
        for(int i=0;i<rows;i++){

            //print spaces for align no.
            for(int j=0; j<rows-i-1; j++){
                System.out.print("  ");//Print two spaces

            }
            //print numbers in the row
            for(int j= 0;j<(2*i+1);j++){
                System.out.print(num+" ");//print the number with space
                num++;
            }

            System.out.println();
        }


    }
}
