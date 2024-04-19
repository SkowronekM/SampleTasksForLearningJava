public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("On", "Ona");
        Administrator administrator = new Administrator("Kuba", "Pasiak", "all");
        Programmer programmer = new Programmer("Michał", "Skowronek", "all");

        employee.printInfo();
        administrator.printInfo();
        programmer.printInfo();

    }
}