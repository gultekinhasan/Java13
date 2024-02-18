package gunler.gun31_40.gun33_MultiDimensionalArrays;
import java.util.Arrays;

public class TwoDimArrayPrint {

    public static void main(String[] args) {
        double[][] doubleSayilar = new double[5][3];

       // *1* //Arrays class ının .deepToString() metodu ile iki boyutlu bir dizinin elemanlarını yazdırma
        System.out.println("Arrays.deepToString(doubleSayilar) = " + Arrays.deepToString(doubleSayilar));

        System.out.println();

       // *2* //Traverse Rows of the Two dim array
        for (int i = 0; i < doubleSayilar.length; i++) {
            //Each row is an array---> Arrays.toString() metodu ile tek boyutlu dizinin elemenlarını yazdırma
            System.out.println("Arrays.toString(doubleSayilar[i]) = " + Arrays.toString(doubleSayilar[i]));
        }
        System.out.println();

        // *3*
        System.out.println("For loop .....");
        for (int i = 0; i < doubleSayilar.length; i++) {
            for (int j = 0; j < doubleSayilar[i].length; j++) {
                System.out.print(doubleSayilar[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println();

        // *4* //For each ---> advanced for loop
        System.out.println("For each ---> advanced for loop");
        for (double[] sayilar : doubleSayilar) { //Traverse rows of the array
            for (double sayi : sayilar) { //Traverse columns of the row
                System.out.print(sayi + "\t\t"); //  \t -->tab tuşu ---> eşit boşluk eklesin diye kullandık
            }
            System.out.println();
        }

        System.out.println();

        // *5*
        for (double[] sayilar : doubleSayilar) {
            System.out.println(Arrays.toString(sayilar));
        }
    }
}