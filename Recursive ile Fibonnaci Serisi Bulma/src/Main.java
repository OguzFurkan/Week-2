import java.util.Scanner;

public class Main {

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        System.out.print("Hesaplamak istediğiniz değeri girin: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(fib(n));
    }
}