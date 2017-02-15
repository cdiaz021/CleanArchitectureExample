package com.utad.cleanarchitecture.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.utad.cleanarchitecture.R;
import com.utad.cleanarchitecture.view.add.AddNoteActivity;
import com.utad.cleanarchitecture.view.listnotes.ListNotesActivity;

public class MainActivity extends AppCompatActivity {

    private Button insert, list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insert = (Button) findViewById(R.id.button_insert);
        list = (Button) findViewById(R.id.button_list);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddNoteActivity.class));
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListNotesActivity.class));
            }
        });
    }
}
