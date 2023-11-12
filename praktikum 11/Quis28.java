import java.util.Scanner;
import java.util.Random; //import libraries random untuk mengacak angka

public class Quis28 {
    public static void main(String[] args) {
        Random random = new Random(); // inisialisasi
        Scanner input = new Scanner(System.in); // inisialisasi

        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer == number) {
                    System.out.println("Jawaban Anda Benar");
                    success = true;
                } else if (answer < number) {
                System.out.println("Jawaban terlalu kecil. Coba Lagi"); 
                } else {
                    System.out.println("Jawaban terlalu besar. Coba Lag");
                }

        } while(!success);

            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while(menu=='y' || menu=='Y'); //program akan terus berjalan dalam loop selama pengguna ingin bermain lagi 
    }
}
