package HomeWork2;

import java.util.Scanner;

public class Exercise6 {
    //Задание 6: Поиск максимума в массиве
    //Напишите программу, которая запрашивает у пользователя 5 чисел,
    // сохраняет их в массив и находит максимальное число в этом массиве. Используйте цикл for и условный оператор if.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int maxNumber = Integer.MIN_VALUE;

        System.out.println("Введите пять чисел:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Максимальное число в  данном массиве: " + maxNumber);
    }
}