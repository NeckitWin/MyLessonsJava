package Algorithms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Введите число, с которым нужно вывести таблицу умножения");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i=0; i<=10; i++){
            int mult = number * i;
            System.out.printf("%d * %d = %d%n", number, i, mult);
        }
    }
}