package Exercise7;

import java.util.Scanner;

public class poWer {
    public static int poWer(int base, int exponent) {
        //Задание 7: Возведение в степень
        //Напишите метод power, который принимает два целых числа base и exponent,
        // и возвращает результат возведения base в степень exponent. Используйте цикл for.
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для возведения в степень");
        int base = scanner.nextInt();
        System.out.println("Введите  желаемою степень");
        int exponent = scanner.nextInt();
        System.out.println(base + " в степени " + exponent + " равно: " + poWer(base, exponent));
    }
}
