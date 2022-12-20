package com.example.recycle_view_hw_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SocialNetworksAdapter extends RecyclerView.Adapter<SocialNetworksVH> {

    private ArrayList<String> socialNetworksList;

    public SocialNetworksAdapter(ArrayList<String> socialNetworksList) {
        this.socialNetworksList = socialNetworksList;
    }

    @NonNull
    @Override
    public SocialNetworksVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SocialNetworksVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_social_net, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SocialNetworksVH viewHolder, int position) {
        viewHolder.bind2(socialNetworksList.get(position));
    }

    @Override
    public int getItemCount() {
        return socialNetworksList.size();
    }
}
