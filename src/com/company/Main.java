package com.company;


import java.util.Scanner;

public class Main {
    //enum for the games in each console

    public enum Games {
        PES("Pro Evolution Soccer",1,2),
        FIFA("FIFA",2,1),
        COD("Call of Duty",3,4),
        GOW("God of War",4,3),
        FORZA("Forza Horizon",5,6),
        RDR("Read Dead Redemption",6,5),
        MARIO("Super Mario",7,3);

        public final String label;
        public final int p1;
        public final int p2;

        Games(String label, int p1,int p2) {
            this.label = label;
            this.p1 = p1;
            this.p2 = p2;
        }
    }


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
                case 1 : costumer.IsAvailible(); break;
                case 2 : costumer.showCostumers(); break;
                case 3:  costumer.totalAmount();break;
            }

        }while (choice !=0 );

    }
}
