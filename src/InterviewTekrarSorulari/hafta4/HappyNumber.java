package InterviewTekrarSorulari.hafta4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
/*
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example:
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
public static int sumOfSquares(int num){  // 19-->82
    int sum=0;
    while (num>0){
        int digit = num%10;
        sum += digit*digit;
        num = num/10;
    }
    return sum;
}
public static boolean isHappy(int number) {
    ArrayList<Integer>st = new ArrayList<>();
    while (number != 1 && !st.contains(number)) {
        st.add(number);
        number = sumOfSquares(number);
    }
    return number == 1;
}
    public static void main(String[] args) {
        System.out.println("isHappy(19) = " + isHappy(19));
        System.out.println(isHappy(123));
        System.out.println(sumOfSquares(192));
    }
}
