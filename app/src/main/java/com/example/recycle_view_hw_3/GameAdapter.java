package com.example.recycle_view_hw_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GamesVH> {

    private ArrayList<String> gamesList;

    public GameAdapter(ArrayList<String> gamesList) {
        this.gamesList = gamesList;
    }

    @NonNull
    @Override
    public GamesVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GamesVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_games, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GamesVH viewHolder, int position) {
        viewHolder.bind(gamesList.get(position));
    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }
}
