import java.util.Scanner;

public class StudiKasus28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        System.out.print("Masukkan tinggi jajar genjang: ");
        int tinggi = input28.nextInt(); // input tinggi
        System.out.print("Masukkan panjang sisi miring: ");
        int panjangSisiMiring = input28.nextInt(); // input sisi miring

        // perulangan
        for (int i = 0; i < tinggi; i++) {
            // Spasi sebelum karakter pertama
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Karakter pertama
            for (int k = 0; k < panjangSisiMiring; k++) {
                System.out.print("*");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
