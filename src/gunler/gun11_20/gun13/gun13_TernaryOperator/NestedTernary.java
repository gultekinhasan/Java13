package gunler.gun11_20.gun13.gun13_TernaryOperator;

public class NestedTernary {
    public static void main(String[] args) {

        // iki tam sayıdan en büyüğünü ekrana yazdıran programı yazınız.

        int num1, num2,num3, max;
        num1 = 15;
        num2 = 34;
        num3 = 150;
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        System.out.println("num1 = "+ num1+ "num2 = " + num2 + "\nEn büyük sayı = " + max);

        //ternary
        System.out.println("ternary...");

        max= (num1>num2)? num1:num2;
        System.out.println("num1 = "+ num1+ "num2 = " + num2 + "\nEn büyük sayı = " + max);
        System.out.println();

        //nested if
        if (num1>num2 && num1>num3){
            max = num1;
            }else if (num2>num3){
                max = num2;
        }else {
                max = num3;
        }
        System.out.println("en büyük sayı = " + max);

        //ternary
        System.out.println("ternary...");


        //Ternary syntax
        // (condition) ? Expression-1 : Expression-2

        //          (condition-1)                        (Exp-1)                                         (Exp-2)
        //                                 (condition-2)        Exp-1)   (Exp-2)      (condition-3)        (Exp-1)   (Exp-2)
        //  max = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3);

        // max = (number1 > number2 && number1 > number3) ? number1 : number2 > number3 ? number2 : number3;
        // max = ( number1>number2)? number1 :(number2>number3)?number2 :number3;

        max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("En büyük sayı = " + max);









    }
    }

