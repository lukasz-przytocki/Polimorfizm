public class Person {
    private String firstname;
    private String lastName;

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstname, String lastName) {
        super();
        this.firstname = firstname;
        this.lastName = lastName;
    }

    void printInfo(){
        System.out.print(firstname+ " " + lastName+ " ");
    }
}
