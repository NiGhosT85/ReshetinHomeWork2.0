package HomeWork2;

import java.util.Scanner;

public class Exercise3 {
    //Задание 3.Напишите метод maxOfThree, который принимает три целых числа и возвращает наибольшее из них.
    // Используйте условный оператор if.
    public static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Наибольшее число " + maxOfThree(a, b, c));
    }
}
