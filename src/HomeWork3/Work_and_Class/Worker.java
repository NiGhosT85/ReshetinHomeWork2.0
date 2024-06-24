package HomeWork3.Work_and_Class;

public class Worker {
    private String name;
    private String lastName;
    private String profession;

    public Worker(String name, String lastName, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
    }

    public void goToWork() {
        System.out.println(name + " " + lastName + " работает " + profession);
    }

    public void goToVacation(int days) {
        System.out.println(name + " " + lastName + " идет в отпуск на " + days + " дней.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
