package com.company;

import java.util.*;

public class Costumer {

    private String name;
    private int post;
    private String start;
    private int duration;
    private Main.Games gameName;
    private int amount;
    private int id;
    List<HashMap> costumers= new ArrayList();
    int number = 1;

    public void IsAvailible(){


        if(costumers.size() < 7){
            addCostumer ();

        } else if (costumers.size() < 17){
            System.out.print("No more post available new client will wait in the lobby \n");
            addCostumer();
            System.out.print("You are number " +  number + " in the queue \n");
            number++;
        } else {
            System.out.print("No more post available\n");
        }
    }

    //add costumer
    public void addCostumer() {

        HashMap costumer = new HashMap();
        Scanner scanner = new Scanner(System.in);	//Scanner declaration
        Random random = new Random();
        int n = 99999;
        int id = random.nextInt(n);

        System.out.print("Name : \n");
        name = scanner.nextLine();


        System.out.print("start : \n");
        start = scanner.nextLine();

        System.out.print("duration : \n");
        duration = scanner.nextInt();

        scanner.nextLine();

        System.out.print("gameName : \n");
        System.out.print("1." + Main.Games.PES.label + "\n");
        System.out.print("2." + Main.Games.FIFA.label + "\n");
        System.out.print("3." + Main.Games.COD.label + "\n");
        System.out.print("4." + Main.Games.GOW.label + "\n");
        System.out.print("5." + Main.Games.FORZA.label + "\n");
        System.out.print("6." + Main.Games.RDR.label + "\n");
        System.out.print("7." + Main.Games.MARIO.label + "\n");
        int game = scanner.nextInt();

        gameName= Main.Games.values()[game - 1];
        switch (game){

            case 1: gameName = Main.Games.PES; break;
            case 2: gameName = Main.Games.FIFA; break;
            case 3: gameName = Main.Games.COD; break;
            case 4: gameName = Main.Games.GOW; break;
            case 5: gameName = Main.Games.FORZA; break;
            case 6: gameName = Main.Games.RDR; break;
            case 7: gameName = Main.Games.MARIO; break;

        };


        switch (duration) {
            case 30 : amount = 5; break;
            case 1 : amount = 10; break;
            case 2 : amount = 18; break;
            case 5 : amount = 40; break;
            case 9 : amount = 65; break;
        }

        costumer.put("name",name);
        costumer.put("post",post);
        costumer.put("duration",duration);
        costumer.put("gameName",gameName);
        costumer.put("id",id);

        costumers.add(costumer);
    }

    //show costumers
    public void showCostumers() {
        for (HashMap costumer : costumers) {
            System.out.println(costumer);
        }
    }

    //total Amount
    public int totalAmount() {
        int total = 0;
        for (HashMap costumer : costumers) {
            total += (int) costumer.get("amount");
        }
        return total;
    }

    //delete costumer
    public void deleteCostumer(int id) {
        for (HashMap costumer : costumers) {
            if ((int) costumer.get("id") == id) {
                costumers.remove(costumer);
            }
        }
    }




}
