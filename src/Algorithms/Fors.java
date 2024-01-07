package Algorithms;

import java.util.Scanner;
public class Fors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int a, b;

        System.out.println("Введите числа: ");
        a = scanner.nextInt();
        b = scanner2.nextInt();

        int c = a+b;

        System.out.println("Сумма поданных чисел: "+c);

        scanner.close();
        scanner2.close();
    }
}
