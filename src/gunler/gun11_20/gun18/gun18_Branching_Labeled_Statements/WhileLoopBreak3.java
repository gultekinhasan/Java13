package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;
import java.util.Scanner;
public class WhileLoopBreak3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        while (true){
            System.out.print("Klavyeden yaş bilgisini giriniz : ");
            age = input.nextInt();
            if(age > 0 && age <= 100) break;
        }
        System.out.println("Yaşınız : " + age);
    }
}
