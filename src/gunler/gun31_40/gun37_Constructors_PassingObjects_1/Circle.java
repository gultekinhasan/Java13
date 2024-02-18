package gunler.gun31_40.gun37_Constructors_PassingObjects_1;
public class Circle {
    //Attributes-Properties-Fields-Data Members-State
    double radius;
    double height;

    /*Constructor metodlarının temel amacı class lardan oluşturulacak olan nesnelerin
      Data field, attribute, variable, state, properties
      alanlarına başlangıç değerlerini(initial values) atamaktır.
    */
    //Default/No args Constructor-Name must be the same as Class- Constructor does not have any return type even void
    public Circle(){
        System.out.println("No args/Default constructor invoked/called.");
        radius = 0; //Default value of radius
        height = 0;
    }

    //Parameterized constructor
    public Circle(double yariCap){
        System.out.println("Parameterized constructor invoked/called.");
        radius = yariCap; //Constructor'a parametre olarak gönderilen değeri radius değişkenine atama işlemi
    }
    //Parameterized constructor
    public Circle(double yariCap, double yukseklik){
        System.out.println("Parameterized constructor invoked/called.");
        radius = yariCap; //Constructor'a parametre olarak gönderilen değeri radius değişkenine atama işlemi
        height = yukseklik;
    }

    //This method calculates area and returns the area of the Instance
    public double getArea(){
        // return radius * radius * Math.PI;
        return Math.pow(radius,2) * Math.PI;
    }

    //This method calculates perimeter and returns the perimeter of the Instance
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public double getVolume(){
        // return radius * radius * Math.PI * height; //hacim = alan * yükseklik
        /*double alan = getArea();
        return alan * height; //hacim = alan * yükseklik*/
        return getArea() * height; //hacim = alan * yükseklik
    }
    //This method sets/updates radius of the Instance
    public void setRadius(double newRadius){
        radius = newRadius;
    }

    //This method returns the radius of the Instance
    public double getRadius(){
        return radius;
    }

    //This method sets/updates height of the Instance
    public void setHeight(double newHeight){
        height = newHeight;
    }
    //This method returns the height of the Instance
    public double getHeight(){
        return height;
    }

    //This method returns the info about instance using concatenation of properties and messages
    public String showInfo(){
        String str = "";
        str += "Dairenin yarı çapı    : " + radius + "\n"; // "\n" new line --> yeni satıra geç
        str += "Dairenin yüksekliği   : " + height + "\n";
        str += "-------------------------------------\n" ;
        str += "Dairenin alanı   : " + getArea() + "\n";
        str += "Dairenin çevresi : " + getPerimeter() + "\n";
        str += "Dairenin hacmi   : " + getVolume() + "\n";

        return str; //Returns the concatenated string
    }
    public static void main(String[] args) {
        Circle daire1 = new Circle(); //Default constructor-No args/params const.
        System.out.println("daire1.radius = " + daire1.radius);

        Circle daire2 = new Circle(15);
        System.out.println("daire2.radius = " + daire2.radius);

        System.out.println("daire1.getArea() = " + daire1.getArea());
        System.out.println("daire2.getArea() = " + daire2.getArea());
        System.out.println("daire1.getPerimeter() = " + daire1.getPerimeter());

        daire1.radius = 125;
        System.out.println("daire1.getPerimeter() = " + daire1.getPerimeter());

        System.out.println("daire2.radius = " + daire2.radius);
        System.out.println("daire2.getRadius() = " + daire2.getRadius());
        System.out.println("daire2.getArea() = " + daire2.getArea());

        daire2.setRadius(13);

        System.out.println("daire2.radius = " + daire2.radius);
        System.out.println("daire2.getRadius() = " + daire2.getRadius());
        System.out.println("daire2.getArea() = " + daire2.getArea());
        System.out.println();

        Circle daire3 = new Circle(2, 3);

        System.out.println("daire3.getRadius() = " + daire3.getRadius());
        System.out.println("daire3.getHeight() = " + daire3.getHeight());
        System.out.println("daire3.getPerimeter() = " + daire3.getPerimeter());
        System.out.println("daire3.getArea() = " + daire3.getArea());
        System.out.println("daire3.getVolume() = " + daire3.getVolume());
        System.out.println();

        String daireInfo = daire2.showInfo();
        System.out.println(daireInfo);

        System.out.println();

        System.out.println(daire3.showInfo());
    }
}
