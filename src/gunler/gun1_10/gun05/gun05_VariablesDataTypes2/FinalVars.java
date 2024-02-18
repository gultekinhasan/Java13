package gunler.gun1_10.gun05.gun05_VariablesDataTypes2;

public class FinalVars {
    public static void main(String[] args) {
        //final anahtar kelimesi ile tanımlanan değişkenler SABİT(Constant) olarak tanımlanırlar
        //
        int number = 10;
        System.out.println(number);

        number = 45;
        System.out.println("number = " + number);

        final double KDV = 0.18; //Constant variables
        System.out.println("KDV = " + KDV);

        /// KDV = 0.25; // Error-- final variables values can not be changed after first initialization
        final double FAIZ_ORANI = 3.5;
        System.out.println("FAIZ_ORANI = " + FAIZ_ORANI);

        final double PI = 3.14;
        System.out.println("PI = " + PI);
    }
}
