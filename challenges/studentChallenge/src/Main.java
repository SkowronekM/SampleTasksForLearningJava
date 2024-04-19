class Student {

    String name;
    String surname;
    String city;
    int age;

    public Student(){
        this.name = "Jan";
        this.surname = "Kowalski";
        this.city = "XXX";
        this.age = 69;
    }

    public Student(String name, String surname, String city, int age){
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public void printBasicData(){
        System.out.println(this.name  + " " + this.surname + " " + this.city + " " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student uczen1 = new Student();
        uczen1.printBasicData();

        Student uczen2 = new Student("Kuba", "Wojewodzki", "Kraków", 55);
        uczen2.printBasicData();

    }
}