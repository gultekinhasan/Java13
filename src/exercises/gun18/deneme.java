package exercises.gun18;

public class deneme {
    public static void main(String[] args) {

        int sum= 0;
        int sayi =0;
        while (sayi<27){
            sayi++;
            sum += sayi;
            if (sum>=180){
                break;
            }
        }
        System.out.println("sayi = " + sayi);
        System.out.println("sum = " + sum);
    }
}