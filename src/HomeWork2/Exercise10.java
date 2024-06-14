package HomeWork2;

import java.util.Scanner;

public class Exercise10 {
    //Задание 10.Напишите метод fibonacci, который принимает целое число n и возвращает n-ое число Фибоначчи.
    // Используйте рекурсию.
    // Fn = Fn–2 + Fn–1, где F0=0, F1=1, а n — больше или равно 2 и является целым числом.
    public static void main(String[] args) {
        System.out.println("Числа Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Число Фибоначчи для числа "+a+ " равно: " + fibonacci(a));
    }
    public static int fibonacci(int a) {
        if (a <= 1) {
            return a;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
}