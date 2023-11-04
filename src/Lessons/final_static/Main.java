package Lessons.final_static;

public class Main {
    public static void main(String[] args) {
        int x = Math.Summ(5,5);
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        a.x = 15;
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x);
    }
}
