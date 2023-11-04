package classes_constructor;

public class Person {
    public String name = "Default";
    public int height = 185;
    public void say (String name){
        System.out.println("Hello, "+name);
    }

    public Person () {}

    public Person(int h, String n) {
        height = h;
        name = n;
    }
    public Person (String n){
        name = n;
    }
}
