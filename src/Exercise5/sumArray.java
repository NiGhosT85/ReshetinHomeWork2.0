package Exercise5;

import java.util.Scanner;

public class sumArray {
    //Напишите метод sumArray, который принимает массив целых чисел и возвращает сумму его элементов.
    // Используйте цикл for.
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int[] array = new int[n];
        System.out.println("Заполните массив , введите 5 чисел!");
        for (int a = 0; a < n; a++) {
            array[a] = scanner.nextInt();
        }
        System.out.println("Сумма элементов массива: " + sumArray(array));
    }
}