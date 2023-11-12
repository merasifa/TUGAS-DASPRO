import java.util.Scanner;

public class Tugas338 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int n = input28.nextInt();

        if (n >= 3) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  "); // spasi agar pola terlihat rapi
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n tidak memenuhi");
        }
    }
}
