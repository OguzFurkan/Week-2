public class Main {
    public static void main(String[] args) {

        //Liste oluşturuldu.
        int[] list = {6, 8, 10, 12, 14, 23, 34, 41, 48, 58, 99, 100};

        double harmonic = 0.0;

        //Koşul oluşturuldu.
        for (int i = 0; i < list.length; i++) {
            harmonic += 1.0 / list[i];
        }

        //Harmonik ortalamayı çıktı alınması için eşitleme ve çıktı alındı.
        double harmonicAvarege = list.length / harmonic;
        System.out.println("Harmonik ortalama: " + harmonicAvarege);


    }
}