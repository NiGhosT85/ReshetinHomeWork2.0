package HomeWork1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //ввод чисел через клавиатуру сложение (addition)
        System.out.println("Введите два числа для сложения:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int result = a + b;
        System.out.println("Результат сложения введенных чисел равен: " + result);

        //ввод чисел через клавиатуру вычитание (subtraction)
        System.out.println("Введите два числа для вычитания:");
        System.out.print("Введите первое число: ");
        int a2 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b2 = scanner.nextInt();
        int result2 = a2 - b2;
        System.out.println("Результат вычитания введенных чисел равен: " + result2);

        //ввод чисел через клавиатуру деление (division)
        System.out.println("Введите два числа для деления:");
        System.out.print("Ведите первое число: ");
        float a3 = scanner.nextFloat();
        System.out.print("Ведите второе число: ");
        float b3 = scanner.nextFloat();
        float result3 = a3 / b3;
        System.out.println("Результат деления введенных чисел равен: " + result3);


        //ввод чисел через клавиатуру умножение (multiplication)
        System.out.println("Введите два числа для умножения:");
        System.out.print("Ведите первое число: ");
        int a4 = scanner.nextInt();
        System.out.print("Ведите второе число: ");
        int b4 = scanner.nextInt();
        int result4 = a4 * b4;
        System.out.println("Результат умножения введенных чисел равен: " + result4);

    }
}