import java.util.Scanner;

public class NestedLoop28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner (System.in);
        double array[][] = new double[5][7];
        // menginputkan suhu sesuai hari
        for (int i = 0; i < array.length; i++) {
        System.out.println("Kota ke- " + i);
            for (int j = 0; j < array[0].length; j++) {
            System.out.print("Masukkan suhu untuk hari ke-" + (j + 1) + " : ");
            array[i][j] = input28.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) { // menampilkan data suhu
        System.out.println("Kota ke-" + (i+1) +": ");
            for (double suhu : array[i]) {
            System.out.println(suhu + " ");
            }
            System.out.println();
    }
 }
    
}

 
