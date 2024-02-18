package gunler.gun21_30.gun30_Review;
import java.util.Random;

public class RandomPassword {
    // "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()"

    public static void main(String[] args) {

        // 12 karakterli random bir password olusturan code yaziniz
        // "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()"

        int passwordLength = 12;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

        String password = generatePassword(passwordLength, characters);

        System.out.println("password = " + password);
    }

    public static String generatePassword(int passwordLength, String characters){

        String password = "";
        Random random = new Random();
        for(int i=0; i<passwordLength; i++){
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
        }
        return password;
    }
}
