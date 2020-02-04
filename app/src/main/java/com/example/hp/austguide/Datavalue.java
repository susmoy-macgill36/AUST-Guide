package com.example.hp.austguide;

/**
 * Created by HP on 8/9/2017.
 */

public class Datavalue {
    private int id;
    private String name;
    private String date;

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
    public Datavalue(String n, String d ){
        name = n;
        date = d;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
