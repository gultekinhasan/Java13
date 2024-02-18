package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;

public class WhileLoopBreak1 {
    public static void main(String[] args) {
        System.out.println("Branching statements in Java 'break' . ");
        int sum=0;
        int number=0;
        while (number<20){
            //loop body
            number++;
            sum+=number;
            if (sum>=100){
            break;
            }
        }
        System.out.println("The number is : " + number);
        System.out.println("The sum is : "+ sum);





    }
}
