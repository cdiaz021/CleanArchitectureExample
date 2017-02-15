package com.utad.cleanarchitecture.view.add;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.utad.cleanarchitecture.R;

/**
 * Created by cdiaz on 15/2/17.
 */

public class AddNoteActivity extends AppCompatActivity implements AddNotePresenter.AddNotePresenterCallback {


    private AddNotePresenter addNotePresenter;
    EditText editText
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add_note_activity);

        editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        addNotePresenter = new AddNotePresenter(this);
        addNotePresenter.attach(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotePresenter.addNote(editText.getText().toString(), System.currentTimeMillis());
            }
        });


    }

    @Override
    public void onSuccess() {
        Toast.makeText(this,"Inserción ok",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {
        Toast.makeText(this,"Inserción KO",Toast.LENGTH_SHORT).show();
    }
}
