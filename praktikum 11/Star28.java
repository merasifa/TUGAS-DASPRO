import java.util.Scanner;

public class Star28 {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc28.nextInt();

        for(int i=0; i<=n; i--){
            System.out.print("*");
        }
    }
}
