public class Director extends Employee{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public Director(String firstname, String lastName, int salary, int bonus) {
        super(firstname, lastName, salary);
        this.bonus = bonus;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(bonus);
    }

    @Override
    int salary() {
        return super.salary()+bonus;
    }
}
