package dz_structures;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;
    void encrease(){
        System.out.println("Зп "+surname+" повышена в два раза");
        salary*=2;
    }
    void info(){
        System.out.println(id+" "+surname+" "+age+" зп: "+salary+" Отдел: "+department);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee h1 = new Employee();
        Employee h2 = new Employee();

        h1.id=1;
        h1.surname = "Nikita";
        h1.age=20;
        h1.salary=10000.0;
        h1.department="1 Otdel";
        h1.encrease();
        h1.info();

        h2.id=2;
        h2.surname="Alisa";
        h2.age=18;
        h2.salary=500.23;
        h2.department="Второй отдел";
        h2.info();
        h2.encrease();
        h2.info();
    }
}