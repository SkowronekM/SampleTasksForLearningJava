class Tv {

    String producent;
    String model;
    int year;
    float wage;

    public void printBasicData(){
        System.out.println(this.producent + " " + this.model + " " + this.year + " " + this.wage);
    }

}

public class Main {
    public static void main(String[] args) {

        Tv sharp = new Tv();
        sharp.producent = "Sharp";
        sharp.model = "33dd3";
        sharp.year = 2021;
        sharp.wage = 22.3f;
        sharp.printBasicData();

    }
}