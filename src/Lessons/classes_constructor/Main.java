package Lessons.classes_constructor;

public class Main {
    public static void main(String[] args){
        Person Nikita = new Person(5, "Nikita");
        Nikita.say("Nikita");
        System.out.println(Nikita.name+"\'s is grade "+Nikita.height);
        Person Alisa = new Person(4,"Alisa");
        System.out.println(Alisa.name+"'s is grade "+Alisa.height);

        Person Anton = new Person("Anton");
        System.out.println(Anton.name);

        Student freshman = new Student(185,"Nikita",3);
        freshman.tell();
        Student fresh = new Student(175, "Alisa", 2);
        fresh.tell();
    }
}
