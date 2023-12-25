public class Main {
    public static void main(String[] args) {

        //Matris ile sütun ve satırlar oluştuşturuldu.
        String[][] letter = new String[5][4];

        //Satır döngüsü oluşturuldu.
        for (int i = 0; i < letter.length; i++) {
            //Sütun döngüsü oluşturuldu.
            for (int j = 0; j < letter[i].length; j++) {
                //Yıldızların geleceği diziler belirlendi.
                if (i == 0 || i == 2 || i == 4 || j == 0 || j == 3) {
                    letter[i][j] = " * ";
                    //Boşlukların geleceği diziler belirlendi.
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        //Yazdırma işlemi oluşturuldu.
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
