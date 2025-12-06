import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKL4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int angkaBenar = random.nextInt(100) + 1;

        ArrayList<Integer> tebakanList = new ArrayList<>();

        System.out.println("=== Game Tebak Angka ===");
        System.out.println("Komputer telah memilih angka antara 1 - 100.");
        System.out.println("Mulai tebak!");

        System.out.print("Masukkan batas percobaan: ");
        int batas = scanner.nextInt();

        int tebakan;
        int percobaan = 0;          

        while (percobaan < batas) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            tebakanList.add(tebakan);
            percobaan++;

            if (tebakan > angkaBenar) {
                System.out.println("Tebakan terlalu tinggi.");
            } else if (tebakan < angkaBenar) {
                System.out.println("Tebakan terlalu rendah.");
            } else {
                System.out.println("Anda menebak dengan benar!");
                break;
            }

            if (percobaan == batas) {
                System.out.println(" Game over! Kesempatan Anda telah habis. Angka yang benar adalah: " + angkaBenar);
            }   

        }

        System.out.println("\nDaftar tebakan Anda:");
        for (int i = 0; i < tebakanList.size(); i++) {
            System.out.println("Tebakan ke-" + (i + 1) + ": " + tebakanList.get(i));
        }

        scanner.close();
    }
}
