package com.example.tema2;

import android.content.Context;

public class UserRepository
{
    private TemaDoiDatabase temaDoiDatabase;

    public UserRepository(Context context) {
        temaDoiDatabase = ApplicationController.getAppDatabase();
    }

    public void insertTask(final User user, final OnUserRepositoryActionListener listener)
    {
//        new InsertTask(listener).execute(user);
    }

    public User getUserByName(String firstName, String lastName)
    {
        return temaDoiDatabase.myDao().findByName(firstName, lastName);
    }

}
