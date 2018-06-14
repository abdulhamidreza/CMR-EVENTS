package com.example.hamid.cmr3;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by hamid on 23/12/17.
 */

@IgnoreExtraProperties
public class User {

    public String title,name,number,idno,collage,gender;




    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String title,String name, String number,String idno,String collage,String gender) {
        this.title=title;
        this.name = name;
        this.number = number;
        this.idno=idno;
        this.collage=collage;
        this.gender=gender;
    }
}


