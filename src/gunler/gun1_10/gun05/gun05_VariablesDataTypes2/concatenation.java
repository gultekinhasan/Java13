package gunler.gun1_10.gun05.gun05_VariablesDataTypes2;

public class concatenation {
    public static void main(String[] args) {
        // + operatörü String bir ifade ile kullanılırsa concat. / yan yana getirme/ birleştirme/ bir araya getirme işlemi yapılır.//
        String firstName = "Ahmet";
        String lastName = "Falanca";
        String firstNameLastName = "";

        firstNameLastName = firstName + lastName; // concatenation of two String
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstNameLastName);

        firstNameLastName= firstName + "-" + lastName;
        System.out.println(firstNameLastName);


        //numeric
        int sayıA = 12;
        int sayıB = 6;
        int toplam;

        toplam = sayıA + sayıB; // + operatörü aritmetik işlem yapar
        System.out.println("toplam = " + toplam); // concanenation.. left is String

        System.out.println("toplam = " + sayıA + sayıB ); // "a=" +sayıA + sayıB --> "toplam=126"
        System.out.println("toplam = " + (sayıA+sayıB)); // "toplam =" + (12+6) --> "toplam=18"
        System.out.println(sayıA + " sayı " + sayıB); // "12 sayı" + sayıB --> "12 sayı 6"
        System.out.println(sayıA + sayıB + "bir tam sayıdır"); // "12 + 6 --> 18+  "bir tam sayıdır." --> 18 bir tam sayıdır.

        int age= 45;
        System.out.println(firstName + " " + lastName + " " + age + " yaşındadır."   );





    }
}
