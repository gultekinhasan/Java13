package gunler.gun11_20.gun13.gun13_TernaryOperator;

public class SwitchCaseToTernary {
    public static void main(String[] args) {
        int gecmeNotu;
        String gecmeNotuStr;
        gecmeNotu =60;

        switch (gecmeNotu){
            case 90:
                gecmeNotuStr= "Geçme notunuz - A";
                break;
            case 80:
                gecmeNotuStr= "Geçme notunuz - B";
                break;
            case 70:
                gecmeNotuStr= "Geçme notunuz - C";
                break;
            case 60:
                gecmeNotuStr= "Geçme notunuz - D";
                break;
            case 50:
                gecmeNotuStr= "Geçme notunuz - E";
                break;
            default:
                gecmeNotuStr="Geçersiz not. Kaldınız";
        }
        System.out.println( gecmeNotu+ " "+ gecmeNotuStr);
        System.out.println();
        System.out.println("----------------------------------");


        //ternary

        gecmeNotuStr = (gecmeNotu==90)? "Geçme notunuz - A"
                :(gecmeNotu==80)? "Geçme notunuz - B"
                :(gecmeNotu==70)? "Geçme notunuz - C"
                :(gecmeNotu==60)? "Geçme notunuz - D"
                :(gecmeNotu==50)? "Geçme notunuz - E"
                :"Geçersiz not. Kaldınız.";
        System.out.println( gecmeNotu+ " "+ gecmeNotuStr);


    }
}
