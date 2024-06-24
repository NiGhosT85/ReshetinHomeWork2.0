package HomeWork3.Work_and_Class;

public class Engineer extends Worker{
    public Engineer(String name, String lastName) {
        super(name, lastName, "нженер ");
    }

    @Override
    public void goToWork() {
        System.out.println(getName() + " " + getLastName() + " " + getProfession()
                + "проводит диагностику оборудования.");
    }

    @Override
    public void goToVacation(int days) {
        System.out.println(getName() + " " + getLastName() + " уходит в отпуск на " + days + " дней.");
    }
}
