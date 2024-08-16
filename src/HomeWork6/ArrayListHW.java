package HomeWork6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListHW {
//    Создать ArrayList и добавьте в него 10 имен (строк).
//    Вставить новое имя на пятый индекс
//    Удалить пятое имя в списке
//    Проверить, содержит ли список имя "Иван" и вывести результат на экран
//    Вывести на экран элемент под 9 индексом
//    Заменить четвертый элемент на имя "Тарас"
//    Создать итератор на основе списка и обойти весь список с помощью него. При обходе выводить имена.
//    Получить подсписок с пятого по 9 элемент
//    Создать второй список имен и добавить все имена из одного списка в другой
//    Потом удалить все имена, которые содержатся в другом списке

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("Алексей", "Егор", "Анна",
                "Алиса", "Виталий", "Дмитрий", "Виктор", "Денис", "Ольга", "Николай"));
        System.out.println("Десять имен в аррей лист: " + arrayList);
        arrayList.add(5, "Олег");
        arrayList.remove(4);
        System.out.println("Замена имени Виталий на Олег: " + arrayList);
        System.out.println(arrayList.contains("Иван"));
        System.out.println("Имя под индексом #9: " + arrayList.get(9));
        arrayList.set(3,"Тарас");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print("Вывод обхода имен: ");
            System.out.println(iterator.next()+ " ");
        }
        List<String> condArrayList =new ArrayList<>(arrayList.subList(4,8));
        System.out.println("Имена с пятого по 9 элемент: " + condArrayList);
        List<String> arrayList2 = new ArrayList<>(arrayList);
        arrayList2.removeAll(condArrayList);
        System.out.println(arrayList);
    }
}
