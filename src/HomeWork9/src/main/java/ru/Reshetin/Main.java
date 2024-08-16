package HomeWork9.src.main.java.ru.Reshetin;

    public class Main {
        //    Написать класс, который отвечает за манипуляцию двумя числами, т.е:
    //    метод, который складывает два числа.
    //    метод, который высчитывает разность двух чисел
    //    метод, который перемножает два числа
    //    метод, который находит частное двух чисел
    //    метод, который возводит первое число в степень, равной второму числу (Пример: в метод передано два числа - 2 и 3. Метод возведет 2 в степень 3)
    //    В методы умножения и деления добавить проверку на 0 (ведь на ноль ни делить, ни умножать нельзя).
    //    Нужно написать тест на каждый метод. Должно быть 100 процентное покрытие кода тестами.
        public static void main(String[] args) {
            ManipulationNumber manipulationNumber = new ManipulationNumber();
            System.out.println("Результат сложения - " + manipulationNumber.addMethod(3, 5));
            System.out.println("Результат вычитания - " + manipulationNumber.differenceMethod(2, 7));
            System.out.println("Результат умножения- " + manipulationNumber.multiplicationMethod(6, 4));
            System.out.println("Результат деления- " + manipulationNumber.divideMethod(10, 5));
            System.out.println("Результат возведения в степень - " + manipulationNumber.powerMethod(2, 3));

        }
    }