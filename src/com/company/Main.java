package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Costumer costumer = new Costumer();
        Post post1= new Post(1,"fifa");
        int choice;

        System.out.println("make your choice \n");
        do {
            System.out.print("1. Add costumer \n");
            System.out.print("2. Costumers \n");
            System.out.print("3. Total gain \n");
            System.out.print("0. Exit \n");


            choice =  scanner.nextInt();

            switch (choice){
                case 1 : costumer.addCostumer(); break;
                case 2 : costumer.showCostumers(); break;
                case 3:
            }

        }while (choice !=0 );

    }
}
