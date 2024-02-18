package gunler.gun1_10.gun09.gun09_Review;

public class AlarmSistemi {
    public static void main(String[] args) {
        System.out.println("Alarm sistemi");
        //sensors
        boolean anaKapi = false;
        boolean pencere1 = false;
        boolean pencere2 = false;
        boolean pencere3 = false;
        boolean balkonKapisi = false;

        boolean alarmTetiklendi = false;

        System.out.println("anaKapi = " + anaKapi);
        System.out.println("pencere1 = " + pencere1);
        System.out.println("pencere2 = " + pencere2);
        System.out.println("pencere3 = " + pencere3);
        System.out.println("balkonKapisi = " + balkonKapisi);
        System.out.println("alarmTetiklendi = " + alarmTetiklendi);
        System.out.println("");

        pencere3 = true;

        alarmTetiklendi = anaKapi || pencere1 || pencere2 || pencere3;

        System.out.println("anaKapi = " + anaKapi);
        System.out.println("pencere1 = " + pencere1);
        System.out.println("pencere2 = " + pencere2);
        System.out.println("pencere3 = " + pencere3);
        System.out.println("balkonKapisi = " + balkonKapisi);
        System.out.println("alarmTetiklendi = " + alarmTetiklendi);
        System.out.println("");

        pencere3 = false;
        balkonKapisi = true;
        alarmTetiklendi = anaKapi || pencere1 || pencere2 || (pencere3 && balkonKapisi);

        System.out.println("anaKapi = " + anaKapi);
        System.out.println("pencere1 = " + pencere1);
        System.out.println("pencere2 = " + pencere2);
        System.out.println("pencere3 = " + pencere3);
        System.out.println("balkonKapisi = " + balkonKapisi);
        System.out.println("alarmTetiklendi = " + alarmTetiklendi);
        System.out.println("");


        pencere3 = true;
        balkonKapisi = true;
        alarmTetiklendi = anaKapi || pencere1 || pencere2 || (pencere3 && balkonKapisi);

        System.out.println("anaKapi = " + anaKapi);
        System.out.println("pencere1 = " + pencere1);
        System.out.println("pencere2 = " + pencere2);
        System.out.println("pencere3 = " + pencere3);
        System.out.println("balkonKapisi = " + balkonKapisi);
        System.out.println("alarmTetiklendi = " + alarmTetiklendi);
        System.out.println("");





    }
}
