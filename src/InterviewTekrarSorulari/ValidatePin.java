package InterviewTekrarSorulari;

import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Lutfen pin giriniz");
            String sayi = scanner.nextLine();
            for (int i =0;i<sayi.length();i++){
                    if (Character.isDigit(i)&&(sayi.length()==4 || sayi.length()==6) && sayi.isBlank()){
                        System.out.println("Gecerli Pin...");
                        break;
                    } else System.out.println("gecersiz pin...");
            }
        }
    }

