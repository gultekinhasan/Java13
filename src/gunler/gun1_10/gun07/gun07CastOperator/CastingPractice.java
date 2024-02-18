package gunler.gun1_10.gun07.gun07CastOperator;


    public class CastingPractice {

        public static void main(String[] args) {

            // Task- 1
            int pies = 10, people = 4;
            double piesPerson;
            piesPerson = pies / people;
            System.out.println("piesPerson = " + piesPerson); // 2.0

            // Task- 2
            piesPerson = (double)pies / people;
            System.out.println("piesPerson = " + piesPerson); // 2.5

            // Task- 3
            piesPerson = pies / (double)people;
            System.out.println("piesPerson = " + piesPerson); // 2.5

            // Task- 4
            // piesPerson = double (pies / people); Error // should be (double)
            System.out.println("piesPerson = " + piesPerson); //

        }
    }
