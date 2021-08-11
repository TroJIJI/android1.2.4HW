package com.example.android124hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.ViewHolder> {
    private ArrayList<Song> list ;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    public void setList(ArrayList<Song> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name,music,time,number;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            music=itemView.findViewById(R.id.song);
            number=itemView.findViewById(R.id.number);
            time=itemView.findViewById(R.id.time);
        }

        public void onBind(Song song) {
            name.setText(song.getName());
            time.setText(song.getTime());
            music.setText(song.getSong());
            number.setText(song.getNumber());

        }
    }
}
