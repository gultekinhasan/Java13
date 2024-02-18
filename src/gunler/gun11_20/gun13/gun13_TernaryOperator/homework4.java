package gunler.gun11_20.gun13.gun13_TernaryOperator;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kenarA, kenarB, kenarC;
        double aciA, aciB, aciC;
        String ucgenMi;

        System.out.println("Lütfen Kenar Uzunluklarını Sırasıyla Giriniz : ");
        kenarA = scanner.nextInt();
        kenarB = scanner.nextInt();
        kenarC = scanner.nextInt();


        System.out.println("Lütfen Acıları Sırasıyla Giriniz : ");
        aciA = scanner.nextDouble();
        aciB = scanner.nextDouble();
        aciC = scanner.nextDouble();

        ucgenMi = ((aciA + aciB +aciC == 180)&&(kenarA +kenarB>kenarC))? " Bu bir üçgendir."
                :((aciA + aciB +aciC == 180)&&(kenarA +kenarC>kenarB))? " Bu bir üçgendir."
                :((aciA + aciB +aciC == 180)&&(kenarB +kenarC>kenarA))? " Bu bir üçgendir."
                : "Bu bir üçgen değildir.";
        System.out.println(ucgenMi);
    }
}
/* write a program that checks if a triangle is valid or not using ternary operator.
   sample : This is not a valid triangle.
   Kenar Uzunlukları: Bir üçgenin herhangi iki kenarı toplamı, üçüncü kenardan daha uzun olmalıdır.
   Bu, herhangi bir kenarın uzunluğu, diğer iki kenarın toplamından küçük olmalı gerektiği anlamına gelir.
   Bu şart, üçgen eşitsizliği ilkesi olarak bilinir. Matematiksel olarak ifade edilirse, a, b ve c üç kenarın uzunlukları ise:
    a + b > c
    a + c > b
    b + c > a
    Açılar: Bir üçgenin iç açıları toplamı 180 derece olmalıdır.
    Yani üçgenin iç açıları θ1, θ2 ve θ3 ise:
    θ1 + θ2 + θ3 = 180 derece
*/