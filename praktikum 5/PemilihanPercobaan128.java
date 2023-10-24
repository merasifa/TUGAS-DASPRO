/**
 * PemilihanPercobaan128
 */
import java.util.Scanner; 
public class PemilihanPercobaan128 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Masukan angka:  ");
        int angka = input00.nextInt();

        String result = (angka % 2 == 0) ? "Angka"+angka+" bilangan genap" : "Angka"+angka+" bilangan ganjil";
        System.out.println(result);

    }
}