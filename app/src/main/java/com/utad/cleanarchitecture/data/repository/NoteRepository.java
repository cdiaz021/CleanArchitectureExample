package com.utad.cleanarchitecture.data.repository;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.utad.cleanarchitecture.data.Note;

import java.util.List;

/**
 * Created by cdiaz on 15/2/17.
 */

public class NoteRepository {


    public static void addNote(String text, long timestamp){
        Note newNote = new Note();
        newNote.setText(text);
        newNote.setTimestamp(timestamp);
        newNote.save();
    }

    public static void deleteNote(long timestamp){
        new Delete().from(Note.class).where("date = ?", timestamp).execute();
    }

    public static List<Note> listNotes(){
        return new Select().from(Note.class).orderBy("Date ASC").execute();
    }



}
