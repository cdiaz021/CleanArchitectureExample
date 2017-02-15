package com.utad.cleanarchitecture.view.listnotes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.utad.cleanarchitecture.R;
import com.utad.cleanarchitecture.data.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cdiaz on 15/2/17.
 */

public class ListNotesActivity extends AppCompatActivity implements ListNotesPresenter.ListNotesPresenterCallback{

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private List<String> noteList;

    private ListNotesPresenter listNotesPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_notes_activity);


        listView = (ListView) findViewById(R.id.listView);

        noteList = new ArrayList<>();

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, noteList);


        listView.setAdapter(arrayAdapter);



        listNotesPresenter = new ListNotesPresenter(this);
        listNotesPresenter.attach(this);


    }


    @Override
    protected void onResume() {
        super.onResume();
        listNotesPresenter.execute();

    }

    @Override
    public void onSuccess(List<Note> noteList) {
        this.noteList.clear();
        for (Note note : noteList){
            this.noteList.add(note.getText());
        }
        arrayAdapter.notifyDataSetChanged();
    }

    @Override
    public void onError() {
        Toast.makeText(this, "Error al cargar elementos",Toast.LENGTH_SHORT).show();
    }
}
