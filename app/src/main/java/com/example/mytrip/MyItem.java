package com.example.mytrip;

import android.graphics.drawable.Drawable;

public class MyItem {

    private Drawable icon;
    private String name;
    private String contents;

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable img) {
        this.icon = icon;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}
