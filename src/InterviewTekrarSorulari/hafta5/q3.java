package InterviewTekrarSorulari.hafta5;

public class q3 {
    /*
    Write a Java program to calculate the factorial of a given number.
For example, if the input is 5, the output should be 120 (5! = 5 x 4 x 3 x 2 x 1).
    */
    public static void main(String[] args) {
        int sayi= 5;
        int Faktoriyel = 1;
        for (int i = 2; i <= sayi; i++) {
            Faktoriyel *= i;
        }
        System.out.println(Faktoriyel);
    }
}
