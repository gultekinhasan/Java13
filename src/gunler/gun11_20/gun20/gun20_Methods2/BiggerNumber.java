package gunler.gun11_20.gun20.gun20_Methods2;

public class BiggerNumber {
    public static void main(String[] args) {

        // Verilen iki rakmdan buyuk olani tespit eden 2 argument alan method yaziniz

        biggerNumber(5,6);
        biggerNumber(7,5);
        biggerNumber(155,154);
        biggerNumber(10,10);
        biggerNumber(54,69);


    }

    public static void biggerNumber(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1 + " is bigger number than " + num2);
        }else if (num2>num1){
            System.out.println(num2 + " is bigger number than " + num1);
        }else{
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}

