package com.company;

import java.util.HashMap;
import java.util.List;

public class Post {

    private int id;
    private String game;



    //constructor
    public Post(int id, String game) {
        this.id = id;
        this.game = game;
    }
    // is post available
    public boolean isAvailable(HashMap<Integer, List<Integer>> reservations) {
        if (reservations.containsKey(id)) {
            return false;
        }
        return true;
    }
}


