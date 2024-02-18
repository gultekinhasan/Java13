package gunler.gun11_20.gun19.gun19_Methods1;

public class Homework4 {
    public static void main(String[] args) {

        userEligible();

    }
    public static void userEligible(){
        int income= 3000;
        if(income>4000){
            System.out.println(" User is eligible for Credit Card");
        }else{
            userNotEligible();
        }
    }
    public static void userNotEligible(){
            System.out.println("User is not eligible for Credit Card");

    }

}
