public class Employee extends Person{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Employee(String firstname, String lastName, int salary) {
        super(firstname, lastName);
        this.salary = salary;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(salary);
    }

    int salary(){
        return salary;
    }
}
