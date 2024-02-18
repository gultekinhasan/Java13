package gunler.gun21_30.gun29_StringClass2;

public class StringFindUnique {
    public static String uniqueFind(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += str.charAt(i);
            }
           count = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        String myStr = "DXDEECKGDDEEEEFGGDCXDD";
        System.out.println("uniqueFind(myStr) = " + uniqueFind(myStr));
    }
}
