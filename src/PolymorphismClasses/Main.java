package PolymorphismClasses;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
//        Help h = new Teacher();
//        emp1.work();
//        emp2.work();
//        emp3.work();
//        h.help();

        Employee[] array = {emp1, emp2, emp3};

        for (Employee emp:array){
            emp.work();
        }

        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Driver);

    }
}

abstract class Employee{
    void sleep () {System.out.println("Employee sleeps");}
    abstract void work();
}

class Teacher extends Employee implements Help{
    void work () {System.out.println("Teacher works");}
    public void help(){System.out.println("Teacher helps");}
}
class Driver extends Employee implements Help{
    void work () {System.out.println("Driver works");}
    public void help(){System.out.println("Driver helps");}
}
class Doctor extends Employee implements Help{
    void work () {System.out.println("Doctor works");}
    public void help(){System.out.println("Doctor helps");}
}

interface Help{
    void help();
}