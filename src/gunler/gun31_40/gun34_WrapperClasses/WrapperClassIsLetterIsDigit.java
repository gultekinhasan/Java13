package gunler.gun31_40.gun34_WrapperClasses;

public class WrapperClassIsLetterIsDigit {
    public static void parseString(String str){
        String letters = "";
        String numbers = "";
        String specialChars = "";
        int countLetters = 0;
        int countDigits = 0;
        int countSpecial = 0;

        System.out.println(str);
        System.out.println("---------------------------------------");

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                letters += str.charAt(i);
                countLetters++;
            } else if (Character.isDigit(str.charAt(i))) {
                numbers += str.charAt(i);
                countDigits++;
            }else {
                specialChars += str.charAt(i);
                countSpecial++;
            }
        }
        System.out.println("Letters           = " + letters);
        System.out.println("Count of letters  = " + countLetters);
        System.out.println("Digits(numbers)   = " + numbers);
        System.out.println("Count of digits   = " + countDigits);
        System.out.println("Special chars     = " + specialChars);
        System.out.println("Count of Specials = " + countSpecial);
    }
    public static void main(String[] args) {
        String str = "Abc6846294**89812)7&5+89123ABc&4Ankara646-9813asa7";

//        System.out.println(Character.isLetter('A'));
//        System.out.println(Character.isLetter('1'));
//        System.out.println(Character.isLetter('?'));
//
//        System.out.println(Character.isDigit('b'));
//        System.out.println(Character.isDigit('9'));
//        System.out.println(Character.isLowerCase('D'));

        parseString(str);
    }
}
