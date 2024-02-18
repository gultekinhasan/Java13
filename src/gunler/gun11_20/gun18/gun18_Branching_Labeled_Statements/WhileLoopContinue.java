package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number<20){
            number++;
            if (number ==10||number==11){
                continue;
            }
            System.out.println("number : " + number);
            sum+=number;
        }
        System.out.println("sum = " + sum);

    }
}
