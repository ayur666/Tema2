package com.example.tema2;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListAdapter extends RecyclerView.Adapter {
    private ViewGroup parent;
    private int position;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        this.parent = parent;
        this.position = position;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_cell, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() { return  TestData.userListToDisplay.length;}
//    TestData.userListToDisplay.length;
    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView aTextView;

        public ListViewHolder(View itemView)
        {
            super(itemView);
            aTextView = (TextView) itemView.findViewById(R.id.itemtext);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position)
        {
            aTextView.setText(TestData.userListToDisplay[position]);
        }

        public void onClick(View view)
        {

        }
    }
}
