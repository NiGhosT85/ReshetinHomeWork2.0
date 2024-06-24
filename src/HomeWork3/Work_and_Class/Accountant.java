package HomeWork3.Work_and_Class;

public class Accountant extends Worker{
    public Accountant(String name, String lastName) {
        super(name, lastName, "бухглатер ");
    }

    @Override
    public void goToWork() {
        System.out.println(getName() + " " + getLastName() + " " + getProfession() + "Сводит дебит с кредитом.");
    }

    @Override
    public void goToVacation(int days) {
        System.out.println(getName() + " " + getLastName() + " уходит в отпуск на " + days + " дней.");
    }
}
