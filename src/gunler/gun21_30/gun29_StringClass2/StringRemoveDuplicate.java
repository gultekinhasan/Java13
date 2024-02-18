package gunler.gun21_30.gun29_StringClass2;

public class StringRemoveDuplicate {
    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.charAt(i)+"")){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String myStr = "DDEECKGDDEEEEFGGDCXDD";
        System.out.println("myStr = " + myStr);

        System.out.println("removeDuplicates(myStr) = " + removeDuplicates(myStr));
        System.out.println("removeDuplicates(\"aaahmeeeet\") = " + removeDuplicates("aaahmeeeet"));
    }
}
