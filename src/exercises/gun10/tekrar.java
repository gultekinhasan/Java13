package exercises.gun10;

import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yas;
        System.out.println("Lütfen Yasınızı Giriniz : ");
        yas = scanner.nextInt();

        if (yas<18)
            System.out.println("Oy Kullanamazsınız.");
        else{
            System.out.println("Oy kullanabilirsiniz." );
        }

        System.out.println("///////////////////////////////////////////");
        System.out.println();
        // Write an if statement that increases pay by 3% if score is greater than 90
        // otherwise increases pay by 1%
        // Eger score 90 dan buyuk ise, odemeyi %3, degil ise %1 arttiran bir if statement yaziniz

        int score = 95;
        int salary = 100;

        if (score>0 && score<90){
            salary += (salary *1)/100 ;
            System.out.println("salary = " + salary);
        } else if (score >= 90 && score<101) {
            salary+=(salary *3)/100 ;
            System.out.println("salary = " + salary);

        }else{
            System.out.println("Hatalı bir score girdiniz...");
        }
        System.out.println("////////////////////*");
        System.out.println();



    }
}
