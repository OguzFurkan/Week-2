public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {10, 2, 3, 5, 6, 7, 10, 6, 58, 14, 0, 7, 23, 7, 24, 10, 6, 8, 8, 21, 34, 11, 13};


        int[] duplicate = new int[list.length];

        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {

                if (list[i] == list[j] && list[i] % 2 == 0) {

                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        if (startIndex > 0) {

            System.out.println("Tekrar eden çift sayılar:");
            for (int k = 0; k < startIndex; k++) {
                System.out.println(duplicate[k]);
            }
        } else {
            System.out.println("Tekrar eden çift sayı bulunamadı.");
        }
    }
}