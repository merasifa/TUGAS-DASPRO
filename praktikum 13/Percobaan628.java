import java.util.Scanner;

public class Percobaan628 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan Panjang : ");
        p=input.nextInt();
        System.out.print("Masukkan lebar : ");
        l=input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t=input.nextInt();

        L=p*l*t;
        System.out.println("Luas Persegi Panjang Adalah "+L);

        vol=p*l*t;
        System.out.println("Volume balok adalah "+vol);
    } // Fungsi Hitung Luas
    static int hitungluas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    } // Fungsi Hitung Volume
    static int hitungvolume (int tinggi, int a, int b) {
        int Volume= hitungluas(a,b)*tinggi;
        return Volume;
    }
}