package com.example.recycle_view_hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle_view_hw_3.R;

public class MobilePhonesVH extends RecyclerView.ViewHolder{

    private TextView tvMobPhone;

    public MobilePhonesVH(@NonNull View itemView) {
        super(itemView);
        tvMobPhone = itemView.findViewById(R.id.tv_Mobile_Phones);
    }

    public void bind1(String mobilePhones) {
        tvMobPhone.setText(mobilePhones);
    }
}
