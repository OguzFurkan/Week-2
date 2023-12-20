import java.util.Scanner;

public class Main {
    // Yeni metot oluşturuldu.
    static int power (int base, int exponent) {

        // Result değişkeni, for döngüsünden alınan değerlerle işlenebilmesi için 1 olarak atandı.
        int result = 1;

        // Üslü işlemlerde, üs sıfır olunca cevap 1 çıkacağı için if koşuluyla bu durum sağlandı.
        if (exponent == 0){
            return 1;
        }
        //Üssün 1 olmadığı durumlarda for döngüsü ile işlem gerçekleştirildi.
        for (int i = 1; i <= exponent; i++)
            result *= base;

        return result;
    }

    public static void main(String[] args) {

        //Main metodunun içinde scanner kütüphanesi ve değişkenler eklenerek birbirine atandu.
        int base, exponent;

        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayısını Girin: ");
        base = input.nextInt();
        System.out.print("Üs Sayısını Girin: ");
        exponent = input.nextInt();

        //Girilen değerleri power metodunda işlenmesi için sout'un içine metot adı girildi.
        System.out.println("Sonuç: " + power(base, exponent));
    }
}