package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;
import java.util.Scanner;
public class WhileLoopExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;

        System.out.print("Yaşınızı giriniz : ");
        age = sc.nextInt();
        //Tekrar bloğunun çalışıp çalışmayacağına tekrar bloğuna girmeden önce karar verir.
        while (age > 100 || age < 0) {
            System.out.println("Yaş bilginiz geçersiz!!!");
            System.out.println("Yaş bilgisi 0'dan büyük 100'den küçük olmalı");
            System.out.print("Yaşınızı tekrar giriniz : ");
            age = sc.nextInt();
        }
        System.out.println("Yaşınız = " + age);

        //En az bir kere tekrar(loop) bloğuna girer. Tekrar bloğunun decam edip etmeyeceğine sonra karar verir
        do {
            System.out.println("Yaş bilgisi 0'dan büyük 100'den küçük olmalı.");
            System.out.print("yaşınızı giriniz(do while) : ");
            age = sc.nextInt();
        }while (age > 100 || age < 0);
        System.out.println("Yaşınız = " + age);
    }
}
