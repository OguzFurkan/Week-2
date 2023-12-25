import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutu alındı.
        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Dizi elemanları alındı.
        int[] dizi = new int[boyut];
        System.out.println("Dizi elemanlarını girin:");

        //Döngü oluşturuldu.
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("----------");

        System.out.println("Eleman Frekansları:");

        for (int i = 0; i < boyut; i++) {
            int eleman = dizi[i];
            int frekans = 1;


            for (int j = i + 1; j < boyut; j++) {
                if (dizi[j] == eleman) {
                    frekans++;
                }
            }

            if (frekans > 1) {
                System.out.println(eleman + " => " + frekans + " kez");
            }
        }
    }
}
