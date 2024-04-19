package com.example.basics.control_flow_statements;

public class SwitchInstruction {

    enum variant {SEDAN, COMBI, SPORT};

    public static void main(String[] args) {

        int num = 10;

        switch (num) {
            case 1:
                System.out.println(1);
                System.out.println(" ok");
                break;
            case 3:
                System.out.println(3);
                break;
            case 10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
                break;
            default:
                System.out.println("default: " + num);
        }

        String str = "Ania";

        switch (str) {

            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println("Ania");
                break;
            default:
                System.out.println("Default: " + str);

        }

        variant car = variant.COMBI;

        switch (car){
            case COMBI:
                System.out.println("Combi");
                break;
            case SEDAN:
                System.out.println("Sedan");
                break;
            case SPORT:
                System.out.println("Sport");
                break;
            default:
                System.out.println("Default " + car);
        }



    }
}
