package com.shakir.notetaking;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "note_table")  //By writing this annotation, I will Enable The room Db to Write The Necessary code in the background for this application
public class Note {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String title;

    public String description;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }
}
