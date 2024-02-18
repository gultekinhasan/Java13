package gunler.gun11_20.gun14.gun14_ForLoops;

public class Loop1 {
    public static void main(String[] args) {

        // dongu sayisini da dongu esnasinda kullabilir/bastirabiliriz.

        for (int i=0; i<=3; i++){
            System.out.println("i = " + i);
        }

        System.out.println("----------------");

          //donguyu istedigimiz noktadan baslatabiliriz.

        for (int i=10;i<20;i++){
            System.out.println("i = " + i);
        }

        System.out.println("----------------");

         //donguyu istediğimiz oranda arttırabiliriz.

        for (int i=1;i<=10;i+=2){
            System.out.println("i = " + i);
        }

        System.out.println("----------------");

        // donguyu arttırmadığımız takdirde, sonsuz döngüye düşeriz,
        //değişken değeri değişmediği için condition sürekli doğru döner.
       /* for (int j=0;j<10;){

            System.out.println("j = " + j); // j=0 sonsuz dögüsüne girer.
        }*/
    }
}
