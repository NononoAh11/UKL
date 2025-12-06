import java.util.Scanner;
public class UKL1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen deret fibonacci:");
        int n = scanner.nextInt();

        System.out.println("Masukkan elemen pertama deret fibonacci:");
        int a = scanner.nextInt();

        System.out.println("Masukkan elemen kedua deret fibonacci:");
        int b = scanner.nextInt();

        int ganjil = 0, genap = 0;
        System.out.print("Deret Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print( a + " ");
            if (a % 2 == 0) {
                genap ++;
            } else {
                ganjil ++;
            }
            int next = a + b;
            a = b;    
            b = next;
        }
        System.out.println("\nJumlah bilangan ganjil: " + ganjil);
        System.out.println("Jumlah bilangan genap: " + genap);
         
         scanner.close();
    }
}
