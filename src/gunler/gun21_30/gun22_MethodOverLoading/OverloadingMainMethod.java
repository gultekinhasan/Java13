package gunler.gun21_30.gun22_MethodOverLoading;

    public class OverloadingMainMethod {

        public static void main(String[] args) {

            System.out.println("Hello from Main Method");
            main("Merhaba");
        }

        public static void main(String str){

            System.out.println("Hello from Second Main Method");
            main("Merhaba", "Nasilsin");
        }

        public static void main(String str2, String str3){

            System.out.println("Hello from Third Main Method");
        }
    }

