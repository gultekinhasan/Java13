package gunler.gun11_20.gun20.gun20_Methods2;

public class AgeCalculator {


    public static void ageCalculator(String name,int currentYear, int birthYear){
        int age;
        age = currentYear - birthYear;

        System.out.println(name + " is " + age + " years old.");

    }
    public static void main(String[] args) {
        ageCalculator("Hasan",2023,1999);

        String name= "Sema";
        int currentYear = 2023;
        int birthYear = 1998;
        ageCalculator(name,currentYear,birthYear);

        ageCalculator("Vegas",2023,1999);

        String name2 = "Ahmet";
        int currentYear2 = 2023;
        int birthYear2 = 1998;
        ageCalculator(name2,currentYear2,birthYear2);

        ageCalculator("ayşe",2500,200);


    }
}
