package com.sstore.secondstore.util;

public class GetSet {
    int id;
    String name;
    String imageName;

    public GetSet(int id, String name, String imageName)
    {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
    }

    public int getId(){
        return id;
    }public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }public void setName(String name){
        this.name = name;
    }

    public String getImageName(){
        return imageName;
    }public void setImageName(String imageName){
        this.imageName = imageName;
    }
}
