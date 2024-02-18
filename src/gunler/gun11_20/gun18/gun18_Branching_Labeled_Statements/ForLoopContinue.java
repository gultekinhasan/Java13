package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;
public class ForLoopContinue {
    public static void main(String[] args) {
        //Tek sayilari toplayan loop.
        int sum =0;
        for (int i=0;i<=100;i++){
            if (i%2==0){
                continue;
            }
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("sum of odd numbers = " + sum);
        System.out.println("***************************************************");
        //çift sayıları toplayan while loop.
        sum = 0;
        int number =0;
        while (number <=100){
            number++;
            if (number%2!=0){
                continue;
            }
            System.out.println("number = " + number);
            sum +=number;
        }
        System.out.println("sum of even numbers = " + sum);
    }
}