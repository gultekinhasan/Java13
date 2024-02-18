package gunler.gun21_30.gun30_Review;

public class FrequencyOfChar {

    public static void main(String[] args) {

        // Verilen string deki karakterlerin kac kez tekrarlandigini tespit ederek yeni bir string olusturun
        // "AAABIBFDEEDP" ==> "A3B3I1F1D2E2P1"

        String newStr = frequencyOfChar("AAABIBFDEEDP");

        System.out.println("newStr = " + newStr);

    }

    public static String frequencyOfChar(String str){

        // Once unique bir string olustur
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }

        // Daha sonra uniqueten herbor karakteri tek tek alarak kac defa oldugunu karsilastirarak tespit et
        String expectedResult = "";
        for(int i=0; i<result.length(); i++){
            int counter = 0;
            for(int j=0; j<str.length(); j++){
                if(result.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }
            expectedResult += result.charAt(i) + "" + counter;
        }
        return expectedResult;
    }
}