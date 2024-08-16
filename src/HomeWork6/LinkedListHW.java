package HomeWork6;

import java.util.Arrays;
//Создать LinkedList и добавьте в него 10 городов (строк).
//Добавить в начало 5 городов и вывести города в консоль
//Добавить в конец 5 городов и вывести города в консоль
//Удалить 3 города в начале и вывести города в консоль
//Удалить 4 города в конце и вывести города в консоль

public class LinkedListHW {

    public static void main(String[] args) {
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>(Arrays.asList("Москва",
                "Казань", "Ростов", "Питер", "Воронеж", "Архангельск", "Сочи", "Красноярск", "Мурманск", "Пермь"));
        System.out.println("10 городов: " + linkedList);
        System.out.println("Добавляем 5 городов в начало: ");
        linkedList.addFirst("Вивек");
        linkedList.addFirst("Балмора");
        linkedList.addFirst("Садрит Мора");
        linkedList.addFirst("Гнисис");
        linkedList.addFirst("Сайда Нин");
        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println("Добавляем 5 городов в конец: ");
        linkedList.addLast("Оргриммар");
        linkedList.addLast("Андерсити");
        linkedList.addLast("Штормград");
        linkedList.addLast("Стальнгорн");
        linkedList.addLast("Тандер Блафф");
        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println("Удаление 3 городов в начале:");
        for (int i = 0; i < 3; i++) {
            linkedList.removeFirst();
        }
        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println("Удаляем 4 города в конце: ");
        for (int i = 0; i < 4; i++) {
            linkedList.removeLast();
        }
        System.out.println(Arrays.toString(linkedList.toArray()));
    }
}
