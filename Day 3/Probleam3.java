public class Probleam3 {
    public static void main(String[] args) {
        int rows= 3; // total no. of blocks
        int columns = 4; // no. fo squence in each block

        for(int i =1; i<= rows ; i++){
            System.out.println(" "+1); //print the row no.
            for(int j =1; j<=columns; j++){
                System.out.print(j+" ");// Print no. from 1 to 4
            }
            System.out.println();// move to the next line
        }
    }
}
