public class Employee {
    String name;
    String surname;

    Employee() {

    }

    Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", surname: " + surname);
    }
}
