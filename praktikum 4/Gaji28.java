import java.util.Scanner;

public class Gaji28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;

        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
        JmlTdkMasuk=input.nextInt();
        System.out.print("Masukkan Gaji Perhari Anda: ");
        gaji=input.nextInt();
        System.out.print("Masukkan Potongan Gaji Perhari: ");
        potGaji=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        
        System.out.println("Gaji yang anda terima : " + TotGaji);

    }
}
