import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean valid = false;
        int jmlMalam = 0;

        while(valid != true) {

            System.out.print("Masukkan jumlah malam : ");
            jmlMalam = sc.nextInt();

            if (jmlMalam > 0) {
                break;
            } else {
                System.out.println("Jumlah malam harus lebih dari 0");
            }
        }

        System.out.println("Jumlah malam : " + jmlMalam);
    }
}
