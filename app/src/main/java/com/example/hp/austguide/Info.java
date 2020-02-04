package com.example.hp.austguide;

/**
 * Created by HP on 8/6/2017.
 */

public class Info {
    int _id;
    String name, email, uname,pass;


    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_id() {
        return  this. _id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this. name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return this.uname;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return this.pass;
    }
}
