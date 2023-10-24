import java.util.Scanner; 
public class Individu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String usernamebenar = "mera";
        String passwordbenar = "12345";
        String username;
        String password;

        System.out.print("Masukkan Username: ");
        username = input.nextLine();
        System.out.print("Masukkan Password: ");
        password = input.nextLine();

        if (username.equals(usernamebenar) && password.equals(passwordbenar) ) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Username dan Password Salah");
        }


    }
    
}
