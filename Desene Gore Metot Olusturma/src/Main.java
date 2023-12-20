import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        recursiveIslem(number);
    }

    public static void recursiveIslem(int number) {

        if (number <= 0) {
            System.out.println("Son Değer: " + number);
        } else {

            System.out.println("Son Değer: " + number);
            recursiveIslem(number - 5);
            System.out.println("Son Değer: " + number);
        }
    }
}
