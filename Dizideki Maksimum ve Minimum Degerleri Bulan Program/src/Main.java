import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int num = inp.nextInt();

        int[] list = {5, 12, 8, 10, -5, -58, 91, 10, -24, 421};
        Arrays.sort(list);


        int min = list[0];
        int max = list[list.length - 1];

        for (int i : list) {
            if (i < num && i > min) {
                min = i;
            }
            if (i > num && i < max) {
                max = i;
            }
        }

        System.out.println("En yakın küçük sayı: " + min);
        System.out.println("En yakın büyük sayı: " + max);
    }
}