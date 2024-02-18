package gunler.gun11_20.gun18.gun18_Branching_Labeled_Statements;

public class ReturnExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i == 20){
                //pass the control flow to where this method called. main method callers is JVM therefore
                //program execution is terminated/ended.
                return; //returns the caller(JVM).
            }
            System.out.println("i : " + i);
        }
    }
}
