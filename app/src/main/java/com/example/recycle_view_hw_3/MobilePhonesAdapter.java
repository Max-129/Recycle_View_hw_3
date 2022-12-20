package com.example.recycle_view_hw_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle_view_hw_3.R;

import java.util.ArrayList;

public class MobilePhonesAdapter extends RecyclerView.Adapter<MobilePhonesVH> {

    private ArrayList<String> mobilePhonesList;

    public MobilePhonesAdapter(ArrayList<String> mobilePhonesList) {
        this.mobilePhonesList = mobilePhonesList;
    }

    @NonNull
    @Override
    public MobilePhonesVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MobilePhonesVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mobile_phones, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MobilePhonesVH viewHolder, int position) {
        viewHolder.bind1(mobilePhonesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mobilePhonesList.size();
    }
}
