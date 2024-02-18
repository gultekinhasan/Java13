package gunler.gun31_40.gun35_Review;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
public class BigIntegerExample {
    public static void main(String[] args) {
        //Integer, Long veya Double  veri tipleriinin boyutlarını aşan iş ve işlemlerde kullanmak üzere BigInteger ve BigDecimal veri tipleri
        //Nerdeyse sınırsız sayıda basamaktan oluşurlar
        BigInteger bigInteger = new BigInteger("899284928749287424092092382738957298378237587766256248264872647284672647264274842457265423428374273");
        System.out.println(bigInteger);
        BigInteger result = new BigInteger("0");

        result = bigInteger.multiply(bigInteger);

        System.out.println(result);

        result = bigInteger.add(new BigInteger("1000000000"));
        System.out.println(result);

        result = bigInteger.subtract(bigInteger);
        System.out.println(result);

        BigDecimal sayi = new BigDecimal(12345678899.081746781);
        BigDecimal bolen = new BigDecimal(3);
        BigDecimal resultDclm = sayi.divide(bolen,100, RoundingMode.UP);
        //scale: işlem sonrası sonucun basamak sayısı, RoundingMode.UP işlemin yukarıya yuvarlanması

        System.out.println(resultDclm);
    }
}
