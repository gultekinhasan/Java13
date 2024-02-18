package gunler.gun31_40.gun31_Arrays;

public class AlternatifYol {
    public static void main(String[] args) {
        //1.yol
        int [] numbers;

        //2.yol
        int numbers2 [];

        //3.yol
        int [] numbers3,numbers4,numbers5;

        //4.yol
        int numbers6,numbers7,numbers8 [];

        //5.yol
        int numbers9 [] ,numbers10 [], numbers11 [];

      //  int [] numbers12, [] numbers13 ,[] numbers14; // error!!!

        int [] numbers15 = {10,15,20,25,30,35};
        System.out.println(numbers15[0]);
        System.out.println(numbers15[1]);
        System.out.println(numbers15[2]);
        System.out.println(numbers15[3]);
        System.out.println(numbers15[4]);
        System.out.println(numbers15[5]);
      //  System.out.println(numbers15[6]); // error // ArrayIndexOutOfBoundsException

        System.out.println(numbers15); // array obj ref number

        // numbers15[6] =40; // error // ArrayIndexOutOfBoundsException

        // Alternatif yol ile array create etmek ancak ayni statement ile mumkun
        // int [] numbers16;
        // numbers16 = {1, 2, 3, 4, 5}; // Error



    }
}
