package HomeWork2;

public class Exercise8 {
    //Задание 8: Минимум и максимум в массиве
    //Напишите метод minMax, который принимает массив целых чисел и возвращает массив из двух элементов:
    // минимального и максимального значений в данном массиве.
    public static int[] minMax(int[] numbers) {
        int[] minMax = new int[2];
        minMax[0] = numbers[0];
        minMax[1] = numbers[0];
        for (int number : numbers) {
            if (number < minMax[0]) {
                minMax[0] = number;
            }
            if (number > minMax[1]) {
                minMax[1] = number;
            }
        }
        return minMax;
    }

    public static void main(String[] args) {
        int[] numbers = {13, -3, 0, 6, 12, 17};
        int[] result = minMax(numbers);
        System.out.println("Минимальное значение: " + result[0]);
        System.out.println("Максимальное значение: " + result[1]);
    }
}
