import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = input.nextInt();
        
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);
    }
    
    public static void faktorisasi(int bilangan) {
        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.print(i);
                bilangan /= i;
                
                if (bilangan != 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
