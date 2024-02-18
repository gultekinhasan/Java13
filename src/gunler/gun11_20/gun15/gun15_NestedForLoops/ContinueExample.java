package gunler.gun11_20.gun15.gun15_NestedForLoops;
    public class ContinueExample {

        public static void main(String[] args) {

            for(int i=0; i<=10; i++){

                if(i%2 != 0){
                    continue; // skip
                }
                System.out.println("Even numbers = " + i);
            }
        }
    }

