package gunler.gun11_20.gun20.gun20_Methods2;

public class SumOfNumbers {
    public static void main(String[] args) {
        // 1den verilen sayıya kadar olan değerleri tek ve çift olarak ayrı ayrı toplayan method.

        int number=30;
        sumOfEvens(number);
        sumOfOdds(number);


    }
    public static void sumOfOdds(int num){
        int sumOfOdds =0;
        for (int i=1;i<=num;i++){
            if(i%2==1){
                sumOfOdds += i;
            }
        }
        System.out.println("sum of odds = " + sumOfOdds);
    }
    public static void sumOfEvens(int num){
        int sumOfEvens =0;
        for (int i=1;i<=num;i++){
            if(i%2==0){
                sumOfEvens += i;
            }
        }
        System.out.println("sum of odds = " + sumOfEvens);
    }
}
