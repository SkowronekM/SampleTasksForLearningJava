public class Administrator extends Employee {
    String certificates;

    Administrator(String name, String surname, String certificates){
        this.name = name;
        this.surname = surname;
        this.certificates = certificates;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", surname: " + surname + ", certificates: " + certificates);
    }
}
