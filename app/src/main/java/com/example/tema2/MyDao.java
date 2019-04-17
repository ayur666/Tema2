package com.example.tema2;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface MyDao
{
//    @Insert
//    Long insertTask(User user);

    @Query("SELECT * FROM users")
    User[] getAll();

    @Query("SELECT * FROM users WHERE uid IN (:userIds)")
    User[] loadAllByIds(int[] userIds);

    @Query("SELECT * FROM users WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
//
//    @Query("SELECT * from users ORDER BY first_name ASC")
//    LiveData<List<User>> getAllUsers();

}
