package lesson_enums.enums1;

public enum Music {
    CLASSIC(10,"classic"),ROCK(13,"rock"),POP(8,"pop");

    private int i;
    private String name;

    Music(int i, String name){
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }
}
