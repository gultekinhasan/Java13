package gunler.gun31_40.gun33_MultiDimensionalArrays;
import java.util.Arrays;

public class TwoDimArrayPrintMethod {
    public static void printArray(int[][] dizi) {
        //Arrays.deepToString
        System.out.println("Arrays.deepToString() metodu ile yazdırma");
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.deepToString(dizi));
    }
    public static void printArray(String[][] dizi) {
        //Arrays.deepToString
        System.out.println("Arrays.deepToString() metodu ile yazdırma");
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.deepToString(dizi));
    }

    public static void printArrayFor(int[][] dizi) {
        //Klasik For loop ile yazdırma
        System.out.println("Klasik for loop ile yazdırma");
        System.out.println("----------------------------");

        System.out.println("Parametre olarak gelen 2 boyutlu dizi " + dizi.length + " satırdan oluşuyor");

        for (int i = 0; i < dizi.length; i++) { //Satırlar için outer for loop
            for (int j = 0; j < dizi[i].length; j++) { //Columns of each row
                System.out.print(dizi[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
    public static void printArrayFor(String[][] dizi) {
        //Klasik For loop ile yazdırma
        System.out.println("Klasik for loop ile yazdırma");
        System.out.println("----------------------------");

        System.out.println("Parametre olarak gelen 2 boyutlu dizi " + dizi.length + " satırdan oluşuyor");

        for (int i = 0; i < dizi.length; i++) { //Satırlar için outer for loop
            for (int j = 0; j < dizi[i].length; j++) { //Columns of each row
                System.out.print(dizi[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void printArrayForAdv(int[][] dizi){
        //Advanced For loop ile yazdirma
        System.out.println("Advanced For loop ile yazdirma(for each)");
        System.out.println("----------------------------------------");
        System.out.println("Parametre olarak gelen 2 boyutlu dizi " + dizi.length + " satırdan oluşuyor");

        //For each loop ile yazdırma
        for (int[] satir : dizi ){ //Satırlar için outer for loop
            for (int sayi : satir){ //Columns of each row
                System.out.print(sayi + "\t\t");
            }
            System.out.println();
        }
    }
    public static void printArrayForAdv(String[][] dizi){
        //Advanced For loop ile yazdırma
        System.out.println("Advanced For loop ile yazdırma(for each)");
        System.out.println("----------------------------------------");
        System.out.println("Parametre olarak gelen 2 boyutlu dizi " + dizi.length + " satırdan oluşuyor");

        //For each loop ile yazdırma
        for (String[] satir : dizi ){ //Satırlar için outer for loop
            for (String sayi : satir){ //Columns of each row
                System.out.print(sayi + "\t\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //int[][] numbers = new int[4][3];
        int[][] numbers = {
                {1, 2, 3},
                {34, 56, 2},
                {-2, 5, 9},
                {340, 6, 89}
        };

        String[][] isimler = {
                {"Ahmet","Mehmet"},
                {"Fatma","Ali"},
                {"Kaan","Zeki"}
        };

        printArray(numbers);
        System.out.println();

        printArrayFor(numbers);
        System.out.println();

        printArrayForAdv(numbers);
        System.out.println();


        printArray(isimler);
        System.out.println();

        printArrayFor(isimler);
        System.out.println();

        printArrayForAdv(isimler);

    }


}
