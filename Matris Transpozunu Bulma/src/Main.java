import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int row = input.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int col = input.nextInt();

        // Matrisi oluşturma
        int[][] matris = new int[row][col];

        // Matris elemanlarını kullanıcıdan alma
        System.out.println("Matris elemanlarını girin:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Eleman [" + (i + 1) + "][" + (j + 1) + "]: ");
                matris[i][j] = input.nextInt();
            }
        }

        // Matrisi ve transpozunu ekrana yazdırma
        System.out.println("Matris:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpozu:");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }

    }
}
