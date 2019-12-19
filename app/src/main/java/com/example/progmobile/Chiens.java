package com.example.progmobile;

import android.graphics.Picture;
import android.media.Image;
import android.net.LinkAddress;
import android.widget.ImageView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

public class Chiens {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("race")
    @Expose
    private String race;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getPic() {
        return image;
    }
    public void setPic(String image) {
        this.image = image;
    }

    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }

    public String getRace(){
        return race;
    }
    public void setRace(String race){
        this.race=race;
    }
}

