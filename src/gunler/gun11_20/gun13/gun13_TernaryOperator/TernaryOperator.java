package gunler.gun11_20.gun13.gun13_TernaryOperator;


public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Ternary operators in JAVA.");
        int x,y;
        x = 20;

        if(x < 15){ //condition
            //true
            y = 50;
            System.out.println("inside if -> y = " + y);
        } else{
            //false
            y = 90;
            System.out.println("inside if -> y = " + y);
        }
        System.out.println(" y = " + y);
        //Ternary version
        y = (x < 15) ? 50 : 90;
        System.out.println(" y = " + y);

        System.out.println(" y = " + ((x < 15) ? 50 : 90));

        int sayi = 100 + ((x < 15) ? 50 : 90);
        System.out.println("sayi = " + sayi);

        // y = (x == 20) ? System.out.println("(ternary) y = " + y) : System.out.println("y = " + y) ; // Error
    }
}


