package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;
import java.util.Scanner;
public class SwitchCaseContinueBreakLabeled {
    //Switch case yapısı içerisinde Labeled ifadeler ve break ve continue branching ifadelerinin kullanımına örnek kod
        /*
        Labels
            -anaMenu
            -bankaIslemler
            -krediIslemler
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secenek;

        anaMenu:
        while (true) {
            System.out.println("Ana Menu");
            System.out.println("---------");
            System.out.println("1-Banka işlemleri");
            System.out.println("2-Kredi işlemleri");
            System.out.println("3-Programdan çıkış");
            System.out.println();
            System.out.print("Seçeneğiniz----> ");
            secenek = input.nextInt();
            switch (secenek) {
                case 1:
                    bankaIslemleri:
                    while (true) {
                        System.out.println("Banka işlemleri menüsü");
                        System.out.println("1-Para çekme");
                        System.out.println("2-Para yatırma");
                        System.out.println("3-Ana menü");
                        System.out.println();
                        System.out.print("Seçeneğiniz----> ");
                        secenek = input.nextInt();
                        switch (secenek) {
                            case 1:
                                System.out.print("Çekeceğiniz miktarı giriniz : ");
                                secenek = input.nextInt();
                                System.out.println(secenek + " Para çektiniz.");
                                continue;
                            case 2:
                                System.out.print("Yatıracağınız miktarı giriniz : ");
                                secenek = input.nextInt();
                                System.out.println(secenek + " Para yatırdınız.");
                                continue;
                            case 3:
                                continue anaMenu;
                            default:
                                System.out.println("<<<Yanlış sçim yaptınız>>>");
                        }
                    }
                case 2:
                    krediIslemleri:
                    while (true) {
                        System.out.println("Kredi işlemleri");
                        System.out.println("1-Ektsre görüntüleme");
                        System.out.println("2-K.Kartı borç ödeme");
                        System.out.println("3-Ana menü");
                        System.out.println("4-Programdan çık");
                        System.out.println();
                        System.out.print("Seçeneğiniz----> ");
                        secenek = input.nextInt();

                        switch (secenek) {
                            case 1:
                                System.out.println("Ektsre görüntülendi...");
                                continue;
                            case 2:
                                System.out.println("Kredi kartı borcu ödendi.");
                                continue;
                            case 3:
                                continue anaMenu;
                            case 4:
                                break anaMenu;
                            default:
                                System.out.println("<<<Yanlış sçim yaptınız>>>");
                        }
                    }
                case 3:
                    break anaMenu;
            }
        }
        System.out.println("Bankamızı tercih ettiğinz için teşekkürler..");
    }
}
