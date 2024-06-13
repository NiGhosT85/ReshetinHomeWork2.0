import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    // Задание 1: Пользователь должен угадать случайное загаданное число, программа подсказывает больше или меньше.
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Пожалуйста , введите загаданное число число: ");
            a = scanner.nextInt();
            if (a > randomNumber) {
                System.out.println("Введите меньшее число!");
            } else if (a < randomNumber) {
                System.out.println("Введите большее число!");
            } else {
                System.out.println("Вы угадали число равно : " + a);
            }
        }
        while (a != randomNumber);
    }
}
