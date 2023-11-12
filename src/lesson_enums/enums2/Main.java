package lesson_enums.enums2;

public class Main {
    public static void main(String[] args) {
        Sub sub = new Sub();

        sub.state = Sub.State.SUSPENDED;

        System.out.println(Sub.State.valueOf("ACTIVE"));
        System.out.println(Sub.State.NONE.toString());
        System.out.println(Sub.State.ACTIVE.ordinal());
        System.out.println(Sub.State.values()[2]);
    }
}

class Sub{
    String name;
    String description;
    State state;
    enum State{
        NONE, ACTIVE, SUSPENDED;
    }
}