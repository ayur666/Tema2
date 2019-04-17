package com.example.tema2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestData {


    public static User[] userList = ApplicationController.getAppDatabase().myDao().getAll();

    public static String[] userListToDisplay = getAllUsers();

    public static String[] testList = new String[]{"one","two","three", "four"};

    public TestData()
    {
        for(int i = 0; i < userList.length; i++)
        {
            userListToDisplay[i] = "caca";
            //userList[i].getFirstName()
            //+ " " + userList[i].getLastName() + "meh"
        }
    }

    public static String[] getAllUsers ()
    {
        String[] aux = new String[userList.length];
        for(int i = 0; i < userList.length; i++)
        {
            aux[i] = userList[i].getFirstName()+ " " + userList[i].getLastName();
        }
        return aux;
    }

}
