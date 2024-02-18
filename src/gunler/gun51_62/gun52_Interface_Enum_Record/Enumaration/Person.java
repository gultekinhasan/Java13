package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;

public class Person {
    Months monthOfBirth;
    Marriage marriageStatus;
    Gender gender;
    String name;
    int yearOfBirth;
    int dayOfBirth;

    public Person(Months monthOfBirth, Marriage marriageStatus, Gender gender, String name, int yearOfBirth, int dayOfBirth) {
        this.monthOfBirth = monthOfBirth;
        this.marriageStatus = marriageStatus;
        this.gender = gender;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "monthOfBirth=" + monthOfBirth +
                ", marriageStatus=" + marriageStatus +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }
}


enum Gender{
    MALE,FEMALE;

}
