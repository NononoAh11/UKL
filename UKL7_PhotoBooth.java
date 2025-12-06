import java.util.Scanner;

public class UKL7_PhotoBooth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket photobooth: ");
        int jumlahPaket = input.nextInt();
        input.nextLine(); 

        long totalKeseluruhan = 0;
        String paketLabaTertinggi =  " ";
        long labaTertinggi = Long.MIN_VALUE;

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Nama Paket | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println("\nPaket ke-" + (i+1));
            System.out.print("Nama paket : ");
            String namaPaket = input.nextLine();

            System.out.print("Biaya produksi per event : ");
            long biayaProduksi = input.nextLong();

            System.out.print("Harga jual per event : ");
            long hargaJual = input.nextLong();

            System.out.print("Jumlah event terjual: ");
            int jumlahEvent = input.nextInt();
            input.nextLine();

            long totalBiaya = biayaProduksi * jumlahEvent;
            long totalPendapatan = hargaJual * jumlahEvent;
            long labaRugi = totalPendapatan - totalBiaya;

          
            String status;
            if (labaRugi > 0) {
                status = "Laba";
            } else if (labaRugi < 0) {
                status = "Rugi";
            } else {
                status = "Impas";
            }

            totalKeseluruhan += labaRugi;

            if (labaRugi > labaTertinggi) {
                labaTertinggi = labaRugi;
                paketLabaTertinggi = namaPaket;
            }

            System.out.printf("%-12s | Rp%-10d | Rp%-13d | Rp%-9d | %s\n",
                    namaPaket, totalBiaya, totalPendapatan, labaRugi, status);
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalKeseluruhan);
        System.out.println("Paket dengan Laba Tertinggi: " + paketLabaTertinggi + " (Rp" + labaTertinggi + ")");

        input.close();
    }
}