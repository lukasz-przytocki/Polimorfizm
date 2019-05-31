public class Test {
    public static void main(String[] args) {
        Employee[] person = new Employee[2];
        person[0] = new Employee("Marek","Nowak",4000);
        person[1] = new Director("Jan", "Kowalski", 6000, 1000);

        for (int i = 0; i <person.length ; i++) {
            person[i].printInfo();

        }
        int totalSalary=0;


        for (int i = 0; i <person.length ; i++) {

            totalSalary+=person[i].salary();
        }
        System.out.println("Total salary " + totalSalary);

        System.out.println(salaryLimit(person,6000));
        }

        static int salaryLimit(Employee[] emp,int salaryLimit){
            int employeBeyondSalaryLimit=0;
        for (int i = 0; i <emp.length ; i++) {
            if(emp[i].salary()>salaryLimit){
                employeBeyondSalaryLimit++;
            }
        }
        return employeBeyondSalaryLimit;

    }
}
