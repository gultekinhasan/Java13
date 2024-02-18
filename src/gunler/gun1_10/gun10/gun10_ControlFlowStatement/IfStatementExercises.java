package gunler.gun1_10.gun10.gun10_ControlFlowStatement;

public class IfStatementExercises {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // if (x equals 42){ }  -- error
        // if x=10 then {  }---error
        // if (x==y){  } --- no error
         //if (x=>y) {  } --- error
        // if (x==10) {  } -- error


        // write a if statement that multiplies salary by 1.5 if hours is greater than 38 hours

        double salary=5000;
        int hours=39;
        if(hours > 38){
            salary*=1.5;
        }
        System.out.println("salary = " + salary);


        //write an if statement that assigns 1 to x if y is greater than 0

        int x1=0;
        int y1=5;
        if (y1>0){
            x1=0;
        }
        System.out.println("x1 = " + x1);


        System.out.println("------------------");

        int x2=0;
        int y2=-5;
        if (y2>0){
            x2=5;
        }
        System.out.println("x2 = " + x2);

        System.out.println("-----------------");


        int score=89;
        int pay=1000;
        if (score>90){
            pay += (pay*3 / 100);
        }
        System.out.println("pay = " + pay);

        System.out.println("------------------------");






    }
}