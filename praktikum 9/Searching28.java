public class Searching28 {
    public static void main(String[] args) {
        int array [] = {6, 4, 1, 9, 7, 3, 2, 8};
        int key = 3;
        int hasil = 0;

        for (int i=0; i<array.length; i++)
        {
            if (key==array[i])
            {
                hasil=i;
                break;
            }
        }
        System.out.println("key " +key+ " terdapat di index = " +hasil);
    }
}
