package gunler.gun11_20.gun14.gun14_ForLoops;

public class Loop2 {
    public static void main(String[] args) {
        //dongu 0 dan 10 a
        for (int i=0;i<10;i++){
            System.out.println("i = " + i);
        }

        System.out.println("//////////////////////");

        // dongu 10 dan 0 a

        for (int i=10;i>0;i--){
            System.out.println("i = " + i);
        }

        System.out.println("//////////////////////");

        for (int i=28;i<=83;i+=8){
            System.out.println("i = " + i);
        }

        System.out.println("//////////////////////");

        //1 den 50 ye kadar olan sayıların toplamını bulunuz.
            int sum=0;
         for (int i=0;i<=50;i++){
             System.out.println("i = " + i);
            sum += i;
             System.out.println("sum = " + sum);

         }

          System.out.println("//////////////////////");

         //Donguye değişkeni dışarıdan alarak da dinamik olarak kontrol edebiliriz.

         int result = 0;
         int lastPoint =100;

         for (int i=0;i<=lastPoint;i++){
             result += i;
         }
        System.out.println("Result = " + result);

    }
}
