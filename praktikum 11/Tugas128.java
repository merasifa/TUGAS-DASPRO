import java.util.Scanner;

public class Tugas128 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int n = input28.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Menambahkan spasi agar pola terlihat rapi
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
