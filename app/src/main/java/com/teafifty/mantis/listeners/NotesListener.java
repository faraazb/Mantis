package com.teafifty.mantis.listeners;

import com.teafifty.mantis.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
