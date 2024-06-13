package Exercise9;

import java.util.Scanner;

public class contains {
    //Задание 9.Напишите метод contains, который принимает массив целых чисел и целое число target, и возвращает true,
    // если массив содержит это число, и false в противном случае. Используйте цикл for.
    public static boolean contains(int[] numbers, int target) {
        for (int number : numbers) {
            if (number == target) {
                System.out.print("Число " + target + " есть в массиве! ");
                return true;
            }
        }
        System.out.print("Число " + target + " не содержится в массиве! ");
        return false;
    }

    public static void main(String[] args) {
        System.out.println("В массиве 5 чисел от 1 до 5");
        int[] numbers = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int target = scanner.nextInt();
        boolean result = contains(numbers, target);
        System.out.println(result);
    }
}
