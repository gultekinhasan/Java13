package exercises.gun11;

public class odev {
    public static void main(String[] args) {
        //Asagidaki yas ve zaman araligina gore sinema bilet fiyatlarini tespit eden bir program yazınız
        //
        //Bilet fiyatları:
        //
        //Cocuk (yas 0-12): 5 tl
        //Genc (yas 13-17): 8 tl
        //Yetiskin (yas 18-64): 12 tl
        //Yasli (yas 65+): 6 tl
        //Eger 5:00 PM den onceki seans ise fiyatlar:
        //
        //Cocuk (yas 0-12): 4 tl
        //Genc (yas 13-17): 7 tl
        //Yetiskin (yas 18-64): 10 tl
        //Yasli (yas 65+): 5 tl
        //not: Nested if ve if - Else if i birlikte kullanarak


        int age = 69;
        String fiyat = "";
        double zaman = 9.40;


        if (zaman >= 10.0 && zaman <= 22.0) {
            if (zaman >= 10.0 && zaman <= 16.59) {
                if (age >= 0 && age <= 12) {
                    fiyat = "4 tl";
                } else if (age >= 13 && age <= 17) {
                    fiyat = "7 tl";
                } else if (age >= 18 && age <= 64) {
                    fiyat = "10 tl";
                } else if (age >= 65) {
                    fiyat = "5 tl";
                }
            } else {
                if (zaman >= 17.0 && zaman <= 22.0) {
                    if (age >= 0 && age <= 12) {
                        fiyat = "5 tl";
                    } else if (age >= 13 && age <= 17) {
                        fiyat = "8 tl";
                    } else if (age >= 18 && age <= 64) {
                        fiyat = "12 tl";
                    } else if (age >= 65) {
                        fiyat = "6 tl";
                    }
                }
            }

            System.out.println("Bilet fiyatı " + fiyat + "dir");
        } else {
            System.out.println("Salonumuz kapalıdır.  ");
        }
    }
}






