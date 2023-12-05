import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        String username = "Rayyi";
        String password = "rayyii";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
        scanner.close();
    }
    
}
