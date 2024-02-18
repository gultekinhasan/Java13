package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;

public class WhileLoopBreak2 {
    public static void main(String[] args) {

       int number=0;

        while (true){
            number++;
            System.out.println("Number = " + number);
            if (number >= 10)break;
        }
    }
}
