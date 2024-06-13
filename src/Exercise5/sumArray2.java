package Exercise5;

import java.util.Scanner;

public class sumArray2 {
    public static int sumArray2(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
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
        System.out.println("Сумма элементов массива: " + sumArray2(array));
    }
}