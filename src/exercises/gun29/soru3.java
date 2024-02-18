package exercises.gun29;

import java.util.Scanner;

public class soru3 {

    public static boolean ara(String word1, String word2) {
        boolean result = false;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.contains(word2)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        while (result){
            System.out.print("word1 giriniz   :");
            String word1 = scanner.nextLine();
            System.out.print("word2 giriniz   :");
            String word2 = scanner.nextLine();
            if(ara(word1,word2)){
                word2 =word1.replace(word1,"["+word1+"]");
                System.out.println(word1);
            }

        }

    }
}