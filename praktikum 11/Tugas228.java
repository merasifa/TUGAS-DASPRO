import java.util.Scanner;

public class Tugas228 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int n = input28.nextInt();
        
        for (int i = n; i >= 1; i--) {
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
