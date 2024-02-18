package exercises.gun11;

public class tekrar {
    public static void main(String[] args) {
        // Write a program that checks if the given number is dividable to 2,3,5

        int sayi = 5;

        if (sayi%2==0){
            System.out.println("sayı 2 ile bölünebiliyor.");
            if (sayi%3==0){
                System.out.println("sayı 3 ile bölünebiliyor.");
            }else{
                System.out.println("sayı 3 ile bölünemiyor.");
            }
            if (sayi%5==0){
                System.out.println("sayı 5 ile bölünebiliyor.");
            }else {
                System.out.println("sayı 5 ile bölünemiyor.");
            }
        } else{
            System.out.println("sayı iki ile bölünemiyor.");
            if(sayi%3==0 ){
                System.out.println("sayı 3 ile bölünebiliyor.");
            }else{
                System.out.println("sayı 3 ile bölünemiyor.");
            }
            if (sayi%5==0){
                System.out.println("sayı 5 ile bölünebiliyor.");
            }else {
                System.out.println("sayı 5 ile bölünemiyor.");
            }
        }

    }
}
