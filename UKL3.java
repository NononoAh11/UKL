import java.util.Scanner;        
public class UKL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        System.out.println("masukkan sebuah bilangan bulat: ");   
        int n = input.nextInt();

        long faktorial = 1;{
        for (int i = n; i >= 1; i--) {
            faktorial *= i;

            System.out.print(i);

            if ( i>1 ){
                System.out.print("*");
            }

        }
            System.out.println(" : " + faktorial);
        }
        input.close();
    }
}     