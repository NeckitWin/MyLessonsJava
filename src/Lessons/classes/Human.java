package Lessons.classes;

public class Human {
    String name;
    Car car;
    BankAccount bA;
    Grades aG;

    void info(){
        double avgGrade = (aG.historia + aG.informatyka +aG.matematyka)/3;
        System.out.println("Name: "+name+ " Car: " + car.color + ", " + car.engine + ". Bank id: " + bA.id + ", balance: " + bA.balance + " Средняя оценка: "  + avgGrade)  ;
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Nikita";
        h.car = new Car("red", "V3");
        h.bA = new BankAccount(12345678,200.32);
        h.aG = new Grades(4.75,3.5,4.25);
        h.info();
    }
}

class Grades{
    Grades(double gM, double gI, double gH){
        matematyka = gM;
        informatyka = gI;
        historia = gH;
    }
    double historia;
    double matematyka;
    double informatyka;
}
class Car{
    Car (String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2){
        id=id2;
        balance=balance2;
        balance+=popolnenieSheta;
        balance-=snyatieSoSheta;
    }
    int id;
    double balance;
    double popolnenieSheta = 50;
    double snyatieSoSheta = 200.32;
}