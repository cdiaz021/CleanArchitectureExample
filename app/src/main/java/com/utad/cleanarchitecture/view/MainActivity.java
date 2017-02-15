package com.utad.cleanarchitecture.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.utad.cleanarchitecture.R;
import com.utad.cleanarchitecture.view.add.AddNoteActivity;
import com.utad.cleanarchitecture.view.listnotes.ListNotesActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById
    Button button_insert;
    @ViewById
    Button button_list;


    @Click
    void button_insert(){
        startActivity(new Intent(MainActivity.this, AddNoteActivity.class));

    }
    @Click
    void button_list(){
        startActivity(new Intent(MainActivity.this, ListNotesActivity.class));
    }
}
