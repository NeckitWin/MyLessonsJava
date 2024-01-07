package interfaces;

public class Test {
    public static void main(String[] args) {
        Info inf1 = new Animal(5);
        Info inf2 = new Person("Nikita");

        inf1.showInfo();
        inf2.showInfo();
    }
}
