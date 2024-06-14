package HomeWork1;

import java.util.Scanner;

public class Exercise4 {
    //В сложении и умножении двух чисел сделать так, что если одно из чисел отрицательное,
    //то вывести "Я не хочу работать с отрицательными числами" и закончить выполнение программы
    public static void main(String[] args) {
        //Сложение без отрицательных чисел .
        System.out.println("Сложение без отрицательных чисел." + "\n" + "Ожидание ввода чисел для сложения:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int result = a + b;
        if ((a < 0) || (b < 0)) {
            System.out.println("Одно из чисел не соотвествует условиям, я не хочу работать с отрицательными числами!");
        } else {
            System.out.println("Сумма чисел равна: " + result);
        }
        //Умножение без отрицательных чисел.
        System.out.println("Умножение без отрицательных чисел." + "\n" + "Ожидание ввода чисел для умножения:");
        System.out.print("Введите первое число: ");
        int a2 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b2 = scanner.nextInt();
        int result2 = a2 * b2;
        if ((a2 < 0) || (b2 < 0)) {
            System.out.println("Одно из чисел не соотвествует условиям, я не хочу работать с отрицательными числами!");
        } else {
            System.out.println("Результат умножения чисел равен: " + result2);
        }
    }

}
