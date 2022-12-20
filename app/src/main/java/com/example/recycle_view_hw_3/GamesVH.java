package com.example.recycle_view_hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class GamesVH extends RecyclerView.ViewHolder {

    private TextView tvGame;

    public GamesVH(@NonNull View itemView) {
        super(itemView);
        tvGame = itemView.findViewById(R.id.tv_game);
    }

    public void bind(String game){
        tvGame.setText(game);
    }

}
