public class BubbleShort28 {
    public static void main(String[] args) {
        
        String [][] atlet = { // inisialisasi array
            {"Ibnu", "Marco", "Faiz", "Agung", "Vira"}, // Badminton
            {"Mera", "Hana", "Rea", "Reza", "Isna"}, // Tenis Meja
            {"Dimas", "Farhan", "Vincent", "Gaby", "Batavia"}, // Basket
            {"Dio", "Dandi", "Chiko", "Eca", "Reika"} // Bola Voly
        };

        String [] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        for (int i = 0; i < atlet.length; i++) {
            for (int j = 0; j < atlet[i].length - 1; j++) {
                for (int k = 0; k < atlet[i].length - j - 1; k++) {
                    if (atlet[i][k].compareToIgnoreCase(atlet[i][k + 1]) > 0) {
                        String temp = atlet[i][k];
                        atlet[i][k] = atlet[i][k + 1];
                        atlet[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < atlet.length; i++) {
            System.out.println( cabor[i] );
            for (int j = 0; j < atlet[i].length; j++) {
                System.out.println("Atlet ke -" + (j + 1) + " adalah " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}

