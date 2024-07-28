package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class Remote implements IRemote{
    private Television television;
    private int cheсkHistory; // не могу понять как вытянуть правильно из телека?
    private int condition;
    private int[] history = new int[3];
    int indexHistory = condition;
    Random random = new Random();
    int rndPrg = random.nextInt(2);

    public Remote(Television television) {
        setTelevision(television);
        Random random = new Random();
    }

    @Override
    public void onTelevision() {
        television.getTurnOn();
        pushButtons();
    }

    @Override
    public void returnMenu() {
        System.out.println("Выберите для продолжения: " + "\n"
                + "1 чтобы продолжить" + "\n"
                + "Нажмите любую цифру для возврата в меню");
        Scanner scanner = new Scanner((System.in));
        int i;
        i = scanner.nextInt();
        if (i == 1) {
            switchByNumber();
        } else {
            pushButtons();
        }
    }

    @Override
    public void pushButtons() {
        setTelevision(television);
        Scanner scanner = new Scanner((System.in));
        int i;
        System.out.println("Нажмите для выбора нужного режима" + "\n"
                + "1 для переключения по номеру канала" + "\n"
                + "2 для переключения вперед или назад" + "\n"
                + "3 для перехода на канал прошлого сеанса");
        i = scanner.nextInt();
        if (i == 1) {
            switchByNumber();
        } else if (i == 2) {
            switchNextOrBack();
        } else if (i == 3) {
            turnHistory();
        } else {
            System.out.println("нет в меню выбора, возврат в главное меню!");
            pushButtons();
        }
    }

    @Override
    public void switchByNumber() {
        System.out.println("Введите номер канала: ");
        Scanner scanner = new Scanner(System.in);
        int i;
        i = scanner.nextInt() - 1;
        cheсkHistory = i;
        condition = i;
        history[indexHistory] = cheсkHistory;
        indexHistory = (indexHistory + 1) % 2;

        System.out.println("Включен: " + getTelevision().getChannels()[i].getChannelName());
        System.out.println("Транслируется: "
                + getTelevision().getChannels()[i].getPrograms()[rndPrg].getProgramName());
        returnMenu();
    }

    @Override
    public void switchNextOrBack() {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Нажмите 1 для переключения вперед" + "\n"
                + "2 для переключения назад" + "\n"
                + "любое число для возврата в меню");
        i = scanner.nextInt();
        if (i == 1) {
            if (condition <= 3) {
                condition = condition + 1;
                System.out.println("Переключаем вперед..." + "\n"
                        + "Включен: " + getTelevision().getChannels()[condition].getChannelName());
                System.out.println("Транслируется: "
                        + getTelevision().getChannels()[condition].getPrograms()[rndPrg].getProgramName());
                cheсkHistory = condition;
                history[indexHistory] = cheсkHistory;
                indexHistory = (indexHistory + 1) % 2;
                switchNextOrBack();
            } else {
                condition = 0;
                System.out.println("Каналы кончились возврат на первый канал..." + "\n"
                        + "Включен: " + getTelevision().getChannels()[condition].getChannelName());
                System.out.println("Транслируется: "
                        + getTelevision().getChannels()[condition].getPrograms()[rndPrg].getProgramName());
                cheсkHistory = condition;
                history[indexHistory] = cheсkHistory;
                indexHistory = (indexHistory + 1) % 2;
                switchNextOrBack();
            }
        } else if (i == 2) {
            condition = condition - 1;
            if (condition >= 0) {
                System.out.println("Переключаем назад..." + "\n"
                        + "Включен: " + getTelevision().getChannels()[condition].getChannelName());
                System.out.println("Транслируется: "
                        + getTelevision().getChannels()[condition].getPrograms()[rndPrg].getProgramName());
                cheсkHistory = condition;
                history[indexHistory] = cheсkHistory;
                indexHistory = (indexHistory + 1) % 2;
                switchNextOrBack();
            } else {
                condition = 4;
                System.out.println("Каналы кончились возврат на последний канал..." + "\n"
                        + "Включен: " + getTelevision().getChannels()[condition].getChannelName());
                System.out.println("Транслируется: "
                        + getTelevision().getChannels()[condition].getPrograms()[rndPrg].getProgramName());
                cheсkHistory = condition;
                history[indexHistory] = cheсkHistory;
                indexHistory = (indexHistory + 1) % 2;
                switchNextOrBack();
            }
//            else if (condition == 0){                              // как зацепиться за макс индекс массива? =_(
//                condition = 4;
//                System.out.println("Каналы кончились возврат на последний канал..."+"\n"
//                        + "Включен: " + getTelevision().getChannels()[condition].getChannelName());
//                System.out.println("Транслируется: "
//                        + getTelevision().getChannels()[condition].getPrograms()[rndPrg].getProgramName());
//                cheсkHistory = condition ;
//                history[indexHistory] = cheсkHistory;
//                indexHistory = (indexHistory + 1) % 2;
//                switchNextOrBack();}
        } else {
            System.out.println("нет в меню выбора, возврат в главное меню!");
            pushButtons();
        }
    }

    @Override
    public void turnHistory() {
        System.out.println("История просмотра : " + getTelevision().getChannels()[history[2]].getChannelName());
        System.out.println("Транслируется: "
                + getTelevision().getChannels()[history[2]].getPrograms()[rndPrg].getProgramName());
        System.out.println("Выберите для продолжения: " + "\n"
                + "1 для просмотра более раннего канала " + "\n"
                + "любое число для возврата в меню");
        Scanner scanner = new Scanner((System.in));
        int i;
        i = scanner.nextInt();
        if (i == 1) {
            System.out.println("История просмотра " + getTelevision().getChannels()[history[1]].getChannelName());
            System.out.println("Транслируется: "
                    + getTelevision().getChannels()[history[1]].getPrograms()[rndPrg].getProgramName());
            pushButtons();
        } else {
            pushButtons();
        }
    }

    @Override
    public void offTelevision() {
        System.out.println("Телевизор выключен!");
    }

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }
}
