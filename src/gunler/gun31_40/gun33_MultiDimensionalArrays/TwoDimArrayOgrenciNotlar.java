package gunler.gun31_40.gun33_MultiDimensionalArrays;
import java.util.Arrays;

public class TwoDimArrayOgrenciNotlar {
    public static void main(String[] args) {
        int[] ogrenci1; //Declaration
        ogrenci1 = new int[]{50,68,90}; // Assignment
        int[] ogrenci2 = {90,45,100};
        int[] ogrenci3 = {35,78,80};
        int[] ogrenci4 = {90,45,45};

        //Ogrenciler tablosu- two dim array
        int[][] ogrenciler = new int[5][3];
        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;
        ogrenciler[3] = ogrenci4;
        ogrenciler[4] = new int[]{78,90,34};

        System.out.println(Arrays.deepToString(ogrenciler));

        ogrenciler[0][2] = 100; // 1.Ogrencinin 3. notunu 100 olarak değiştirdik
        System.out.println(Arrays.deepToString(ogrenciler));

        for (int satir = 0; satir < ogrenciler.length; satir++) {
            System.out.print((satir + 1) + " .öğrencinin notları : " );
            for (int notlar = 0; notlar < ogrenciler[satir].length; notlar++) {
                System.out.print(ogrenciler[satir][notlar] + "  ");
            }
            System.out.println();
        }
    }
}
