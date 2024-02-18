package gunler.gun21_30.gun25_Reading_User_Input_Scanner;
import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap bilgisini giriniz : ");
        double yaricap = input.nextDouble();

        Circle daire1 = new Circle();
        daire1.radius = yaricap;
        System.out.println("daire1.area() = " + daire1.area());
        System.out.println("daire1.perimeter() = " + daire1.perimeter());
    }
}
