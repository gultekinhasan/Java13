package gunler.gun21_30.gun29_StringClass2;

public class StringImmutable {
    public static void main(String[] args) {
        //String objects are immutable in Java. Immutable simply means unmodifiable or unchangeable
        System.out.println("String objects are immutable ---> values can not be changed");

        String str = "Merhaba";
        System.out.println("str = " + str);
        System.out.println("str.toUpperCase() = " + str.toUpperCase()); //Yeni bir string nesnesi oluştur ve Büyük harfe çevirdiğin değeri o nesneye ata
        System.out.println("str = " + str);

        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));
        System.out.println("System.identityHashCode(str.toUpperCase()) = " + System.identityHashCode(str.toUpperCase()));
        System.out.println("System.identityHashCode(str.concat(\" Java\")) = " + System.identityHashCode(str.concat(" Java")));
    }
}
