package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(
                Months.APRIL,
                Marriage.MARRIED,
                Gender.MALE,
                "Ahmet",
                1985,
                25);

        System.out.println("person = " + person);

        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.print("Lütfen doğduğunuz ayı giriniz : ");
            String month = scanner.nextLine();
            //person.monthOfBirth = Months.valueOf(scanner.nextLine());
            if(Months.isValidMonth(month)){
                person.monthOfBirth = Months.valueOf(month.toUpperCase());
                break;
            }
        }
        while (true){
            System.out.print("Lütfen medeni halinizi giriniz : ");
            String marriage = scanner.nextLine();
            //person.monthOfBirth = Months.valueOf(scanner.nextLine());
            if(Marriage.isValidMarriage(marriage)){
                person.marriageStatus = Marriage.valueOf(marriage.toUpperCase());
                break;
            }
        }

        System.out.println("person = " + person);

    }
}
