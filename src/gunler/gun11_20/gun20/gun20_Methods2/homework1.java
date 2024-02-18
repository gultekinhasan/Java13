package gunler.gun11_20.gun20.gun20_Methods2;

public class homework1 {
    public static void main(String[] args) {
        biggerNumber(99,120,88);
    }
    public static void biggerNumber(int num1, int num2,int num3){
        if(num1 > num2 && num1>num3){
            System.out.println("num1 : " + num1 + " is the biggest number");
        }else if (num3>num2 && num3>num1){
            System.out.println("num3 : "+num3 + " is the biggest number ");
        }else{
            System.out.println("num2 : " + num2 + " is the biggest number ");
        }
    }
}
