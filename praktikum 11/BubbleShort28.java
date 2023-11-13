public class BubbleShort28 {
    public static void main(String[] args) {
        
        String [][] atlet = {
            {"Ibnu", "Marco", "Faiz", "Agung", "Vira"}, // Badminton
            {"Mera", "Hana", "Rea", "Reza", "Isna"}, // Tenis Meja
            {"Dimas", "Farhan", "Vincent", "Gaby", "Batavia"}, // Basket
            {"Dio", "Dandi", "Chiko", "Eca", "Reika"} // Bola Voly
        };

        String [] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        for (int i = 0; i < atlet.length; i++) { // perulangan menampilkan cabor
            System.out.println(cabor[i] + ":");

            for ( int j = 0; j < atlet[i].length; j++) { // perulangan menampilkan atlet
                System.out.println("Atlet ke -" + (j+1) + " adalah " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}
