package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;

public class WhileInfiniteLoop {
    public static void main(String[] args) {
        int count =10;
        while (true){
            System.out.println(count);
            count--;
            if (count==0)break;
        }
    }
}
