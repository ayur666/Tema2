package com.example.tema2;

import android.app.Application;

import androidx.room.Room;

public class ApplicationController extends Application
{
    private static ApplicationController mInstance;

    private static TemaDoiDatabase temaDoiDatabase;

    public static ApplicationController getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;

        // Get a database instance to work with
        temaDoiDatabase = Room.databaseBuilder(getApplicationContext(),
                TemaDoiDatabase.class, "users").build();
    }

    public static TemaDoiDatabase getAppDatabase(){
        return temaDoiDatabase;
    }

}
