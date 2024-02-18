package gunler.gun21_30.gun25_Reading_User_Input_Scanner;

public class Circle {
    double radius;
    final double pi = 3.14;

    double area() {
        return radius * radius * pi;
    }

    double perimeter() {
        return 2 * pi * radius;
    }
}
