package HomeWork4;

public class Main {
    public static void main(String[] args) {
    Program[] program = new Program[]{
            new Program("Новости"),
            new Program("Погода")
    };
    Program[] program_2 = new Program[]{
            new Program("Вести24"),
            new Program("Документальный фильм")
    };
    Program[] program_3 = new Program[]{
            new Program("Перехват"),
            new Program("Программа Город")
    };
    Program[] program_4 = new Program[]{
            new Program("12 злобных зрителей"),
            new Program("Музыкальный клип")
    };
    Program[] program_5 = new Program[]{
            new Program("Симпсоны"),
            new Program("Футурама")
    };

    Television television = new Television(
            new Channel("(1) Первый канал", program),
            new Channel("(2) Россия", program_2),
            new Channel("(3) Эфир", program_3),
            new Channel("(4) MTV", program_4),
            new Channel("(5) 2х2", program_5)
    );

    Remote remote = new Remote(television);
    remote.onTelevision();
}
}
