package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;

public class ForWhileLoopContinue {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =0;i<4;i++){
            if (i%3==0){
                continue;
            }
            sum += i;
        }
        System.out.println("The sum is (for) = " + sum);
        System.out.println();

        int i =0;
        sum =0;
        while (i<4){
            i++;
            if (i % 3 ==0){
                i++;
                continue;
            }
            sum += i;
        }
        System.out.println("The sum is (while) = " + sum);
    }
}
