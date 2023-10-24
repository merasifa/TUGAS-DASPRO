import java.util.Scanner;


public class ArrayRataNilai28 {
    public static void main(String[] args) throws Exception {
        Scanner scan28 = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = scan28.nextInt();


        int[] nilaiMhs= new int [jumlah];
        double total = 0;
        double rata2;
        double jumlahMhsLulus=0, jumlahMhsTdkLulus=0, jumlahNilaiLulus=0, jumlahNilaitdkLulus=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
            nilaiMhs[i] = scan28.nextInt();

    //         if (nilaiMhs[i] > 70) {
    //             jumlahMhsLulus++;
    //             jumlahNilaiLulus += nilaiMhs[i];
    //         } else {
    //             jumlahMhsTdkLulus++;
    //             jumlahNilaitdkLulus += nilaiMhs[i];
    //         }
          
    //     }
    //       System.out.println("Rata-rata nilai lulus = " + jumlahNilaiLulus/jumlahMhsLulus);
    //       System.out.println("Rata-rata nilai tidak lulus = " + jumlahNilaitdkLulus/jumlahMhsTdkLulus);
    }

         for (int i = 0; i < nilaiMhs.length; i++) {
             total += nilaiMhs[i];
             if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke -"+i+" lulus");
                
             } else {
                System.out.println("Mahhasiswa ke -"+i+" tidak lulus");
             }
        }
        
        
        rata2 = total/nilaiMhs.length;
        System.out.print("Rata-rata nilai = " + rata2);

    }
}
