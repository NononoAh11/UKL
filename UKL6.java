import java.util.Scanner;

public class UKL6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan listrik (A/B/C): ");
        String golongan = input.nextLine().toUpperCase();

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        int kWh = input.nextInt();

        int tarif = 0;
        switch (golongan) {
            case "A":
                tarif = 1200;
                break;
            case "B":
                tarif = 1500;
                break;
            case "C":
                tarif = 1800;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                input.close();
                return;
        }

      
        double totalSebelum = kWh * tarif;
        double totalAkhir = totalSebelum;

        
        if (kWh > 500) {
            totalAkhir += totalSebelum * 0.10;
        }

        
        System.out.println("\n--- Rincian Tagihan Listrik ---");
        System.out.println("Nama pelanggan         : " + nama);
        System.out.println("Golongan listrik       : " + golongan);
        System.out.println("Pemakaian listrik      : " + kWh + " kWh");
        System.out.println("Total sebelum tambahan : Rp " + totalSebelum);
        System.out.println("Total tagihan akhir    : Rp " + totalAkhir);

        input.close();
    }
}