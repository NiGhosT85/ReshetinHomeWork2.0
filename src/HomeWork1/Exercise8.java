package HomeWork1;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //Написать программу, которая вычисляет факториал через цикл

        // факториал числа через for
        System.out.println("Вычисление факториала числа.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        int b = 1;
        for (int c = 1; c < a+1; c++) {
            b = b * c;
        }
        System.out.println("факториал числа "+ a + " равен: "+ b +"\n");

        // факториал числа через while
        System.out.println("Вычисление факториала числа.");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a2 = scanner2.nextInt();
        int b2 = 1;
        int i2 = 0;
        while (i2 < a2) {
            i2++;
            b2= b2*i2;}
        System.out.println("факториал числа "+ a2 + " равен: "+ b2);
    }
}
