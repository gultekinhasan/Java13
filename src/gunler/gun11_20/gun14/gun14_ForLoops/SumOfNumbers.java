package gunler.gun11_20.gun14.gun14_ForLoops;
public class SumOfNumbers {
    public static void main(String[] args) {
        // 1 ile 100 arasındaki çift ve tek sayıların ayrı ayrı toplamını bulan bir program yazınız.


       // 1.yol(kendi yaptığım)
        int sum=0;
        int sum2=0;

        for (int i=0;i<=100;i+=2){
            sum +=i;
        }
        System.out.println("sum = " + sum);

        for (int i=1;i<=100;i+=2) {
            sum2 += i;
        }
        System.out.println("sum2 = " + sum2);


        //2.yol

                int tekSayilar = 0;
                int ciftSayilar = 0;

                for(int i=0; i<=100; i++){
                    if(i%2==0){
                        ciftSayilar += i;
                    }else{
                        tekSayilar += i;
                    }
                }

                System.out.println("tekSayilar = " + tekSayilar);
                System.out.println("ciftSayilar = " + ciftSayilar);










    }
}
