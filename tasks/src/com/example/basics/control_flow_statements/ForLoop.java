package com.example.basics.control_flow_statements;

public class ForLoop {
    public static void main(String[] args) {

        int arr[] = {1, 5, 10, 15, 20};

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);


        String names[] = {"Ola", "Adam", "Kasia"};

        for (int i = names.length-1; i >= 0; i--){
            System.out.println(names[i]);
        }




    }
}
