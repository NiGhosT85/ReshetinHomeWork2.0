package HomeWork1;
import java.util.Scanner;

public class Exercise5 {
    //В вычитании двух чисел сделать так, что бы вычитание происходило всегда из большего числа.
    public static void main(String[] args) {
        System.out.println("Выполнение вычитания всегда из большего числа.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int c;
        if (a > b) {
            c = a - b;
            System.out.println("Так как, первое число больше - вычитаем из него второе и получаем: "+c);}
        else if (a < b) {
            c = b - a;
            System.out.println("Так как, второе число больше - вычитаем из него первое и получаем: " +c);}
        else {
            System.out.println("Оба числа равны результат: 0");}
    }
}
