package players;

import java.util.Random;

class Player{
    public Random rand = new Random();
    int randomCyfra = rand.nextInt(100+1);
    char username;
    double money;
    Player(){
        username=(char)randomCyfra;
        money=randomCyfra;
    }
    void info(){
        System.out.println(username+" "+money);
    }
}
public class Main {
    public static void main(String[] args) {
        Player[] p = new Player[10];

        for (int i=0;i<10;i++){
            p[i] = new Player();
        }

        for (int i=0;i<3;i++){
            Random rand = new Random();
            int randomPlayer = rand.nextInt(10+1);
            p[randomPlayer].info();
        }
    }
}
