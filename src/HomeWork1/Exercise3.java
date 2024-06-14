package HomeWork1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Реализовать программу, которая сравнивает два числа и выводит результат сравнения.
        //Например - "Первое число больше второго"
        System.out.println("Сравнение чисел большее меньшее с учетом равенства и расчетом разницы.");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner2.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner2.nextInt();
        int с;
        if (a > b) {
            с = a - b;
            System.out.println("Первое число больше и равно: " + a + "\n" + "\t" + "(с разницей в " + с + ")");
        } else if (a < b) {
            с = b - a;
            System.out.println("Второе число больше и равно: " + b + "\n" + "\t" + "(с разницей в " + с + ")");
        } else {
            System.out.println("Оба числа равны: " + a);
        }
    }
}