package HomeWork3.Work_and_Class;

public class Main {
    public static void main(String[] args) {
        Manager human1 = new Manager("Алексей", "Алексеев");
        Engineer human2 = new Engineer("Егор", "Егоров");
        Builder human3 = new Builder("Иван", "Иванов");
        Accountant human4 = new Accountant("Петр", "Петров");

        human1.goToWork();
        human1.goToVacation(7);
        human2.goToWork();
        human2.goToVacation(14);
        human3.goToWork();
        human3.goToVacation(8);
        human4.goToWork();
        human4.goToVacation(5);
    }
}
