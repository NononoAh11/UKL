import java.util.Scanner;
public class UKL2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Masukkan jumlah perulangan");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". ");
 
            if (i == 1) {
                System.out.println("saya senang");
                continue;
            }

            if (i % 3 == 2) {
                System.out.println("saya anak moklet");
            } else if (i % 3 == 1) {
                System.out.println("saya anak wikusama");
            } else { 
                System.out.println("saya angkatan 33");
            }
        }
        
        input.close();
    }
}