package gunler.gun11_20.gun11.gun11ControlFlowStatement2;

public class MultiwayIfElseExample {
    public static void main(String[] args) {

        int dayOfWeek = 7;

        if (dayOfWeek == 1) {
            System.out.println("It's Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("It's Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("It's Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("It's Thurday");
        } else if (dayOfWeek == 5) {
            System.out.println("It's Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("It's Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("It's Sunday");
        } else {
            System.out.println("Invalid day of the week.");
        }

        System.out.println("----------------------------------");


        //Öğrenci Puan Durumu//

        int puan = 81;
        char not = 'F';

        if (puan >= 0 && puan <= 100) {
            if (puan >= 90) {
                not = 'A';
            } else if (puan >= 80) {
                not = 'B';
            } else if (puan >= 70) {
                not = 'C';
            } else if (puan >= 60) {
                not = 'D';
            } else if (puan >= 50) {
                not = 'E';
            } else {
                not = 'F';
            }
            System.out.println("not = " + not);
        }

    }

}

