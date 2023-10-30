import java.util.Scanner;

public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner scan28 = new Scanner (System.in);
        
        int baris, kolom;
        String nama, next;

        String [][] penonton = new String [4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = scan28.nextLine();
            System.out.print("Masukkan baris: ");
            baris = scan28.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = scan28.nextInt();
            scan28.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = scan28.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }

        }
    }
}
