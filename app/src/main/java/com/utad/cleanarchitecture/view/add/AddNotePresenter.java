package com.utad.cleanarchitecture.view.add;

import android.content.Context;

import com.utad.cleanarchitecture.data.repository.NoteRepository;

/**
 * Created by cdiaz on 15/2/17.
 */

public class AddNotePresenter {


    public interface AddNotePresenterCallback {
        void onSuccess();
        void onError();
    }

    private Context context;
    private AddNotePresenterCallback addNotePresenterCallback;

    public AddNotePresenter(Context context){
        this.context = context;
    }

    public void attach(AddNotePresenterCallback addNotePresenterCallback){
        this.addNotePresenterCallback = addNotePresenterCallback;
    }

    public void addNote(String text, long timestamp){
        NoteRepository.addNote(text, timestamp);
        addNotePresenterCallback.onSuccess();
    }
}
