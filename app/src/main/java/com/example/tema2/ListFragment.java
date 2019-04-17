package com.example.tema2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ListFragment extends Fragment {
    private EditText FirstName, LastName;
    private Button addUser, deleteUser;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragmentlist, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ListRecyclerView);
        ListAdapter ListAdapter = new ListAdapter();
        recyclerView.setAdapter(ListAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        FirstName = view.findViewById(R.id.editFirstName);
        LastName = view.findViewById(R.id.editLastName);
        addUser = view.findViewById(R.id.button1);
        deleteUser = view.findViewById(R.id.button2);

        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = FirstName.getText().toString();
                String lastName = LastName.getText().toString();

                User user = new User();
                user.setFirstName(firstName);
                user.setLastName(lastName);

                ApplicationController.getAppDatabase().myDao().insertAll(user);
                Toast.makeText(getActivity(),"User added", Toast.LENGTH_SHORT).show();

                FirstName.setText("");
                LastName.setText("");
            }
        });

        // Listener for delete button
        deleteUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = FirstName.getText().toString();
                String lastName = LastName.getText().toString();

                User user = new User();
                user.setFirstName(firstName);
                user.setLastName(lastName);

                ApplicationController.getAppDatabase().myDao().delete(user);
                Toast.makeText(getActivity(),"User deleted", Toast.LENGTH_SHORT).show();

                FirstName.setText("");
                LastName.setText("");
            }
        });
        return view;
    }
}
