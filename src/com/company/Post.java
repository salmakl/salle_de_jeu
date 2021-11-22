package com.company;

public class Post {

    private int id;
    private String game;

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    //constructor
    public Post(int id, String game) {
        this.id = id;
        this.game = game;
    }
}


