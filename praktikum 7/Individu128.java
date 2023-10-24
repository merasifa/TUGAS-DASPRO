import java.util.Scanner;


public class Individu128 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        String nama, jenisKelamin;
        int jumlahMahasiswa = 30;

        int a= 1;
         for(a = 1; a<= jumlahMahasiswa; a++ ) {
            System.out.print("Masukkan Nama");
            nama = input28.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P)");
            jenisKelamin = input28.nextLine();

            if(jenisKelamin.equalsIgnoreCase("P")) {
                System.out.println("Nama " + nama);
            }
         }

    }
    
}
