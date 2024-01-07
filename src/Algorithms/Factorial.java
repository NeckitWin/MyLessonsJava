package Algorithms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число, факториал которого хотите узнать:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<0){
            System.out.println("Факториал отрицательного числа нельзя высчитать");
        }
        else
        {
            int mult = 1;

            for (int i = 1; i <= number; i++) {
                mult *= i;
            }
            System.out.println(mult);

        }
        scanner.close();
    }
}