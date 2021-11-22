package com.company;

import java.util.*;

public class Costumer {

    private String name;
    private int post;
    private String start;
    private int duration;
    private String gameName;
    private int amount;
    private int id;
    List<HashMap> costumers= new ArrayList();

    //add costumer
    public void addCostumer() {

        HashMap costumer = new HashMap();
        Scanner scanner = new Scanner(System.in);	//Scanner declaration
        Random random = new Random();
        int n = 99999;
        int id = random.nextInt(n);

        System.out.print("Name : \n");
        name = scanner.nextLine();


        System.out.print("post : \n");
        post = scanner.nextInt();

        scanner.nextLine();

        System.out.print("start : \n");
        start = scanner.nextLine();

        System.out.print("duration : \n");
        duration = scanner.nextInt();

        scanner.nextLine();

        System.out.print("gameName : \n");
        gameName = scanner.nextLine();

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


}
