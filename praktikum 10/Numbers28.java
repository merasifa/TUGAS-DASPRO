import java.util.Arrays;

public class Numbers28 {
    public static void main(String[] args) {
        int [][] myNumbers = new int [3][4]; // deklarasi dan inisiasi array 2 dimensi bernama myNumbers dgn element tipe int
        myNumbers[0] = new int [5];
        myNumbers[1] = new int [3];
        myNumbers[2] = new int [1];

        for (int i = 0; i < myNumbers.length; i++){
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++){
            System.out.println("Panjang baris ke-" + ": " +myNumbers[i].length );
        }

    }
}
