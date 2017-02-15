package com.utad.cleanarchitecture.view.listnotes;

import android.content.Context;

import com.utad.cleanarchitecture.data.Note;
import com.utad.cleanarchitecture.data.repository.NoteRepository;

import java.util.List;

/**
 * Created by cdiaz on 15/2/17.
 */

public class ListNotesPresenter {


    public interface ListNotesPresenterCallback{
        void onSuccess(List<Note> noteList);
        void onError();
    }


    private Context context;
    private ListNotesPresenterCallback listNotesPresenterCallback;

    public ListNotesPresenter(Context context){
        this.context = context;
    }


    public void attach(ListNotesPresenterCallback listNotesPresenterCallback){
        this.listNotesPresenterCallback = listNotesPresenterCallback;
    }

    public void execute(){

        List<Note> noteList = NoteRepository.listNotes();
        if(noteList!=null){
            listNotesPresenterCallback.onSuccess(noteList);
        }
        else{
            listNotesPresenterCallback.onError();
        }
    }

}
