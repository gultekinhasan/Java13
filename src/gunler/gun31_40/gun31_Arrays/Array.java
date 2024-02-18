package gunler.gun31_40.gun31_Arrays;

public class Array {
    public static void main(String[] args) {

        //Declaring an Array
        //1.way
        int [] sayilar ;
        String [] kelimeler;
        double [] oranlar;

        //2.way
        int sayilar2[];
        String kelimeler2[];
        double oranlar2[];

        // Creating an Array
        //1.way // with different statement's
        int sayilar3[];
        sayilar3 = new int[5];

        //2.way // with same statement
        int[]sayilar4 = new int[10];

        // int [5] sayilar5 = new int []; //error!!!

        int size =10;
        int[]sayilar5=new int[size];

        // Assigning value to arrays
        int [] sayilar6 = new int[5];
        sayilar6[0] = 10; // first index
       // sayilar6[1] = 5;
        sayilar6[2] = 7;
        sayilar6[3] = 8;
        sayilar6[4] = 9;

        sayilar6[0] = 15;

        //Reading value from an Array
        System.out.println(sayilar6[0]);
        System.out.println(sayilar6[1]);
        System.out.println(sayilar6[2]);
        System.out.println(sayilar6[3]);
        System.out.println(sayilar6[4]);



        int sayi = sayilar6[3];
        System.out.println("sayi = " + sayi);
    }
}
