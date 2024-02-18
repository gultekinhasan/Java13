package gunler.gun31_40.gun35_Review;

public class WrapperParseStrRetArr {
    //Write a program to parse a string and return array of letter, digit and special chars
    public static String[] parseStr(String str) {
        /*
            result[0] ---> letters
            result[1] ---> digits
            result[2] ---> special chars
         */
        String[] result = new String[3];
        //Initialise array
//        result[0] = "";
//        result[1] = "";
//        result[2] = "";

        for (int i = 0; i < result.length; i++) {
            result[i] = "";
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result[0] += str.charAt(i); //letters
            } else if (Character.isDigit(str.charAt(i))) {
                result[1] += str.charAt(i);

            } else {
                result[2] += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "Ä±ury%quJH423&AJHKSJklj99jsdn8737?jndq**.kusdhd,765765";
        String[] parseStringArr = parseStr(input);

        System.out.println("Letters           : " + parseStringArr[0]);
        System.out.println("Number of letters : " + parseStringArr[0].length());

        System.out.println("Digits            : " + parseStringArr[1]);
        System.out.println("Number of digits  : " + parseStringArr[1].length());

        System.out.println("Special chars     : " + parseStringArr[2]);
        System.out.println("Number of Special : " + parseStringArr[2].length());
    }
}
