package HomeWork3.Work_and_Class;

public class Builder extends Worker{
    public Builder(String name, String lastName) {
        super(name, lastName, "строитель ");
    }

    @Override
    public void goToWork() {
        System.out.println(getName() + " " + getLastName() + " " + getProfession() + "кладет кирпичную кладку.");
    }

    @Override
    public void goToVacation(int days) {
        System.out.println(getName() + " " + getLastName() + " уходит в отпуск на " + days + " дней.");
    }
}
