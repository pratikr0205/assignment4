package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdaptoo extends RecyclerView.Adapter<myAdaptoo.holder> {

    String data [];

    public myAdaptoo(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.singlerow,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
              holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class holder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tv;

        public holder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView)itemView.findViewById(R.id.img1);
            tv = (TextView) itemView.findViewById(R.id.textview1);
        }
    }
}
