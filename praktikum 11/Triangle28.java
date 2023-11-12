import java.util.Scanner;

public class Triangle28 {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc28.nextInt();
        int i = 1; // dimuali dari i = 1
        while (i <= N) {
            int j = 1; // dimulai dari j = 1
            while (j <= i) { // dari j < i diganti j <=i
                System.out.print("*");
                j++;
            }
            System.out.println(); // agar pindah ke baris selanjutnya
            i++;
        }
    }
}
