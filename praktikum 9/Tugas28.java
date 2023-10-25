import java.util.Scanner;

public class Tugas28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner (System.in);

        System.out.println("Masukkan banyaknya elemen: ");
        int elemen = input28.nextInt();

        int[] nilaiElemen = new int [elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai elemen ke-" + (i + 1) + " : ");
            nilaiElemen[i] = input28.nextInt();
    }


    int nilaiTinggi = nilaiElemen[0];
    int nilaiRendah = nilaiElemen[0];
    int total = 0;

    for (int i = 0; i < elemen; i++) {
        if (nilaiElemen[i] > nilaiTinggi) {
            nilaiTinggi = nilaiElemen[i];
        }
        if (nilaiElemen[i] < nilaiRendah){
            nilaiRendah = nilaiElemen[i];
        }
        total += nilaiElemen[i];
    }
    double rata2 = (double) total / elemen;

    System.out.println("Nilai tertinggi : " + nilaiTinggi);
    System.out.println("Nilai terendah : " +nilaiRendah);
    System.out.println("Rata - rata : " +rata2);
}
}
