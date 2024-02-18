package exercises.gun36;

public class exercise {
    //        //iki array kabul eden bir method oluşturun,
    //        // method,arraylerin eleman sayısının birden fazla olduğunu kontrol etmeli değilse mesaj iletmeli
    //        // method, arraylerin ilk veya son indexlerdeki elemanların aynı olup olmadığını kontrol etsin,
    //        // aynı ise true, değilse false mesajını dönsün
    //        // örn:int[] y={2,3,4};    ==>true
    //        //    int[] z={1,8,4};
    //
    //        // örn:int[] a={1,2,3}; ==>false
    //        //    int[] b={7,4,9};

    public static void main(String[] args) {
        int[] num1 = {1,7,8,10};
        int [] num2 = {5,8,10};
        System.out.println(asd(num1,num2));
    }
    public static String asd (int [] array1, int[]array2 ){
        if (array1.length<1 && array2.length<1){
           return ("en az 2 indexli bir dizi giriniz");
        }
        if (array1 [0]==array2[0] || array1[array1.length-1]==array2[array2.length-1]){
            return "true";
        }else return "false";
    }
}
