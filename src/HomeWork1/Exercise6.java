package HomeWork1;
import java.util.Scanner;

public class Exercise6 {
    //- В деление двух чисел сделать так, что бы деление происходило всегда большего числа на меньшее.
    public static void main(String[] args) {
        System.out.println("Выполнение деления всегда большего числа на меньшее.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float a = scanner.nextFloat();
        System.out.print("Введите второе число: ");
        float b = scanner.nextFloat();
        float c;
        int one = 1;
        if ((b == 0)||(a ==0)) {
            System.out.println("Ошибка! На 0 делить нельзя!");}
        else if (a > b) {
            c = a / b;
            System.out.println("Так как, первое число больше "+a+" делим его на "+b+" и получаем: "+c);}
        else if (a < b) {
            c = b / a;
            System.out.println("Так как, второе число больше "+b+" делим его на "+a+" и получаем: "+c);}
        else {
            System.out.println("Оба числа равны результат: " + one);}
    }
}
