import java.util.Scanner;

public class Kubus28 {
    public static int volume (int sisi) {
        int hitungvolume = sisi*sisi*sisi;
        return hitungvolume; 
    }
    public static int luasPermukaan (int sisi){
        int hitungluasPermukaan = 6*sisi*sisi;
        return hitungluasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input28 = new Scanner (System.in);

        System.out.print("Masukkan sisi: ");
        int s = input28.nextInt();

        System.out.println("Volume Kubus : " + volume(s));
        System.out.println("Luas Permukaan: " + luasPermukaan(s));
    }
    
}
