package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    //Задание 2: Массив положительных чисел.Напишите программу, которая запрашивает у пользователя 10 чисел и сохраняет
    // их в массив. Программа должна затем вывести только положительные числа из этого массива. Используйте цикл for и
    // условный оператор if.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int[] array = new int[n];
        System.out.println("Заолните массив , введите 10 чисел!");
        for (int a = 0; a < n; a++) {
            array[a] = scanner.nextInt();
        }
        int positive = 0;
        for (int search : array) {
            if (search > 0) positive++;
        }

        int[] Positive2 = new int[positive];
        positive = 0;
        for (int search : array) {
            if (search > 0) Positive2[positive++] = search;
        }
        System.out.println("Положительные числа в массиве: " + Arrays.toString(Positive2));
    }
}