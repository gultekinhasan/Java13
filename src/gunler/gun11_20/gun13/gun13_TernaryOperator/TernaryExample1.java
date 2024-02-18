package gunler.gun11_20.gun13.gun13_TernaryOperator;

import java.util.Scanner;

public class TernaryExample1 {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);

        int age;
        String name;

        System.out.print("Lütfen adınızı giriniz : ");
        name = veriGir.nextLine();

        System.out.print("Lütfen yaşınızı giriniz : ");
        age = veriGir.nextInt();

        String mesaj = (age > 18) ? "Oy kullanabilirsiniz." : "Oy kullanamazsınız.";
        System.out.println(name + " " + age + " yaşındasınız " + mesaj);

        //  böyle de yazılabilir
        //  System.out.println(name + " " + age + " yaşındasınız " + ((age > 18) ? "Oy kullanabilirsiniz." : "Oy kullanamazsınız."));
    }
}
