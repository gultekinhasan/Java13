package gunler.gun1_10.gun04.gun04_variables;


public class odevvariables {
    public static void main(String[] args) {
           /* Homework:
            Değişkenler kullanarak aşağıdaki kasa fişini hesaplayan ve ekrana yazdıran bir program yazınız.
        */
        String header=   "      L O V E   P O D C A S T   ";
        String footer=      "      THANK YOU FOR LISTENING java!         ";
        String dashline= "//---------------------------------------//";
        double itemThree = 67.98;
        double itemFour = 12.39;
        double itemOne = 23.50;
        double itemTwo = 3.21;
        double loyaltyListener = 5;
        double cash= 105;
        double subtotal= itemOne + itemTwo + itemThree + itemFour;
        double totalAmount= subtotal-loyaltyListener;
        double change= cash-totalAmount;


     subtotal= 107.08;

     totalAmount= 102.08;

     change= 2.92;



        System.out.println(header    );
        System.out.println(dashline  );
        System.out.println("itemOne   :"+ itemOne    +"$"           );
        System.out.println("itemTwo   :"+ itemTwo    +"$"           );
        System.out.println("itemThree :"+ itemThree  +"$"           );
        System.out.println("itemFour  :"+ itemFour   +"$"           );
        System.out.println("subtotal  :" +subtotal + "$"            );
        System.out.println("loyaltyListener :" +loyaltyListener +"$");
        System.out.println(dashline);
        System.out.println("totalAmount :" + totalAmount + "$"      );
        System.out.println("cash :" + cash + "$"                    );
        System.out.println("change :"+ change + "$"                 );
        System.out.println(dashline);
        System.out.println(footer);
        System.out.println(dashline);
    }
    }



