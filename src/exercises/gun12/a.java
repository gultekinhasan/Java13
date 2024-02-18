package exercises.gun12;


import java.util.Scanner;

public class a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("     ABC Bankasına hoş geldiniz.    ");
        System.out.println("------------------------------------");
        System.out.println("        1-Bakiye Görüntüleme.       ");
        System.out.println("        2-Para Çekme.               ");
        System.out.println("        3-Para Yatırma.             ");
        System.out.println("        4-Çıkış.                    ");
        System.out.println("Hangi işlemi yapmak istiyorsunuz--->");

        int secim = scanner.nextInt();
        int bakiye = 5000;

        switch (secim){
            case 1: //Bakiye Görüntüleme
                System.out.println("Bakiyeniz = "+bakiye+ " TL");
                break;
            case 2: // Para Çekme
                System.out.println("Çekmek istediğiniz para miktarını giriniz : ");
                int miktar = scanner.nextInt();
                if (miktar>bakiye){
                    System.out.println("Yetersiz Bakiye..");
                    System.out.println("En fazla çekebileceğiniz para "+ bakiye + "TL'dir.");
                }else{ // bakiye =bakiye-miktar
                    bakiye-=miktar;
                    System.out.println("Güncel Bakiyeniz = " + bakiye + "TL'dir.");
                }
                break;
            case 3: //Para Yatırma
                System.out.println("Yatırmak istediğiniz para miktarını giriniz.");
                miktar = scanner.nextInt();
                bakiye += miktar;
                System.out.println("Güncel Bakiyeniz = "+ bakiye+ "TL'dir");
                break;
            case 4:
                System.out.println("Bankamızı tercih ettiğiniz için teşekkür ederiz.");
                break;
            default:
                System.out.println("Geçersiz işlem ! ");
        }
    }
}