package HomeWork3.Work_and_Class;

public class Manager extends Worker{
    public Manager(String name, String lastName) {
        super(name, lastName, "менеджер ");
    }

    @Override
    public void goToWork() {
        System.out.println(getName() + " " + getLastName() + " " + getProfession() + "ищет клиентов в интернете.");
    }

    @Override
    public void goToVacation(int days) {
        System.out.println(getName() + " " + getLastName() + " уходит в отпуск на " + days + " дней.");
    }
}
