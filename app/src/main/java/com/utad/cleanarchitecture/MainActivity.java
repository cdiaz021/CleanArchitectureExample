package com.utad.cleanarchitecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.utad.cleanarchitecture.data.repository.NoteRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NoteRepository.addNote("hola",System.currentTimeMillis());

    }
}
