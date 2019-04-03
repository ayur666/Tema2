package com.example.tema2;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class TemaDoiDatabase extends RoomDatabase
{
    public abstract MyDao myDao();
}
