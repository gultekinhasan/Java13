package gunler.gun11_20.gun17.gun17_Review;
public class FizzBuzz {
    public static void main(String[] args) {
        /*
        1 den 100 e kadar sayıları yazdırınız.
        Algoritma:
            -Eğer bir sayı 3'e tam bölünebiliyorsa ekrana "Fizz" yazdırın.
            -Eğer bir sayı 5'e tam bölünebiliyorsa ekrana "Buzz" yazdırın.
            -Eğer bir sayı hem 3'e hem de 5'e tam bölünebiliyorsa ekrana "FizzBuzz" yazdırın.
         */
        for(int i=1; i<=100; i++){

            if(i%3 == 0 && i%5 == 0){
                System.out.println(i + " FizzBuzz");
            }else if(i%3 == 0){
                System.out.println(i + " Fizz");
            }else if(i%5 == 0){
                System.out.println(i + " Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
