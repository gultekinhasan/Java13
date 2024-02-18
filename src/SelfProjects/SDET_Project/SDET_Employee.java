package SelfProjects.SDET_Project;

import java.util.ArrayList;

public class SDET_Employee {
    String name;
    int age;
    char gender;
    ArrayList<SDET_Employee> employee;
    public SDET_Employee(){
    this.name = "Not Defined";
    this.age = 0;
    this.gender ='?';
    employee = new ArrayList<>();
    }
    public SDET_Employee(String name){
    this();
    this.name=name.trim().toUpperCase();
    }
    public SDET_Employee(String name,int age){
    this(name);
    this.age=age;
    }
    public SDET_Employee(String name, int age,char gender){
        this(name,age);
        this.gender=gender;
    }
    public void addEmployee (SDET_Employee employee) {
        this.employee.add(employee);
        System.out.println("Employee added successfully.");
        System.out.println();
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }



    public String toString(){
        return  " name  :" + name + "\t\t" +" age :" + age  +"\t\t"+ " gender :" + gender + "\n" ;
    }

    public void add(SDET_Employee employee) {

    }
}
