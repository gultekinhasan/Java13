package gunler.gun1_10.gun06.gun06_Arithmetic_UnaryOperators;

public class concatenation {
    public static void main(String[] args) {
        // '+' operatörünün farklı kullanım durumları
        // number+number --> addition operator
        System.out.println(10+3);

        // number+string--> concatenation
        System.out.println(54+" yaşında");

        // string+boolean-->concatenation
        System.out.println("isminiz"+ false);

        //string+string--> concatenation
        System.out.println("hello"+" world");

        //number+boolean-->error
        //System.out.println(35+false);

        //Diğer operantların farklı davranışı durumu mümkün değil
       // System.out.println(54 - "yaşında");
    }
}
