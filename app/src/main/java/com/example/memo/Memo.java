package com.example.memo;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class Memo {

    private String title;
    private String contents;
    private List<Drawable> image;

    public Memo(String title, String contents){
        this.title = title;
        this.contents = contents;
        image = new ArrayList<Drawable>();
        int hellos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public List<Drawable> getImage() {
        return image;
    }

    public void setImage(List<Drawable> image) {
        this.image = image;
    }
}