package HomeWork2;

import java.util.Scanner;

public class Exercise4 {
    //Задание 4.Напишите метод isPrime, который принимает целое число и возвращает true, если число простое,
    // и false в противном случае. Используйте цикл for и условный оператор if.
    public static boolean isPrime(int Number) {
        if (Number <= 1) {
            System.out.print("Это число не является простым! ");
            return false;
        }
        for (int a = 2; a * a <= Number; a++) {
            if (Number % a == 0) {
                System.out.print("Это число не является простым! ");
                return false;
            }
        }
        System.out.print("Это число простое! ");
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int Number = scanner.nextInt();
        System.out.println(Number + " " + isPrime(Number));
    }
}
