package gunler.gun11_20.gun11.gun11ControlFlowStatement2;


    public class NestedIf {

        public static void main(String[] args) {

            // Write a program that checks if the given number is dividable to 2,3,6

            int number = 44;

            System.out.println("number = " + number);

            if(number%2 == 0){
                System.out.println(number + " can be divided by 2");
                if(number%3 == 0){
                    System.out.println(number + " can be divided by 3");
                    System.out.println(number + " can be divided by 6");
                }else{
                    System.out.println(number + " can not be divided by 3");
                    System.out.println(number + " can not be divided by 6");
                }
            }else {
                System.out.println(number + " can not be divided by 2");
            }


            System.out.println("/////////////////////");

            if(number%2 == 0 && number%3 == 0){
                System.out.println(number + " can be divided by 2");
                System.out.println(number + " can be divided by 3");
                System.out.println(number + " can be divided by 6");
            }else {
                System.out.println(number + " can not be divided by 2");
                System.out.println(number + " can not be divided by 3");
        System.out.println(number + " can not be divided by 6");
        }

        System.out.println("/////////////////////");

        System.out.println(number + " can be divided by 2,3,6" + (number%2 == 0 && number%3 == 0));

        System.out.println("/////////////////////");

        System.out.println(number + " can be divided by 2,3,6" + (number%6 == 0));
        }
        }


