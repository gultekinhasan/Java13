package gunler.gun1_10.gun10.gun10_ControlFlowStatement;

public class IfStatement {
    public static void main(String[] args) {

        System.out.println("code burada basladı");
        if (true){
            System.out.println("hello");
        }
        System.out.println("World");
        System.out.println("code burada bitti");

        System.out.println("-------------------------");

        System.out.println("code burada basladı");
        if (false){
            System.out.println("hello");
        }
        System.out.println("World");
        System.out.println("code burada bitti");

        System.out.println("-------------------------");

        int i =5;

        /* parantez olmadığı takdirde if statement hata verir
        if i > 0 {
            System.out.println(i + "is a positive number");
            }
         */

        if (i>0){
            System.out.println(i+"is a positive number");
        }

// If blogunda tek bir statement varsa block icin suslu parantez olmadan da code calısır.
        //ancak coklu statement durumunda hatali işleme sebep olacağından kullanımı çok tavsiye edilmez.


      /*  if (i>0)
            System.out.println(i+"is a positive number");
        if (i<0)
            System.out.println(i+"is a positive number");
        if (i<0)
            System.out.println(i+"is a positive number");
        */




    }
}
