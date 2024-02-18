package InterviewTekrarSorulari.hafta3;

public class Q2 {
    /*
    Q2- Digits Battle!

    Starting from the left side of an integer, adjacent digits pair up in "battle" and the larger digit wins. If two digits are the same,
    they both loose. Alone digit automatically wins.

    Create a function that returns the victorious digits.

    To illustrate:

    battleOutcome(578921445) ➞ 7925
    // [57]: 7 wins; [89] 9 wins; [21] 2 wins;
    // [44] neither wins; 5 (automatically) wins
    Examples
    battleOutcome(32531) ➞ 351
    // 3 defeats 2, 5 defeats 3, 1 is a single.

    battleOutcome(111) ➞ 1
    // 1 and 1 tie, so neither move on, last 1 is a single.

    battleOutcome(78925) ➞ 895

    Notes:
    There are no winners in a battle with equal digits (neither should be printed).
    If the length of the number is odd, the lone digit should be printed at the end of the number.
     */
        public static int battleOutcome(int number) {
            String numberStr = Integer.toString(number);
            String result = "";

            for (int i = 0; i < numberStr.length(); i += 2) {
                if (i + 1 < numberStr.length()) {
                    char firstDigit = numberStr.charAt(i);
                    char secondDigit = numberStr.charAt(i + 1);

                    if (firstDigit > secondDigit) {
                        result += firstDigit;
                    } else if (firstDigit < secondDigit) {
                        result += secondDigit;
                    } // If the digits are equal, they both lose, so we do nothing
                } else {
                    // If there's a single digit left, it automatically wins
                    result += numberStr.charAt(i);
                }
            }

            return Integer.parseInt(result);
        }

        public static void main(String[] args) {
            // Examples
            System.out.println(battleOutcome(578921445)); // Output: 7925
            System.out.println(battleOutcome(32531));     // Output: 351
            System.out.println(battleOutcome(111));       // Output: 1
            System.out.println(battleOutcome(78925));     // Output: 895
        }
    }





