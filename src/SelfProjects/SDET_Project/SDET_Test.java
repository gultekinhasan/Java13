package SelfProjects.SDET_Project;

public class SDET_Test {
    public static void main(String[] args) {
        //• Create a class template for given name: SDET
        //• Add properties to class:
        //name, age, gender(M/F), company, salary, isSuccessful=True
        //• Add functions to class:
        //increaseSalary(raiseAmount) , companyChange(newCompany)
        //• Sample Values: Talha,34, M, Microsoft, £90000 ,True
        //• Create your dream job profile + 2 more

        SDET_Employee employee1 = new SDET_Employee("Hasan",24,'M');
        SDET_Employee employee2 = new SDET_Employee("Ali",23,'M');
        SDET_Employee employee3 = new SDET_Employee("Talha",34,'M');
        SDET_Employee employee4 = new SDET_Employee("Kemal   ",40);
        SDET_Employee employee5 = new SDET_Employee("Yasin",28,'M');


        SDET_Company company1 = new SDET_Company("GHB",100.000,true,employee1);
        SDET_Company company2 = new SDET_Company("ZER",200.000,true,employee2);
        SDET_Company company3 = new SDET_Company("MICROSOFT",90.000,true,employee3);
        SDET_Company company4 = new SDET_Company("Maden",50000,false,employee4);





        System.out.println(company1);
        System.out.println();


        System.out.println(company2);
        System.out.println();
        System.out.println(company3);
        System.out.println();
        System.out.println(company4);




        System.out.println("-------------------------");

        company1.increaseSalary(120000);
        System.out.println(company1);

        System.out.println();

        company2.changeCompany("ALTIN");
        System.out.println(company2);






    }
}
