package gunler.gun11_20.gun13.gun13_TernaryOperator;

public class IfElseTernary {
    public static void main(String[] args) {

        int number = 40;

        //if else
        if (number>0){
            System.out.println(number + " Pozitif bir sayıdır. ");
        }else {
            System.out.println(number + " Negatif bir sayıdır. ");
        }
        System.out.println();

        //Ternary Version
        System.out.println( "Ternary Version");
        String result;
        result = (number>0) ? number + " Pozitif bir sayıdır." : number + " Negatif bir sayıdır.";
        System.out.println(result);

        // az tercih edilen yol

        System.out.println(number > 0 ? + number + " pozitif tam sayidir." : + number + " negatif tam sayidir. ");


        //Hatalı bir işlem
        // result = (number > 0) ? System.out.println(number + " positif bir sayıdır.") : System.out.println(number + " negatif bir sayıdır.");


    }
}
