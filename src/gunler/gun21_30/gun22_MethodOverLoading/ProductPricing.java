package gunler.gun21_30.gun22_MethodOverLoading;
public class ProductPricing {

    public static void main(String[] args) {

        // Sabit indirim, kampanyali indirim ve vergili fiyatlari hesaplayan bir program yaziniz
        // 1. Sabit indirim uygulanmis fiyat
        // 2. Kampanyali indirim uygulanmis fiyat
        // 3. Kampanyali indirim ve vergi uygulanmis fiyat

        double price = 100.0;
        double discount = 0.10;
        double tax = 0.08;

        double finalPrice = calculatePrice(price);
        System.out.println("Sabit indirimli fiyat = " + finalPrice);

        double finalPrice2 = calculatePrice(price, discount);
        System.out.println("Kampanya indirimli fiyat = " + finalPrice2);

        double finalPrice3 = calculatePrice(price, discount, tax);
        System.out.println("Kampanya indirimli vergili fiyat = " + finalPrice3);
    }

    public static double calculatePrice(double price){
        double baseDiscount = 0.05;
        return price -= (price * baseDiscount);
    }

    public static double calculatePrice(double price, double discount){
        return price -= (price * discount);
    }

    public static double calculatePrice(double price, double discount, double tax){
        double discountedPrice = price - (price * discount);
        double finalPrice = discountedPrice + (discountedPrice * tax);
        return finalPrice;
    }
}



