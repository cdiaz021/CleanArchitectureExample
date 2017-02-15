package com.utad.cleanarchitecture.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by cdiaz on 15/2/17.
 */



@Table(name = "Notes")
public class Note extends Model{

    @Column(name = "date")
    long timestamp;
    @Column(name = "text")
    String text;


    public Note(){
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
