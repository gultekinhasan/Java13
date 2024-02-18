package gunler.gun21_30.gun29_StringClass2;

public class StringReplace {
    public static void main(String[] args) {
        String str = "This web site is www.eurotechstudy.com";
        System.out.println(str);

        str = str.replace("com","edu");
        System.out.println(str);

        str = str.replace('w','W');
        System.out.println(str);
    }   
}
