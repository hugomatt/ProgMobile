package com.example.progmobile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chiens {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
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

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
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

