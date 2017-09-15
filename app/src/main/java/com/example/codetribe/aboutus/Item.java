package com.example.codetribe.aboutus;

/**
 * Created by codetribe on 9/11/2017.
 */
public class Item {

    String  peopleListName;
    int peopleListImage;

    public Item(String peopleName,int peopleImage)
    {
        this.peopleListImage=peopleImage;
        this.peopleListName=peopleName;
    }
    public String getPeopleName()
    {
        return peopleListName;
    }
    public int getpeopleImage()
    {
        return peopleListImage;
    }
}


