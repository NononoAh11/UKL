import java.util.Arrays;
public class UKL5 {
    public static void main(String[] args) {
    
        int[] array = {1, 2, 2, 3, 3, 3, 4};
    
        Arrays.sort(array);

        System.out.println("Array yang Diurutkan: " + Arrays.toString(array));
        System.out.println("--- Hasil Frekuensi ---");

        if (array.length == 0) {
            return;
        }
        int currentElement = array[0];
        int count = 1;                                      

        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentElement) {        
                count++;
            } else {
                System.out.println(currentElement + " muncul " + count + " kali");
                currentElement = array[i];
                count = 1;
            }
        }
        System.out.println(currentElement + " muncul " + count + " kali");
    }
}