package exercises.gun29;

public class homework2 {

    public static String reverseWord(String word){
       String sonuc="";
        for (int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
        return sonuc;
    }

    public static void main(String[] args) {
        //  Write a return method that can reverse a String
        // Ex: Reverse("ABCD"); ==> DCBA

        System.out.println(reverseWord("arabulucu"));
        System.out.println(reverseWord("hasan"));
        System.out.println(reverseWord("almanya"));
    }
}
