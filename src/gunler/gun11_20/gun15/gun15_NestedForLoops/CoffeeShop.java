package gunler.gun11_20.gun15.gun15_NestedForLoops;

public class CoffeeShop {
    public static void main(String[] args) {

        int maxCapacity = 20;
        int currentCustomer =0;

        System.out.println(" _Welcome To The Coffee Shop_ ");

        for (int customer=1;customer<=30;customer++){


            if (currentCustomer==maxCapacity){
                System.out.println(" Sorry! Shop is Full!!!");
                break;
            }
            System.out.println("Customer :"+ customer + " enters.");

            currentCustomer++;
        }
    }
}
