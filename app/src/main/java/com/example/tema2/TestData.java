package com.example.tema2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static User[] userList = ApplicationController.getAppDatabase().myDao().getAll();

    public static String[] userListToDisplay = new String[userList.length];

    public static String[] testList = new String[]{"one","two","three", "four"};

    TestData()
    {
        for(int i = 0; i < userList.length; i++)
        {
            userListToDisplay[i] = userList[i].getFirstName() + " " + userList[i].getLastName() + "meh";
        }
    }

}
